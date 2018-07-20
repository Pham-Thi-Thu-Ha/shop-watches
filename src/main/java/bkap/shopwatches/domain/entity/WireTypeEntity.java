package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "wireType")
public class WireTypeEntity   {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wireId")
    private Integer wireId;

    @Getter
    @Setter
    @Column(name = "nameWire")
    private String nameWire;

    @Getter
    @Setter
    @Column(name = "statusWire")
    private Byte statusWire;

    @Setter
    @Getter
    @OneToMany(mappedBy = "wireTypeEntity", fetch = FetchType.LAZY)
    private List<ProductWireTypeEntity> productWireTypeEntities;
}



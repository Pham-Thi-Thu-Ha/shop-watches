package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "catalogg")
public class CataLogEntity {


    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "catalogId")
    private Integer catalogId;

    @Getter
    @Setter
    @Column(name = "catalogName")
    private String catalogName;

    @Getter
    @Setter
    @Column(name = "catalogPriority")
    private Integer catalogPriority;

    @Getter
    @Setter
    @Column(name = "catalogStatus")
    private byte catalogStatus;



    @Setter
    @Getter
    @OneToMany(mappedBy = "productCataLogEntity", fetch = FetchType.LAZY)
    private List<ProductEntity> productEntities;

}

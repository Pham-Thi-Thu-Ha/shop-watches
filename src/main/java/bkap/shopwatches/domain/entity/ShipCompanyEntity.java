package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "shipCompany")
public class ShipCompanyEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipComId")
    private Integer shipComId;

    @Getter
    @Setter
    @Column(name = "nameComShip")
    private String nameComShip;

    @Getter
    @Setter
    @Column(name = "descriptionComShip")
    private String descriptionComShip;

    @Setter
    @Getter
    @OneToMany(mappedBy = "shipMethodCompanyEntity", fetch = FetchType.LAZY)
    private List<ShipMenthodEntity> shipMenthodEntities;

}

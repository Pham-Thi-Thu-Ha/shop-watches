package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shipMethod")
public class ShipMenthodEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipMethodId")
    private Integer shipMethodId;


    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "shipComId")
    private ShipCompanyEntity shipMethodCompanyEntity;

    @Setter
    @Getter
    @Column(name = "shipAmount")
    private Integer shipAmount;

    @Setter
    @Getter
    @Column(name = "distanceShip")
    private Float distanceShip;



    @Setter
    @Getter
    @OneToMany(mappedBy = "orderProductShipMethod", fetch = FetchType.LAZY)
    private List<OrderProductEntity> orderProductEntities;


}

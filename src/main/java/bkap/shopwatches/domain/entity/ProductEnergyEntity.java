package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "productEnergy")
public class ProductEnergyEntity {

    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity productId;

    @ManyToOne
    @JoinColumn(name = "energyId")
    private EnergyProductEntity energyId;


}

package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "EnergyProduct")
public class EnergyProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer energyId;

    @Column(name = "nameEnergy")
    private String nameEnergy;

    @Column(name = "statusEnergy")
    private Byte statusEnergy;
}

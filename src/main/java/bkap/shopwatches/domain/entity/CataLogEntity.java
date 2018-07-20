package bkap.shopwatches.domain.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "catalogg")
public class CataLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer catalogId;

    @Column(name = "catalogName")
    private String catalogName;


    @Column(name = "catalogPriority")
    private Integer catalogPriority;

    @Column(name = "catalogStatus")
    private byte catalogStatus;

    @OneToMany(mappedBy = "cataLogEntity",fetch = FetchType.LAZY)
    private List<CataLogEntity> cataLogEntities;


}

package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "companyProduct")
public class CompanyProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comProductId;

    @Column(name = "comProductName")
    private String comProductName;

    @Column(name = "comProductDescription")
    private String comProductDescription;
}

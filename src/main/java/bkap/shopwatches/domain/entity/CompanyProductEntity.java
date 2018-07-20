package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companyProduct")
public class CompanyProductEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comProductId")
    private Integer comProductId;


    @Getter
    @Setter
    @Column(name = "comProductName")
    private String comProductName;

    @Getter
    @Setter
    @Column(name = "comProductDescription")
    private String comProductDescription;

    @Setter
    @Getter
    @OneToMany(mappedBy = "productCompanyProductEntity", fetch = FetchType.LAZY)
    private List<ProductEntity> productEntities;
}

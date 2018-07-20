package bkap.shopwatches.domain.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @ManyToOne
    @JoinColumn(name = "catalogId")
    private CataLogEntity cataLogEntity;

    @ManyToOne
    @JoinColumn(name = "comProductId")
    private CompanyProductEntity companyProductEntity;

    @Column(name = "productName")
    private String productName;

    @Column(name = "priceProduct")
    private Float priceProduct;

    @Column(name = "descriptionProduct")
    private String descriptionProduct;

    @Column(name = "imageProduct")
    private String imageProduct;

    @Column(name = "viewProduct")
    private Integer viewProduct;

    @Column(name = "statusProduct")
    private Byte statusProduct;

    @Column(name = "discountProduct")
    private Float discountProduct;

    @Column(name = "from_datetodate_Product")
    private Date from_datetodate_Product;

}

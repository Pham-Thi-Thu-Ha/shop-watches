package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Product")
public class ProductEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private Integer productId;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "catalogId")
    private CataLogEntity productCataLogEntity;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "comProductId")
    private CompanyProductEntity productCompanyProductEntity;


    @Getter
    @Setter
    @Column(name = "productName")
    private String productName;

    @Getter
    @Setter
    @Column(name = "priceProduct")
    private Float priceProduct;

    @Getter
    @Setter
    @Column(name = "descriptionProduct")
    private String descriptionProduct;

    @Getter
    @Setter
    @Column(name = "imageProduct")
    private String imageProduct;

    @Getter
    @Setter
    @Column(name = "viewProduct")
    private Integer viewProduct;

    @Getter
    @Setter
    @Column(name = "statusProduct")
    private Byte statusProduct;

    @Getter
    @Setter
    @Column(name = "discountProduct")
    private Float discountProduct;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "from_datetodate_Product")
    private Date from_datetodate_Product;

    @Getter
    @Setter
    @Column(name = "energyproduct")
    private Byte energyproduct;


    @Setter
    @Getter
    @OneToMany(mappedBy = "saveProductproductEntity", fetch = FetchType.LAZY)
    private List<SaveProductEntity> saveProductEntities;

    @Setter
    @Getter
    @OneToMany(mappedBy = "producTwireTypeproductEntity", fetch = FetchType.LAZY)
    private List<ProductWireTypeEntity> productWireTypeEntities;

    @Setter
    @Getter
    @OneToMany(mappedBy = "orderDetailProduct", fetch = FetchType.LAZY)
    private List<OrderDetailEntity> orderDetailEntities;

    @Setter
    @Getter
    @OneToMany(mappedBy = "imgProductEntity", fetch = FetchType.LAZY)
    private List<ImageProductEntity> imageProductEntities;


     @Setter
    @Getter
    @OneToMany(mappedBy = "favoriteProductEntity", fetch = FetchType.LAZY)
    private List<FavoriteProductEntity> favoriteProductEntities;

     @Setter
    @Getter
    @OneToMany(mappedBy = "commandProduct", fetch = FetchType.LAZY)
    private List<CommandEntity> commandEntities;


}

package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "imageProductTable")
public class ImageProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imageId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity productEntity;

    @Column(name = "url")
    private String url;

    @Column(name = "statusImage")
    private Byte statusImage;
}

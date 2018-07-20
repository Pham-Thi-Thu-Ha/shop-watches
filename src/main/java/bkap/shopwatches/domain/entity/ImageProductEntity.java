package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "imageProductTable")
public class ImageProductEntity   {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "imageId")
    private Integer imageId;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity imgProductEntity;

    @Setter
    @Getter
    @Column(name = "url")
    private String url;

    @Setter
    @Getter
    @Column(name = "statusImage")
    private Byte statusImage;

    @Setter
    @Getter
    @OneToMany(mappedBy = "saveProductimageProductEntity", fetch = FetchType.LAZY)
    private List<SaveProductEntity> saveProductEntities;

}

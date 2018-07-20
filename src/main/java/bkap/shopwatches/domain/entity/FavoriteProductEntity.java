package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "favoriteProduct")
public class FavoriteProductEntity {

    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity productId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity userId;


    @Column(name = "statusFavoriteProduct")
    private Byte statusFavoriteProduct;

    @Column(name = "indexStar")
    private Float indexStar;
}

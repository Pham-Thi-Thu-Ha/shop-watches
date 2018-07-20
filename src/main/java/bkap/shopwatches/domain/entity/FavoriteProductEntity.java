package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "favoriteProduct")
public class FavoriteProductEntity implements Serializable {


    @Id
    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "productId")
    private ProductEntity favoriteProductEntity;

    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity favoriteProductUser;

    @Getter
    @Setter
    @Column(name = "statusFavoriteProduct")
    private Byte statusFavoriteProduct;

    @Getter
    @Setter
    @Column(name = "indexStar")
    private Float indexStar;
}

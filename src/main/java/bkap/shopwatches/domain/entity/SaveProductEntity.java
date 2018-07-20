package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "saveProduct")
public class SaveProductEntity implements Serializable {
    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity saveProductproductEntity;


    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity saveProductuserEntity;

    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "imageId")
    private ImageProductEntity saveProductimageProductEntity;
}



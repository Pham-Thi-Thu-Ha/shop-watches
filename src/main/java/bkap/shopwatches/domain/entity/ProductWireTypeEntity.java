package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "producTwireType")
public class ProductWireTypeEntity implements Serializable {
    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity producTwireTypeproductEntity;

    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "wireId")
    private WireTypeEntity wireTypeEntity;
}

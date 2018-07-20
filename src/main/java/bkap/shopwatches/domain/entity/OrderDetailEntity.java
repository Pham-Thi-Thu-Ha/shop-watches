package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "orderDetail")
public class OrderDetailEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderDetailProductId")
    private Integer orderDetailProductId;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "orderProductId")
    private OrderProductEntity orderDetailOrderPoduct;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity orderDetailProduct;

    @Getter
    @Setter
    @Column(name = "quantity")
    private Integer quantity;

    @Getter
    @Setter
    @Column(name = "amount")
    private Integer amount;
}

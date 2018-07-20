package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "orderProduct")
public class OrderProductEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderProductId")
    private Integer orderProductId;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "shipMethodId")
    private ShipMenthodEntity orderProductShipMethod;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "paymentId")
    private PaymentTypeEntity orderProductPayment;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity orderProductUser;

    @Getter
    @Setter
    @Column(name = "totalAmount")
    private Float totalAmount;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createOrder")
    private Date createOrder;

    @Getter
    @Setter
    @Column(name = "statusOrder")
    private Integer statusOrder;

    @Setter
    @Getter
    @OneToMany(mappedBy = "orderDetailOrderPoduct", fetch = FetchType.LAZY)
    private List<OrderDetailEntity> orderDetailEntities;

}

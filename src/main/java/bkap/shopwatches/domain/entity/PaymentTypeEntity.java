package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "paymentType")
public class PaymentTypeEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paymentId")
    private Integer paymentId;


    @Setter
    @Getter
    @Column(name = "paymentName")
    private String paymentName;

    @Setter
    @Getter
    @Column(name = "paymentMethod")
    private String paymentMethod;


    @Setter
    @Getter
    @OneToMany(mappedBy = "orderProductPayment", fetch = FetchType.LAZY)
    private List<OrderProductEntity> orderProductEntities;
}

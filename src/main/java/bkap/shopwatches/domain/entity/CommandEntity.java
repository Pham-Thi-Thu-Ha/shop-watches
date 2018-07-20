package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "command")
public class CommandEntity {
    @ManyToOne
    @JoinColumn(name = "productId")
    private Integer productId;
}

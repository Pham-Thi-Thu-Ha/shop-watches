package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "command")
public class CommandEntity  implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity commandProduct;

    @Id
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity commandUser;

    @Setter
    @Getter
    @Column(name = "content")
    private String content;

    @Setter
    @Getter
    @Column(name = "createCommand")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createCommand;

    @Setter
    @Getter
    @Column(name = "statusCommand")
    private Byte statusCommand;
}

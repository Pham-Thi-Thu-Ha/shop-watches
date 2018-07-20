package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Rin-DTS
 */
@Entity
@Table(name = "slideIndependend")
public class SlideIndependendEntity   {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "slideId")
    private Integer slideId;

    @Setter
    @Getter
    @Column(name = "status")
    private Byte status;

    @Setter
    @Getter
    @Column(name = "priority")
    private Integer priority;


}

package bkap.shopwatches.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "userTable")
public class UserEntity   {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private Integer userId;

    @Getter
    @Setter
    @Column(name = "userName")
    private String userName;

    @Getter
    @Setter
    @Column(name = "userMail")
    private String userMail;

    @Getter
    @Setter
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @Column(name = "userPhone")
    private String userPhone;

    @Getter
    @Setter
    @Column(name = "groupId")
    private Byte groupId;

    @Getter
    @Setter
    @Column(name = "userAddress")
    private String userAddress;

    @Getter
    @Setter
    @Column(name = "status")
    private Byte status;

    @Getter
    @Setter
    @Column(name = "userSex")
    private Integer userSex;

    @Setter
    @Getter
    @OneToMany(mappedBy = "saveProductuserEntity", fetch = FetchType.LAZY)
    private List<SaveProductEntity> saveProductEntities;

    @Setter
    @Getter
    @OneToMany(mappedBy = "orderProductUser", fetch = FetchType.LAZY)
    private List<OrderProductEntity> orderProductEntities;

    @Setter
    @Getter
    @OneToMany(mappedBy = "favoriteProductUser", fetch = FetchType.LAZY)
    private List<FavoriteProductEntity> favoriteProductEntities;

    @Setter
    @Getter
    @OneToMany(mappedBy = "commandUser", fetch = FetchType.LAZY)
    private List<CommandEntity> commandEntities;

}

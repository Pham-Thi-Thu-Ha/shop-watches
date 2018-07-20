package bkap.shopwatches.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "userTable")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userMail")
    private String userMail;

    @Column(name = "password")
    private String password;

    @Column(name = "userPhone")
    private Float userPhone;

    @Column(name = "groupId")
    private Byte groupId;

    @Column(name = "userAddress")
    private String userAddress;

    @Column(name = "status")
    private Byte status;


}

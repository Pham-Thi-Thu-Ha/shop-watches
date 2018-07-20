package testNG;

import bkap.shopwatches.domain.daoimpl.UserDaoImpl;
import bkap.shopwatches.domain.entity.UserEntity;
import org.testng.annotations.Test;

/**
 * @author Rin-DTS
 */

public class TestNG {

    @Test
    public void userTest()
    {
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("sfsd");
        userEntity.setPassword("dfsf");
        userEntity.setGroupId((byte) 1);
        userEntity.setStatus((byte) 1);
        userEntity.setUserAddress("sdfsf");
        userEntity.setUserPhone("sdfsf");
        userEntity.setUserSex(1);
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.save(userEntity);
        System.out.println();
    }
}

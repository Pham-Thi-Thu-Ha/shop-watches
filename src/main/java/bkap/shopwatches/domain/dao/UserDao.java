package bkap.shopwatches.domain.dao;

import bkap.shopwatches.domain.entity.UserEntity;

import java.util.List;

/**
 * @author Rin-DTS
 */
public interface UserDao extends GenericDao<Integer,UserEntity>{
    UserEntity checkLogin(String name, String password);
    List<UserEntity> findByUsers(List<String> names);
}

package bkap.shopwatches.service;

import bkap.shopwatches.domain.entity.UserEntity;

import java.util.List;

/**
 * @author Rin-DTS
 */
public interface UserService extends GenericService<Integer,UserEntity>{
    UserEntity checkLogin(String name, String password);
    List<UserEntity> findByUsers(List<String> names);
}

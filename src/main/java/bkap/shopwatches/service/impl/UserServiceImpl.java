package bkap.shopwatches.service.impl;

import bkap.shopwatches.domain.dao.GenericDao;
import bkap.shopwatches.domain.daoimpl.UserDaoImpl;
import bkap.shopwatches.domain.entity.UserEntity;
import bkap.shopwatches.service.UserService;
import bkap.shopwatches.utils.SingletonDaoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Rin-DTS
 */
@Service
public class UserServiceImpl implements UserService {

    public List<UserEntity> findAll() {
        return SingletonDaoUtil.getUserDaoInstance().findAll();
    }

    public UserEntity update(UserEntity entity) {
        return SingletonDaoUtil.getUserDaoInstance().update(entity);
    }

    public UserEntity save(UserEntity entity) {
        return SingletonDaoUtil.getUserDaoInstance().save(entity);
    }

    public UserEntity findById(Integer id) {
        return SingletonDaoUtil.getUserDaoInstance().findById(id);
    }

    public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit, String whereClause) {
        return SingletonDaoUtil.getUserDaoInstance().findByProperty(property, sortExpression, sortDirection, offset, limit, whereClause);
    }

    public Integer delete(List<Integer> ids) {
        return SingletonDaoUtil.getUserDaoInstance().delete(ids);
    }

    public UserEntity checkLogin(String name, String password) {
        return SingletonDaoUtil.getUserDaoInstance().checkLogin(name,password);
    }

    public List<UserEntity> findByUsers(List<String> names) {
        return SingletonDaoUtil.getUserDaoInstance().findByUsers(names);
    }
}

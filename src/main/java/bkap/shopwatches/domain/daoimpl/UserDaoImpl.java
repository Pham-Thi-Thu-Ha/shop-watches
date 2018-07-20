package bkap.shopwatches.domain.daoimpl;

import bkap.shopwatches.domain.dao.UserDao;
import bkap.shopwatches.domain.entity.UserEntity;
import bkap.shopwatches.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rin-DTS
 */

@Repository
public class UserDaoImpl extends AbstractDao<Integer, UserEntity> implements UserDao {
    public UserEntity checkLogin(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        UserEntity userEntity = null;
        try {
            StringBuilder sql = new StringBuilder(" FROM UserEntity ue WHERE ue.userName= :username AND ue.password= :password");
            Query query = session.createQuery(sql.toString());
            query.setParameter("username", username);
            query.setParameter("password", password);
            if (query.list().size() > 0) {
                userEntity = (UserEntity) query.uniqueResult();
            }
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return userEntity;
    }

    public List<UserEntity> findByUsers(List<String> names) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<UserEntity> userEntities;
        try {
            StringBuilder sql = new StringBuilder(" FROM UserEntity ue WHERE ue.userName IN(:names) ");
            Query query = session.createQuery(sql.toString());
            query.setParameterList("names", names);
            userEntities = query.list();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return userEntities;
    }
}

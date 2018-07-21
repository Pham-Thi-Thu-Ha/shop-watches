package bkap.shopwatches.utils;
import bkap.shopwatches.domain.daoimpl.UserDaoImpl;
public class SingletonDaoUtil {
    private static UserDaoImpl userDaoImpl = null;

    public static UserDaoImpl getUserDaoInstance() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }


}

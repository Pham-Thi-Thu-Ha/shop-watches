package bkap.shopwatches.utils;

import bkap.shopwatches.domain.daoimpl.UserDaoImpl;

/**
 * Created by Admin on 2/9/2017.
 */
public class SingletonDaoUtil {
    private static UserDaoImpl userDaoImpl = null;



//    private static RoleDaoImpl roleDaoImpl = null;
//    private static ListenGuidelineDaoImpl listenGuidelineDaoImpl = null;
//    private static CommentDaoImpl commentDaoImpl = null;
//    private static ExaminationDaoImpl examinationDaoImpl = null;
//    private static ExaminationQuestionDaoImpl examinationQuestionDaoImpl = null;
//    private static ExerciseDaoImpl exerciseDaoImpl = null;
//    private static ExerciseQuestionDaoImpl exerciseQuestionDaoImpl = null;
//    private static ResultDaoImpl resultDaoImpl = null;



    public static UserDaoImpl getUserDaoInstance() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }


}

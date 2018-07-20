package bkap.shopwatches.domain.daoimpl;

import bkap.shopwatches.domain.dao.CataloggDao;
import bkap.shopwatches.domain.entity.CataLogEntity;
import org.springframework.stereotype.Repository;

/**
 * @author Rin-DTS
 */
@Repository
public class CataloggDaoImpl extends AbstractDao<Integer,CataLogEntity> implements CataloggDao {
}

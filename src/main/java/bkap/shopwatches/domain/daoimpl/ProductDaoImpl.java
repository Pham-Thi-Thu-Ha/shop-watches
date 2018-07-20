package bkap.shopwatches.domain.daoimpl;

import bkap.shopwatches.domain.dao.ProductDao;
import bkap.shopwatches.domain.entity.ProductEntity;
import org.springframework.stereotype.Repository;

/**
 * @author Rin-DTS
 */
@Repository
public class ProductDaoImpl extends AbstractDao<Integer, ProductEntity> implements ProductDao {
}

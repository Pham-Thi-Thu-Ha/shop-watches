package bkap.shopwatches.domain.daoimpl;

import bkap.shopwatches.domain.dao.ImageProductDao;
import bkap.shopwatches.domain.entity.ImageProductEntity;
import org.springframework.stereotype.Repository;

/**
 * @author Rin-DTS
 */
@Repository
public class ImageProductDaoImpl extends AbstractDao<Integer,ImageProductEntity> implements ImageProductDao {
}

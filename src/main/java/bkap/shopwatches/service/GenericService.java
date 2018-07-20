package bkap.shopwatches.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Rin-DTS
 */
public interface GenericService< ID extends Serializable,T > {
    List<T> findAll();
    T update(T entity);
    T save(T entity);
    T findById(ID id);
    Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit, String whereClause);
    Integer delete(List<ID> ids);
}

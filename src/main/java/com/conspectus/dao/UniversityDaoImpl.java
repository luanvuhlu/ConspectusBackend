package com.conspectus.dao;

import com.conspectus.entity.University;
import com.conspectus.entity.meta.University_;

import javax.persistence.criteria.CriteriaQuery;

/**
 * Created by luan vu on 1/25/2017.
 */
public class UniversityDaoImpl extends BaseDao implements UniversityDaoInterface {
    public void add(University entity) {
        getCurrentSession().save(entity);
    }

    public void update(University entity) {
        getCurrentSession().update(entity);
    }

    public University findById(Long id) {
        CriteriaQueryGenerator<University> criteriaQueryGenerator = getCriteriaQueryGenerator();
        CriteriaQuery<University> criteria = criteriaQueryGenerator.getCriteria()
                .select(criteriaQueryGenerator.getRoot())
                .where(criteriaQueryGenerator.getBuilder()
                .equal(criteriaQueryGenerator.getRoot().get(University_.id), id));
        return getCurrentSession().createQuery(criteria).uniqueResult();
    }

    public void delete(University entity) {
        getCurrentSession().delete(entity);
    }
}

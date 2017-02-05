package com.conspectus.dao;

import com.conspectus.entity.University;
import com.conspectus.entity.University_;

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
        CriteriaQueryGenerator<University, University> generator = getCriteriaQueryGenerator(University.class, University.class);
        System.out.print(University_.id);
        CriteriaQuery<University> criteria = generator.getCriteria()
                .select(generator.getRoot())
                .where(generator.getBuilder()
                .equal(generator.getRoot().get(University_.id), id));
        return getCurrentSession().createQuery(criteria).uniqueResult();
    }

    public void delete(University entity) {
        getCurrentSession().delete(entity);
    }
}

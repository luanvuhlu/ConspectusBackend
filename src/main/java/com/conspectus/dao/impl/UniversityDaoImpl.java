package com.conspectus.dao.impl;

import com.conspectus.base.BaseDao;
import com.conspectus.base.CriteriaQueryGenerator;
import com.conspectus.base.CriteriaUpdateGenerator;
import com.conspectus.dao.UniversityDaoInterface;
import com.conspectus.entity.University;
import com.conspectus.entity.University_;
import com.conspectus.entity.base.BaseEntity_;
import com.conspectus.hibernate.base.Builder;

import javax.persistence.criteria.CriteriaQuery;

/**
 * Created by luan vu on 1/25/2017.
 */
public class UniversityDaoImpl extends BaseDao implements UniversityDaoInterface {

    public static final String CACHE_REGION = "university";

    public void add(University entity) {
        getCurrentSession().persist(entity);
    }

    public void update(University entity) {
        getCurrentSession().update(entity);
    }

    public University findById(Long id) {
        CriteriaQueryGenerator<University, University> generator = getCriteriaQueryGenerator(University.class, University.class);
        System.out.print(University_.id);
        CriteriaQuery<University> criteria = generator.getCriteria()
                .select(generator.getRoot())
                .where(generator.getBuilder().and(
                        generator.getBuilder().equal(generator.getRoot().get(University_.id), id),
                        Builder.isNotDeleted(generator.getBuilder(), generator.getRoot())
                ));
        return getCurrentSession()
                .createQuery(criteria)
                .setCacheable(true)
                .setCacheRegion(CACHE_REGION)
                .uniqueResult();
    }

    public void delete(University entity) {
        CriteriaUpdateGenerator<University> generator = getCriteriaUpdateGenerator(University.class);
        generator.getCriteria()
                .set(BaseEntity_.deleted, true);
        generator.getCriteria().where(
                generator.getBuilder().equal(
                        generator.getRoot().get(University_.id), entity.getId()
                )
        );
        getCurrentSession().createQuery(generator.getCriteria()).executeUpdate();
    }
}

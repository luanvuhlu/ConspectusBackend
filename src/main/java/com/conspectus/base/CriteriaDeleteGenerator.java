package com.conspectus.base;

import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

/**
 * Created by luan vu on 2/11/2017.
 */
public class CriteriaDeleteGenerator<T> {
    private CriteriaBuilder builder;
    private CriteriaDelete<T> criteria;
    private Root<T> root;
    public CriteriaDeleteGenerator(Session session, Class<T> val){
        builder = session.getCriteriaBuilder();
        criteria = builder.createCriteriaDelete(val);
        root = criteria.from(val);
    }

    public CriteriaBuilder getBuilder() {
        return builder;
    }

    public CriteriaDelete<T> getCriteria() {
        return criteria;
    }

    public Root<T> getRoot() {
        return root;
    }
}

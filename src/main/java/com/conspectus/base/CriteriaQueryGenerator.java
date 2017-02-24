package com.conspectus.base;

import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by luan vu on 1/25/2017.
 */
public class CriteriaQueryGenerator<T, Z> {
    private CriteriaBuilder builder;
    private CriteriaQuery<Z> criteria;
    private Root<T> root;
    public CriteriaQueryGenerator(Session session, Class<T> val, Class<Z> res){
        builder = session.getCriteriaBuilder();
        criteria = builder.createQuery(res);
        root = criteria.from(val);
    }

    public CriteriaBuilder getBuilder() {
        return builder;
    }

    public CriteriaQuery<Z> getCriteria() {
        return criteria;
    }

    public Root<T> getRoot() {
        return root;
    }
}

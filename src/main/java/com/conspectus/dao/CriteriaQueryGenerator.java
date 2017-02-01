package com.conspectus.dao;

import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by luan vu on 1/25/2017.
 */
public class CriteriaQueryGenerator<T> {
    private CriteriaBuilder builder;
    private CriteriaQuery<T> criteria;
    private Root<T> root;
    public CriteriaQueryGenerator(Session session, Class<T> val1){
        builder = session.getCriteriaBuilder();
        criteria = builder.createQuery(val1);
        root = criteria.from(val1);
    }

    public CriteriaBuilder getBuilder() {
        return builder;
    }

    public CriteriaQuery<T> getCriteria() {
        return criteria;
    }

    public Root<T> getRoot() {
        return root;
    }
}

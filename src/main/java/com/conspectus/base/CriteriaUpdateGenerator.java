package com.conspectus.base;

import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

/**
 * Created by luan vu on 2/11/2017.
 */
public class CriteriaUpdateGenerator<T> {
    private CriteriaBuilder builder;
    private CriteriaUpdate<T> criteria;
    private Root<T> root;
    public CriteriaUpdateGenerator(Session session, Class<T> val){
        builder = session.getCriteriaBuilder();
        criteria = builder.createCriteriaUpdate(val);
        root = criteria.from(val);
    }

    public CriteriaBuilder getBuilder() {
        return builder;
    }

    public CriteriaUpdate<T> getCriteria() {
        return criteria;
    }

    public Root<T> getRoot() {
        return root;
    }
}

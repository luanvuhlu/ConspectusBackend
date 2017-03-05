package com.conspectus.hibernate.base;

import com.conspectus.entity.base.BaseEntity;
import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by luan vu on 3/5/2017.
 */
public final class Builder {
    public static <T extends BaseEntity>  Predicate isNotDeleted(CriteriaBuilder criteriaBuilder, Root<T> root){
        return criteriaBuilder.or(
                criteriaBuilder.isNull(root.get(BaseEntity_.deleted)),
                criteriaBuilder.equal(root.get(BaseEntity_.deleted), false)
        );
    }
}

package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 3/5/2017.
 */
@StaticMetamodel(ProblemDetail.class)
public abstract class ProblemDetail_ extends BaseEntity_{
    public static volatile SingularAttribute<ProblemDetail, Long> id;
}

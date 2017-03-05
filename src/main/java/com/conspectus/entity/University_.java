package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/25/2017.
 */
@StaticMetamodel(University.class)
public class University_ extends BaseEntity_{
    public static volatile SingularAttribute<University, Long> id;
}

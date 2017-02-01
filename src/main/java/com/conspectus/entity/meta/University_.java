package com.conspectus.entity.meta;

import com.conspectus.entity.University;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/25/2017.
 */
@StaticMetamodel(University.class)
public abstract class University_ extends BaseEntity_{
    public static volatile SingularAttribute<University, Long> id;
}

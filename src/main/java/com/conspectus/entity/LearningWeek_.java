package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 3/5/2017.
 */
@StaticMetamodel(LearningWeek.class)
public abstract class LearningWeek_ extends BaseEntity_ {
    public static volatile SingularAttribute<LearningWeek, Long> id;
}

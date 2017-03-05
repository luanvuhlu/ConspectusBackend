package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningDay.class)
public abstract class LearningDay_ extends BaseEntity_ {
    public static volatile SingularAttribute<LearningDay, Long> id;
}

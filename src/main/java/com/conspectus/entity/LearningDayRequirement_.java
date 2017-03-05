package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningDayRequirement.class)
public abstract class LearningDayRequirement_ extends BaseEntity_ {
    public static volatile SingularAttribute<LearningDayRequirement, Long> id;
}
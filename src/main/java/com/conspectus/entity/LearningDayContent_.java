package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningDayContent.class)
public abstract class LearningDayContent_ extends BaseEntity_ {
    public static volatile SingularAttribute<LearningDayContent, Long> id;
}
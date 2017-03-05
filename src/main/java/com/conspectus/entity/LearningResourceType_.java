package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningResourceType.class)
public abstract class LearningResourceType_ extends BaseEntity_ {
    public static volatile SingularAttribute<LearningResourceType, Long> id;
}

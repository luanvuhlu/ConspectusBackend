package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 3/5/2017.
 */
@StaticMetamodel(StudentSchedule.class)
public abstract class StudentSchedule_ extends BaseEntity_{
    public static volatile SingularAttribute<StudentSchedule, Long> id;
}

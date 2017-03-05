package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 3/5/2017.
 */
@StaticMetamodel(SubjectStudentSchedule.class)
public abstract class SubjectStudentSchedule_ extends BaseEntity_{
    public static volatile SingularAttribute<SubjectStudentSchedule, Long> id;
}

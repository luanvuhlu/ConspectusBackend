package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Course.class)
public abstract class Course_ {
    public static volatile SingularAttribute<Course, Long> id;
    public static volatile SingularAttribute<Course, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Course, Boolean> deleted;
    public static volatile SingularAttribute<Course, Date> createTime;
    public static volatile SingularAttribute<Course, Date> updateTime;
}

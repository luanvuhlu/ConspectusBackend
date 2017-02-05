package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Student.class)
public abstract class Student_ {
    public static volatile SingularAttribute<Student, Long> id;
    public static volatile SingularAttribute<Student, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Student, Boolean> deleted;
    public static volatile SingularAttribute<Student, Date> createTime;
    public static volatile SingularAttribute<Student, Date> updateTime;
}

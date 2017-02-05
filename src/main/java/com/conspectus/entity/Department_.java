package com.conspectus.entity;

import com.conspectus.entity.Department;
import com.conspectus.entity.University;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Department.class)
public abstract class Department_ {
    public static volatile SingularAttribute<Department, Long> id;
    public static volatile SingularAttribute<Department, University> university;
    public static volatile SingularAttribute<Department, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Department, Boolean> deleted;
    public static volatile SingularAttribute<Department, Date> createTime;
    public static volatile SingularAttribute<Department, Date> updateTime;
}

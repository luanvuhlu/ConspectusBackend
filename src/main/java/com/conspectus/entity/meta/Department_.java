package com.conspectus.entity.meta;

import com.conspectus.entity.Department;
import com.conspectus.entity.University;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Department.class)
public abstract class Department_ extends BaseEntity_ {
    public static volatile SingularAttribute<Department, University> university;
}

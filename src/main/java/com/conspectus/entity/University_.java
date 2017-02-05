package com.conspectus.entity;

import com.conspectus.entity.University;
import com.conspectus.entity.University;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/25/2017.
 */
@StaticMetamodel(University.class)
public class University_{
    public static volatile SingularAttribute<University, Long> id;
    public static volatile SingularAttribute<University, Date> lastUpdatedBy;
    public static volatile SingularAttribute<University, Boolean> deleted;
    public static volatile SingularAttribute<University, Date> createTime;
    public static volatile SingularAttribute<University, Date> updateTime;
}

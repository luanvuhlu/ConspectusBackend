package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Exercise .class)
public abstract class Exercise_ {
    public static volatile SingularAttribute<Exercise , Long> id;
    public static volatile SingularAttribute<Exercise , Date> lastUpdatedBy;
    public static volatile SingularAttribute<Exercise , Boolean> deleted;
    public static volatile SingularAttribute<Exercise , Date> createTime;
    public static volatile SingularAttribute<Exercise , Date> updateTime;
}

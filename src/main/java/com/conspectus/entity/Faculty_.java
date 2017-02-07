package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Faculty.class)
public abstract class Faculty_ {
    public static volatile SingularAttribute<Faculty, Long> id;
    public static volatile SingularAttribute<Faculty, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Faculty, Boolean> deleted;
    public static volatile SingularAttribute<Faculty, Date> createTime;
    public static volatile SingularAttribute<Faculty, Date> updateTime;
}

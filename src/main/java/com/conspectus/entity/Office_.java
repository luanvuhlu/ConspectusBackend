package com.conspectus.entity;

import com.conspectus.entity.Office;
import com.conspectus.entity.Office;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Office.class)
public abstract class Office_{
    public static volatile SingularAttribute<Office, Long> id;
    public static volatile SingularAttribute<Office, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Office, Boolean> deleted;
    public static volatile SingularAttribute<Office, Date> createTime;
    public static volatile SingularAttribute<Office, Date> updateTime;
}

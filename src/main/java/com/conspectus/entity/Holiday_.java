package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Holiday.class)
public abstract class Holiday_ {
    public static volatile SingularAttribute<Holiday, Long> id;
    public static volatile SingularAttribute<Holiday, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Holiday, Boolean> deleted;
    public static volatile SingularAttribute<Holiday, Date> createTime;
    public static volatile SingularAttribute<Holiday, Date> updateTime;
}

package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Conspectus.class)
public abstract class Conspectus_ {
    public static volatile SingularAttribute<Conspectus, Long> id;
    public static volatile SingularAttribute<Conspectus, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Conspectus, Boolean> deleted;
    public static volatile SingularAttribute<Conspectus, Date> createTime;
    public static volatile SingularAttribute<Conspectus, Date> updateTime;
}

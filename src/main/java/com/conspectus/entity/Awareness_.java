package com.conspectus.entity;

import com.conspectus.entity.Awareness;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Awareness.class)
public abstract class Awareness_ {
    public static volatile SingularAttribute<Awareness, Long> id;
    public static volatile SingularAttribute<Awareness, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Awareness, Boolean> deleted;
    public static volatile SingularAttribute<Awareness, Date> createTime;
    public static volatile SingularAttribute<Awareness, Date> updateTime;
}

package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(AwarenessDetail.class)
public abstract class Awareness_Detail_ {
    public static volatile SingularAttribute<AwarenessDetail, Long> id;
    public static volatile SingularAttribute<AwarenessDetail, Date> lastUpdatedBy;
    public static volatile SingularAttribute<AwarenessDetail, Boolean> deleted;
    public static volatile SingularAttribute<AwarenessDetail, Date> createTime;
    public static volatile SingularAttribute<AwarenessDetail, Date> updateTime;
}

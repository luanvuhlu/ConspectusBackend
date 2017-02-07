package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Awareness_Detail.class)
public abstract class Awareness_Detail_ {
    public static volatile SingularAttribute<Awareness_Detail, Long> id;
    public static volatile SingularAttribute<Awareness_Detail, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Awareness_Detail, Boolean> deleted;
    public static volatile SingularAttribute<Awareness_Detail, Date> createTime;
    public static volatile SingularAttribute<Awareness_Detail, Date> updateTime;
}

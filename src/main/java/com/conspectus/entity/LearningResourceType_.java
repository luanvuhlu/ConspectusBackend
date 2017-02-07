package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningResourceType.class)
public abstract class LearningResourceType_ {
    public static volatile SingularAttribute<LearningResourceType, Long> id;
    public static volatile SingularAttribute<LearningResourceType, Date> lastUpdatedBy;
    public static volatile SingularAttribute<LearningResourceType, Boolean> deleted;
    public static volatile SingularAttribute<LearningResourceType, Date> createTime;
    public static volatile SingularAttribute<LearningResourceType, Date> updateTime;
}

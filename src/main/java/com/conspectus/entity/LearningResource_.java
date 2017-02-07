package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningResource.class)
public abstract class LearningResource_ {
    public static volatile SingularAttribute<LearningResource, Long> id;
    public static volatile SingularAttribute<LearningResource, Date> lastUpdatedBy;
    public static volatile SingularAttribute<LearningResource, Boolean> deleted;
    public static volatile SingularAttribute<LearningResource, Date> createTime;
    public static volatile SingularAttribute<LearningResource, Date> updateTime;
}

package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningDay.class)
public abstract class LearningDay_ {
    public static volatile SingularAttribute<LearningDay, Long> id;
    public static volatile SingularAttribute<LearningDay, Date> lastUpdatedBy;
    public static volatile SingularAttribute<LearningDay, Boolean> deleted;
    public static volatile SingularAttribute<LearningDay, Date> createTime;
    public static volatile SingularAttribute<LearningDay, Date> updateTime;
}

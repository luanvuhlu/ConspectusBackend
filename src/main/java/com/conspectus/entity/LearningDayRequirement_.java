package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningDayRequirement.class)
public abstract class LearningDayRequirement_ {
    public static volatile SingularAttribute<LearningDayRequirement, Long> id;
    public static volatile SingularAttribute<LearningDayRequirement, Date> lastUpdatedBy;
    public static volatile SingularAttribute<LearningDayRequirement, Boolean> deleted;
    public static volatile SingularAttribute<LearningDayRequirement, Date> createTime;
    public static volatile SingularAttribute<LearningDayRequirement, Date> updateTime;
}

package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningDayContent.class)
public abstract class LearningDayContent_ {
    public static volatile SingularAttribute<LearningDayContent, Long> id;
    public static volatile SingularAttribute<LearningDayContent, Date> lastUpdatedBy;
    public static volatile SingularAttribute<LearningDayContent, Boolean> deleted;
    public static volatile SingularAttribute<LearningDayContent, Date> createTime;
    public static volatile SingularAttribute<LearningDayContent, Date> updateTime;
}

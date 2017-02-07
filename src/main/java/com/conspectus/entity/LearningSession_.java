package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(LearningSession.class)
public abstract class LearningSession_ {
    public static volatile SingularAttribute<LearningSession, Long> id;
    public static volatile SingularAttribute<LearningSession, Date> lastUpdatedBy;
    public static volatile SingularAttribute<LearningSession, Boolean> deleted;
    public static volatile SingularAttribute<LearningSession, Date> createTime;
    public static volatile SingularAttribute<LearningSession, Date> updateTime;
}

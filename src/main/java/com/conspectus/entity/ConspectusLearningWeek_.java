package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(ConspectusLearningWeek.class)
public abstract class ConspectusLearningWeek_ {
    public static volatile SingularAttribute<ConspectusLearningWeek, Long> id;
    public static volatile SingularAttribute<ConspectusLearningWeek, Date> lastUpdatedBy;
    public static volatile SingularAttribute<ConspectusLearningWeek, Boolean> deleted;
    public static volatile SingularAttribute<ConspectusLearningWeek, Date> createTime;
    public static volatile SingularAttribute<ConspectusLearningWeek, Date> updateTime;
}

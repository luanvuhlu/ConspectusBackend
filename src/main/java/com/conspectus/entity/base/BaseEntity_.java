package com.conspectus.entity.base;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 3/5/2017.
 */
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ {
    public static volatile SingularAttribute<BaseEntity, Date> lastUpdatedBy;
    public static volatile SingularAttribute<BaseEntity, Boolean> deleted;
    public static volatile SingularAttribute<BaseEntity, Date> createTime;
    public static volatile SingularAttribute<BaseEntity, Date> updateTime;
}

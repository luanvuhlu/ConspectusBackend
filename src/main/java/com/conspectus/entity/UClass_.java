package com.conspectus.entity;

import com.conspectus.entity.UClass;
import com.conspectus.entity.UClass;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(UClass.class)
public abstract class UClass_{
    public static volatile SingularAttribute<UClass, Long> id;
    public static volatile SingularAttribute<UClass, Date> lastUpdatedBy;
    public static volatile SingularAttribute<UClass, Boolean> deleted;
    public static volatile SingularAttribute<UClass, Date> createTime;
    public static volatile SingularAttribute<UClass, Date> updateTime;
}

package com.conspectus.entity.meta;

import com.conspectus.entity.UClass;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(UClass.class)
public abstract class UClass_ extends BaseEntity_{
    public static volatile SingularAttribute<UClass, Long> id;
}

package com.conspectus.entity.meta;

import com.conspectus.entity.Office;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Office.class)
public abstract class Office_ extends BaseEntity_{
    public static volatile SingularAttribute<Office, Long> id;
}

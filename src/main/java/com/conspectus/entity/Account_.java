package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Account.class)
public abstract class Account_ extends BaseEntity_{
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, User> email;
    public static volatile SingularAttribute<Account, User> username;
    public static volatile SingularAttribute<Account, User> user;
}

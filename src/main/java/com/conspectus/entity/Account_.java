package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 */
@StaticMetamodel(Account.class)
public abstract class Account_ {
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, Date> lastUpdatedBy;
    public static volatile SingularAttribute<Account, Boolean> deleted;
    public static volatile SingularAttribute<Account, Date> createTime;
    public static volatile SingularAttribute<Account, Date> updateTime;
}

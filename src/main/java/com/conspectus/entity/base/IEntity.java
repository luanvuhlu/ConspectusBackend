package com.conspectus.entity.base;

import com.conspectus.entity.Account;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by luan vu on 2/5/2017.
 */
public interface IEntity extends Serializable {
    Account getLastUpdatedBy();
    void setLastUpdatedBy(Account lastUpdatedBy);
    boolean isDeleted();
    void setDeleted(boolean deleted);
    Date getCreateTime();
    void setCreateTime(Date createTime);
    Date getUpdateTime();
    void setUpdateTime(Date updateTime);
}

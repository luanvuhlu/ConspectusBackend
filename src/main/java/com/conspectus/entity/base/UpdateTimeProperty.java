package com.conspectus.entity.base;

import java.util.Date;

/**
 * Created by luan vu on 3/4/2017.
 */
public interface UpdateTimeProperty {
    Date getCreateTime();
    void setCreateTime(Date createTime);
    Date getUpdateTime();
    void setUpdateTime(Date updateTime);
}

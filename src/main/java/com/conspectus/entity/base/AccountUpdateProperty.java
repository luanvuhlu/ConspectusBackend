package com.conspectus.entity.base;

import com.conspectus.entity.User;

/**
 * Created by luan vu on 3/4/2017.
 */
public interface AccountUpdateProperty {
    User getLastUpdatedBy();
    void setLastUpdatedBy(User lastUpdatedBy);
}

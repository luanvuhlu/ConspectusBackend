package com.conspectus.dao;

import com.conspectus.base.BaseDaoInterface;
import com.conspectus.entity.University;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface UniversityDaoInterface extends BaseDaoInterface {
    void add(University entity);
    void update(University entity);
    University findById(Long id);
    void delete(University entity);
}

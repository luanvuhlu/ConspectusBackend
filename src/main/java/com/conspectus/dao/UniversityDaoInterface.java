package com.conspectus.dao;

import com.conspectus.base.BaseDaoInterface;
import com.conspectus.entity.University;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface UniversityDaoInterface extends BaseDaoInterface {
    public void add(University entity);
    public void update(University entity);
    public University findById(Long id);
    public void delete(University entity);
}

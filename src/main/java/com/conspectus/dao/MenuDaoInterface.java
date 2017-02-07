package com.conspectus.dao;

import com.conspectus.entity.Menu;
import com.conspectus.entity.University;
import com.conspectus.entity.base.IMenu;

import java.util.List;
import java.util.Set;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface MenuDaoInterface extends BaseDaoInterface {
    public void add(IMenu entity);
    public void update(IMenu entity);
    public IMenu findById(Long id);
    public void delete(IMenu entity);
    public List<IMenu> listAll();
}

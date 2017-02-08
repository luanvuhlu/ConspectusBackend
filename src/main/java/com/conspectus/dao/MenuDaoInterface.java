package com.conspectus.dao;

import com.conspectus.entity.Menu;

import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface MenuDaoInterface extends BaseDaoInterface {
    public void add(Menu entity);
    public void update(Menu entity);
    public Menu findById(Long id);
    public void delete(Menu entity);
    public List<Menu> listAll();
}

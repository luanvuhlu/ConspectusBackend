package com.conspectus.dao;

import com.conspectus.base.BaseDaoInterface;
import com.conspectus.entity.Menu;
import com.conspectus.entity.MenuIcon;

import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface MenuDaoInterface extends BaseDaoInterface {
    public void add(Menu entity);
    public void update(Menu entity);
    public Menu findById(Long id);
    public void delete(Menu entity);
    public void delete(Long[] ids);
    public List<Menu> listAll();
    void incrOrderMenu(Integer parentId, int order);
    void decrOrderMenu(Integer parentId, int order);
    List<MenuIcon> getListMenuIcons();
}

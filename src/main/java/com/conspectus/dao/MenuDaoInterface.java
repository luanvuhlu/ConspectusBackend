package com.conspectus.dao;

import com.conspectus.base.BaseDaoInterface;
import com.conspectus.entity.Menu;
import com.conspectus.entity.MenuIcon;

import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface MenuDaoInterface extends BaseDaoInterface {
    void add(Menu entity);
    void update(Menu entity);
    Menu findById(Long id);
    void delete(Menu entity);
    void delete(Long[] ids);
    List<Menu> listAll();
    void incrOrderMenu(Integer parentId, int order);
    void decrOrderMenu(Integer parentId, int order);
    List<MenuIcon> getListMenuIcons();
}

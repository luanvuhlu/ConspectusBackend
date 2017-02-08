package com.conspectus.service;

import com.conspectus.dao.MenuDaoImpl;
import com.conspectus.dao.MenuDaoInterface;
import com.conspectus.entity.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
public class MenuService extends BaseService {
    private MenuDaoInterface dao;

    public MenuService() {
        dao = new MenuDaoImpl();
    }

    public void persist(Menu entity) throws Exception {
        try {
            dao.openCurrentSessionwithTransaction();
            dao.add(entity);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSessionwithTransaction();
        }
    }

    public void update(Menu entity) throws Exception {
        try {
            dao.openCurrentSessionwithTransaction();
            dao.update(entity);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSessionwithTransaction();
        }
    }

    public Menu findById(Long id) throws Exception {
        try {
            dao.openCurrentSession();
            return dao.findById(id);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSession();
        }
    }

    public void delete(Menu entity) throws Exception {
        try {
            dao.openCurrentSessionwithTransaction();
            dao.delete(entity);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSessionwithTransaction();
        }
    }

    public List<Menu> listAll() throws Exception {
        try {
            dao.openCurrentSession();
            return dao.listAll();
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSession();
        }
    }

    public List<Menu> listMenuOrdered() throws Exception {
        try {
            List<Menu> allMenus = listAll();
            if (allMenus == null || allMenus.size() == 0) {
                return Collections.EMPTY_LIST;
            }
            List<Menu> menuRoots = new ArrayList<Menu>();

            for (Menu menu : allMenus) {
                if (menu.getParent() != null) {
                    continue;
                }
                menuRoots.add(menu);
            }
            for (Menu menu : allMenus) {
                addMenuChild(menu, menuRoots);
            }
            return menuRoots;
        } catch (Exception e) {
            throw e;
        }
    }

    private void addMenuChild(Menu menu, List<Menu> menuRoots) {
        for (Menu root : menuRoots) {
            if(menu.getParent()==null){
                continue;
            }
            if(!root.equals(menu.getParent())) {
                continue;
            }
            root.addChild(menu);
            return;
        }
    }
}

package com.conspectus.service;

import com.conspectus.dao.MenuDaoImpl;
import com.conspectus.dao.MenuDaoInterface;
import com.conspectus.entity.base.IMenu;

import java.util.*;

/**
 * Created by luan vu on 1/25/2017.
 */
public class MenuService extends BaseService {
    private MenuDaoInterface dao;

    public MenuService() {
        dao = new MenuDaoImpl();
    }

    public void persist(IMenu entity) throws Exception {
        try {
            dao.openCurrentSessionwithTransaction();
            dao.add(entity);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSessionwithTransaction();
        }
    }

    public void update(IMenu entity) throws Exception {
        try {
            dao.openCurrentSessionwithTransaction();
            dao.update(entity);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSessionwithTransaction();
        }
    }

    public IMenu findById(Long id) throws Exception {
        try {
            dao.openCurrentSession();
            return dao.findById(id);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSession();
        }
    }

    public void delete(IMenu entity) throws Exception {
        try {
            dao.openCurrentSessionwithTransaction();
            dao.delete(entity);
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSessionwithTransaction();
        }
    }

    public List<IMenu> listAll() throws Exception {
        try {
            dao.openCurrentSession();
            return dao.listAll();
        } catch (Exception e) {
            throw e;
        } finally {
            dao.closeCurrentSession();
        }
    }

    public List<IMenu> listMenuOrdered() throws Exception {
        try {
            List<IMenu> allMenus = listAll();
            if (allMenus == null || allMenus.size() == 0) {
                return Collections.EMPTY_LIST;
            }
            List<IMenu> menuRoots = new ArrayList<IMenu>();

            for (IMenu menu : allMenus) {
                if (menu.getParent() != null) {
                    continue;
                }
                menuRoots.add(menu);
            }
            for (IMenu menu : allMenus) {
                addMenuChild(menu, menuRoots);
            }
            return menuRoots;
        } catch (Exception e) {
            throw e;
        }
    }

    private void addMenuChild(IMenu menu, List<IMenu> menuRoots) {
        for (IMenu root : menuRoots) {
            if(!menu.getParent().equals(root)) {
                continue;
            }
            root.addChild(menu);
            return;
        }
    }
}

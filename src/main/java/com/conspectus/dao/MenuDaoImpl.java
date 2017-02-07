package com.conspectus.dao;

import com.conspectus.entity.Menu;
import com.conspectus.entity.Menu_;
import com.conspectus.entity.base.IMenu;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import java.util.List;
import java.util.Set;

/**
 * Created by luan vu on 1/25/2017.
 */
public class MenuDaoImpl extends BaseDao implements MenuDaoInterface {
    public void add(IMenu entity) {
        getCurrentSession().save(entity);
    }

    public void update(IMenu entity) {
        getCurrentSession().update(entity);
    }

    public IMenu findById(Long id) {
        CriteriaQueryGenerator<Menu, Menu> generator = getCriteriaQueryGenerator(Menu.class, Menu.class);
        CriteriaQuery<Menu> criteria = generator.getCriteria()
                .select(generator.getRoot())
                .where(generator.getBuilder()
                .equal(generator.getRoot().get(Menu_.id), id));
        return getCurrentSession().createQuery(criteria).uniqueResult();
    }

    public void delete(IMenu entity) {
        getCurrentSession().delete(entity);
    }

    public List<IMenu> listAll() {
        CriteriaQueryGenerator<Menu, IMenu> generator = getCriteriaQueryGenerator(Menu.class, IMenu.class);
        CriteriaQuery<IMenu> criteria = generator.getCriteria()
                .select(generator.getRoot())
                .orderBy(generator.getBuilder().asc(generator.getRoot().get(Menu_.order)));
        return getCurrentSession().createQuery(criteria).list();
    }
}

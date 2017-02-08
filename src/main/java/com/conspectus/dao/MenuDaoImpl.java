package com.conspectus.dao;

import com.conspectus.entity.Menu;
import com.conspectus.entity.Menu_;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
public class MenuDaoImpl extends BaseDao implements MenuDaoInterface {
    public void add(Menu entity) {
        getCurrentSession().save(entity);
    }

    public void update(Menu entity) {
        getCurrentSession().update(entity);
    }

    public Menu findById(Long id) {
        CriteriaQueryGenerator<Menu, Menu> generator = getCriteriaQueryGenerator(Menu.class, Menu.class);
        CriteriaQuery<Menu> criteria = generator.getCriteria()
                .select(generator.getRoot())
                .where(generator.getBuilder()
                .equal(generator.getRoot().get(Menu_.id), id));
        return getCurrentSession().createQuery(criteria).uniqueResult();
    }

    public void delete(Menu entity) {
        getCurrentSession().delete(entity);
    }

    public List<Menu> listAll() {
        CriteriaQueryGenerator<Menu, Menu> generator = getCriteriaQueryGenerator(Menu.class, Menu.class);
        CriteriaQuery<Menu> criteria = generator.getCriteria()
                .select(generator.getRoot())
                .orderBy(generator.getBuilder().asc(generator.getRoot().get(Menu_.order)));
        return getCurrentSession().createQuery(criteria).list();
    }
}

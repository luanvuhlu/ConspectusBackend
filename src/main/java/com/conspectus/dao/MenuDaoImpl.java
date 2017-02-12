package com.conspectus.dao;

import com.conspectus.entity.Menu;
import com.conspectus.entity.Menu_;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
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
        generator.getCriteria().select(generator.getRoot());
        generator.getCriteria().where(generator.getBuilder().equal(generator.getRoot().get(Menu_.id), id));
        return getCurrentSession().createQuery(generator.getCriteria()).uniqueResult();
    }

    public void delete(Menu entity) {
        getCurrentSession().delete(entity);
    }

    public List<Menu> listAll() {
        CriteriaQueryGenerator<Menu, Menu> generator = getCriteriaQueryGenerator(Menu.class, Menu.class);
        generator.getCriteria().select(generator.getRoot());
        generator.getCriteria().where(generator.getBuilder().isNull(generator.getRoot().get(Menu_.parent)));
        generator.getCriteria().orderBy(generator.getBuilder().asc(generator.getRoot().get(Menu_.order)));
        return getCurrentSession().createQuery(generator.getCriteria()).list();
    }

    private void reOrderMenu(Integer parentId, int order, int value) {
        CriteriaUpdateGenerator<Menu> generator = getCriteriaUpdateGenerator(Menu.class);
        generator.getCriteria()
                .set(Menu_.order, generator.getBuilder().sum(generator.getRoot().get(Menu_.order), value));
        Predicate expression1 = generator.getBuilder().ge(generator.getRoot().get(Menu_.order), order);
        Predicate expression2 = null;
        if(parentId!=null){
            expression2 = generator.getBuilder().equal(generator.getRoot().get(Menu_.parent).get(Menu_.id), parentId);
        }else{
            expression2 = generator.getBuilder().isNull(generator.getRoot().get(Menu_.parent).get(Menu_.id));
        }
        generator.getCriteria().where(generator.getBuilder().and(expression1, expression2));
        getCurrentSession().createQuery(generator.getCriteria()).executeUpdate();
    }

    public void incrOrderMenu(Integer parentId, int order) {
        reOrderMenu(parentId, order, 1);
    }

    public void decrOrderMenu(Integer parentId, int order) {
        reOrderMenu(parentId, order, -1);
    }

}

package com.conspectus.dao.impl;

import com.conspectus.base.BaseDao;
import com.conspectus.base.CriteriaQueryGenerator;
import com.conspectus.base.CriteriaUpdateGenerator;
import com.conspectus.dao.MenuDaoInterface;
import com.conspectus.entity.Menu;
import com.conspectus.entity.MenuIcon;
import com.conspectus.entity.Menu_;
import com.conspectus.hibernate.base.Builder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
public class MenuDaoImpl extends BaseDao implements MenuDaoInterface {

    public static final String CACHE_REGION = "memnu";

    public void add(Menu entity) {
        getCurrentSession().save(entity);
    }

    public void update(Menu entity) {
        getCurrentSession().update(entity);
    }

    public Menu findById(Long id) {
        CriteriaQueryGenerator<Menu, Menu> generator = getCriteriaQueryGenerator(Menu.class, Menu.class);
        CriteriaBuilder builder = generator.getBuilder();
        Root<Menu> root = generator.getRoot();
        generator.getCriteria().select(root);
        generator.getCriteria()
                .where(builder.and(
                        builder.equal(root.get(Menu_.id), id),
                        Builder.isNotDeleted(builder, root)
                     )
                );
        return getCurrentSession()
                .createQuery(generator.getCriteria())
                .uniqueResult();
    }

    public void delete(Menu entity) {
        entity.setDeleted(true);
        update(entity);
    }

    public void delete(Long[] ids) {
        CriteriaUpdateGenerator<Menu> generator = getCriteriaUpdateGenerator(Menu.class);
        generator.getCriteria()
                .set(Menu_.deleted, true);
        generator.getCriteria().where(
                generator.getBuilder().and(
                        generator.getRoot().get(Menu_.id).in(ids),
                        generator.getRoot().get(Menu_.parent).get(Menu_.id).in(ids)
                )
        );
        getCurrentSession().createQuery(generator.getCriteria()).executeUpdate();
    }

    public List<Menu> listAll() {
        CriteriaQueryGenerator<Menu, Menu> generator = getCriteriaQueryGenerator(Menu.class, Menu.class);
        generator.getCriteria()
                .select(generator.getRoot())
                .where(Builder.isNotDeleted(generator.getBuilder(), generator.getRoot()))
                .orderBy(
                        generator.getBuilder().asc(generator.getRoot().get(Menu_.parent).get(Menu_.id)),
                        generator.getBuilder().asc(generator.getRoot().get(Menu_.order))
                        );
        return getCurrentSession()
                .createQuery(generator.getCriteria())
                .setCacheable(true)
                .setCacheRegion(CACHE_REGION)
                .list();
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

    public List<MenuIcon> getListMenuIcons() {
        CriteriaQueryGenerator<MenuIcon, MenuIcon> generator = getCriteriaQueryGenerator(MenuIcon.class, MenuIcon.class);
        generator.getCriteria().select(generator.getRoot());
        return getCurrentSession().createQuery(generator.getCriteria()).list();
    }

}

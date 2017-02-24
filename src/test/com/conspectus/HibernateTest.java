package com.conspectus;

import com.conspectus.entity.Menu;
import com.conspectus.service.MenuService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * Created by luan vu on 2/1/2017.
 */
public class HibernateTest {
    private MenuService service;
    @Before
    public void init(){
        service = new MenuService();
    }
    @Test
    @Ignore
    public void testAdd() throws Exception {
        Menu menu = new Menu("Child Test", "/testChild", 2, new Menu(3l), "fa fa-bath");
        service.add(menu);
        final List<Menu> menus = service.listMenuOrdered();
        Assert.assertEquals(3, menus.size());
    }
    @Test
    public void delete() throws Exception {
        service.delete(new Long[]{4l, 5l, 6l});
    }
}

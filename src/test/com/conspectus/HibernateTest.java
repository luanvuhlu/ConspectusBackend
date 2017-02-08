package com.conspectus;

import com.conspectus.service.MenuService;
import org.junit.Before;
import org.junit.Test;

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
    public void testSetup() throws Exception {
        System.out.println(service.listMenuOrdered().size());
    }
}

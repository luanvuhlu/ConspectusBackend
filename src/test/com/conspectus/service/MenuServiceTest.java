package com.conspectus.service;

import com.conspectus.entity.Menu;
import com.conspectus.hibernate.base.HibernateUtils;
import org.hibernate.stat.SecondLevelCacheStatistics;
import org.hibernate.stat.Statistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * Created by luan vu on 2/1/2017.
 */
public class MenuServiceTest {
    private MenuService service;
    private  Statistics stats;
    @Before
    public void init(){
        stats = HibernateUtils.getInstance().getStats();
        service = new MenuService();
    }
    @Test
    public void testFind() throws Exception {
        Menu menu = service.findById(1l);
        Assert.assertNotNull(menu);
        System.out.println(menu.toString());
    }
    @Test
    public void testFindAll() throws Exception {
        List<Menu> menus = service.listAll();
        Assert.assertEquals(3, menus.size());
    }
    @Test
    public void testCache() throws Exception {
        Assert.assertEquals(3,  service.listAll().size());
        printStats(0);

        Assert.assertEquals(3,  service.listAll().size());
        printStats(1);

        Assert.assertEquals(3,  service.listAll().size());
        printStats(2);

        Assert.assertEquals(3,  service.listAll().size());
        printStats(3);
    }
    @Ignore
    private void printStats(int i) {
        SecondLevelCacheStatistics cacheStatistics = stats.getSecondLevelCacheStatistics("menu");
        System.out.println("***** " + i + " *****");
        System.out.println("Size In Memory=" + cacheStatistics.getSizeInMemory());
        System.out.println("Count In Memory=" + cacheStatistics.getElementCountInMemory());
        System.out.println("Count In Disk=" + cacheStatistics.getElementCountOnDisk());
    }
}

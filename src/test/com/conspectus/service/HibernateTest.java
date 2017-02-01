package com.conspectus.service;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by luan vu on 2/1/2017.
 */
public class HibernateTest {
    private UniversityService service;
    @Before
    public void init(){
        service = new UniversityService();
    }
    @Test
    public void testSetup() throws Exception {
        service.findById(0l);
    }
}

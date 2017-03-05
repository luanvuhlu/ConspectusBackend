package com.conspectus.service;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by luan vu on 3/5/2017.
 */
public class UniversityServiceTest {
    UniversityService service;
    @Before
    public void init(){
        service = new UniversityService();
    }
    @Test
    public void testFind() throws Exception {
        service.findById(1l);
    }
}

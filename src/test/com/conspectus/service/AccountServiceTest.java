package com.conspectus.service;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by luan vu on 3/5/2017.
 */
public class AccountServiceTest {
    AccountService service;
    @Before
    public void init(){
        service = new AccountService();
    }
    @Test
    public void testFind() throws Exception {
        service.findById(1l);
    }
}

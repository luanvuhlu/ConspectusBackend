package com.conspectus.service;

/**
 * Created by luan vu on 2/1/2017.
 */
public class HibernateTest {
    private UniversityService service;
    public void init(){
        service = new UniversityService();
    }
    public void testSetup() throws Exception {
        service.findById(0l);
    }
    public static void main(String[] args) throws Exception {
        HibernateTest test = new HibernateTest();
        test.init();
        test.testSetup();
    }
}

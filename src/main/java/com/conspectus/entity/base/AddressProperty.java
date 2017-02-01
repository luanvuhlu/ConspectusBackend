package com.conspectus.entity.base;

import javax.persistence.Column;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface AddressProperty {
    @Column(name = "ADDRESS_1")
    String getAddress1();
    @Column(name = "ADDRESS_2")
    String getAddress2();
    @Column(name = "ADDRESS_3")
    String getAddress3();
    @Column(name = "CITY")
    City getCity();
    void setAddress1(String address1);
    void setAddress2(String address2);
    void setAddress3(String address3);
    void setCity(City city);
}

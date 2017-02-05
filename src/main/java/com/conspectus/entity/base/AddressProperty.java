package com.conspectus.entity.base;

import com.conspectus.entity.City;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface AddressProperty {
    String getAddress1();
    String getAddress2();
    String getAddress3();
    City getCity();
    void setAddress1(String address1);
    void setAddress2(String address2);
    void setAddress3(String address3);
    void setCity(City city);
}

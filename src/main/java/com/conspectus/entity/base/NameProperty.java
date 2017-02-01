package com.conspectus.entity.base;

import javax.persistence.Column;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface NameProperty {
    String getName();
    void setName(String name);
    @Column(name = "NAME_ABBR")
    String getNameAbbr();
    void setNameAbbr(String nameAbbr);
}

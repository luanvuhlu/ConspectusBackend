package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity_;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by luan vu on 2/6/2017.
 */
@StaticMetamodel(Menu.class)
public class Menu_ extends BaseEntity_ {
    public static volatile SingularAttribute<Menu, Long> id;
    public static volatile SingularAttribute<Menu, Integer> order;
    public static volatile SingularAttribute<Menu, Menu> parent;
}

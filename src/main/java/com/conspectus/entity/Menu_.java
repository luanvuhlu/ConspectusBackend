package com.conspectus.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Created by luan vu on 2/6/2017.
 */
@StaticMetamodel(Menu.class)
public class Menu_ {
    public static volatile SingularAttribute<Menu, Long> id;
    public static volatile SingularAttribute<Menu, Integer> order;
}

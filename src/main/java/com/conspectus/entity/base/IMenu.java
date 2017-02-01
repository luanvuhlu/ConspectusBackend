package com.conspectus.entity.base;

import java.util.Set;

/**
 * Created by luan vu on 2/1/2017.
 */
public interface IMenu {
    String getName();
    String getUrl();
    String getIcon();
    int getOrder();
    IMenu getParent();
    Set<IMenu> getChildren();
}

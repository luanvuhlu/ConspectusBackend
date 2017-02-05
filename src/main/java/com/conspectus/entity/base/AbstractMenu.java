package com.conspectus.entity.base;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Set;

/**
 * Created by luan vu on 2/1/2017.
 */
public abstract class AbstractMenu implements IMenu{
    private String name;
    private String url;
    private int order;
    private IMenu parent;
    private String icon;
    private Set<IMenu> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public IMenu getParent() {
        return parent;
    }

    public void setParent(IMenu parent) {
        this.parent = parent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Set<IMenu> getChildren() {
        return children;
    }

    public void setChildren(Set<IMenu> children) {
        this.children = children;
    }
}

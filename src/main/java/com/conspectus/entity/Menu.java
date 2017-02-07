package com.conspectus.entity;

import com.conspectus.entity.base.IMenu;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by luan vu on 2/1/2017.
 */
@Entity
@Table(name = "MENU")
public class Menu implements IMenu {
    private Long id;
    private String name;
    private String url;
    private int order;
    private int level;
    private IMenu parent;
    private String icon;
    private Set<IMenu> children;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ROOT_ID", nullable = true)
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

    @OneToMany(mappedBy = "parent")
    public Set<IMenu> getChildren() {
        return children;
    }

    public void addChild(IMenu menu) {
        if(getChildren()==null){
            setChildren(new HashSet<IMenu>());
        }
        getChildren().add(menu);
    }

    public void setChildren(Set<IMenu> children) {
        this.children = children;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

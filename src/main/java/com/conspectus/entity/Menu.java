package com.conspectus.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by luan vu on 2/1/2017.
 */
@Entity
@Table(name = "MENU")
public class Menu implements Serializable{
    private Long id;
    private String name;
    private String url;
    private int order;
    private Menu parent;
    private String icon;
    private Set<Menu> children;

    public Menu() {
    }

    public Menu(Menu other) {
        this.id = other.getId();
        this.icon = other.getIcon();
        this.parent = other.getParent();
        this.name = other.getName();
        this.url = other.getUrl();
        this.order = other.getOrder();
    }

    public Menu(int order) {
        this.order = order;
        this.icon = icon;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "MENU_ORDER")
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOT_ID", nullable = true)
    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)

    @Fetch(FetchMode.JOIN)
    public Set<Menu> getChildren() {
        return children;
    }

    public void addChild(Menu menu) {
        getChildren().add(menu);
    }

    public void setChildren(Set<Menu> children) {
        this.children = children;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Transient
    public Integer getParentOrder(){
        return getParent()==null ? null : getParent().getOrder();
    }
}

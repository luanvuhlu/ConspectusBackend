package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/1/2017.
 */
@Entity
@Table(name = "MENU")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "menu")
public class Menu  extends BaseEntity{
    private Long id;
    private String name;
    private String url;
    private int order;
    private Menu parent;
    private String icon;
    private List<Menu> children;

    public Menu() {
    }

    public Menu(Long id) {
        this.id = id;
    }

    public Menu(String name, String url, int order, Menu parent, String icon) {
        this.name = name;
        this.url = url;
        this.order = order;
        this.parent = parent;
        this.icon = icon;
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
    public List<Menu> getChildren() {
        return children;
    }

    public void addChild(Menu menu) {
        getChildren().add(menu);
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Transient
    public Integer getParentOrder(){
        return getParent()==null ? null : getParent().getOrder();
    }

    @Override
    public String toString() {
        return "[ " + this.getClass() + " { ID : " + getId()+
                ", name: " + getName() +
                ", order: " + getOrder() +
                ", url: " + getUrl() +
                ", audit_time: " + getAuditData() + "}]";
    }
}

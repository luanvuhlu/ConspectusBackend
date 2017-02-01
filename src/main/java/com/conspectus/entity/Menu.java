package com.conspectus.entity;

import com.conspectus.entity.base.AbstractMenu;

import javax.persistence.*;

/**
 * Created by luan vu on 2/1/2017.
 */
@Entity
@Table
public class Menu extends AbstractMenu {
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

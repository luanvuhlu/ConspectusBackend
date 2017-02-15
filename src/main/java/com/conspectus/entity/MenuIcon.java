package com.conspectus.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by luan vu on 2/13/2017.
 */
@Entity
@Table(name = "MENU_ICON")
public class MenuIcon implements Serializable{
    private int id;
    private String value;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

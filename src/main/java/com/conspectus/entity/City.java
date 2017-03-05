package com.conspectus.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 */
@Entity
@Table(name = "CITY")
public class City {
    private Integer id;
    private String name;
    private List<University> universities;
    private List<User> accounts;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "city")
    public List<University> getUniversities() {
        return universities;
    }

    public void setUniversities(List<University> universities) {
        this.universities = universities;
    }

    @OneToMany(mappedBy = "city")
    public List<User> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<User> accounts) {
        this.accounts = accounts;
    }
}

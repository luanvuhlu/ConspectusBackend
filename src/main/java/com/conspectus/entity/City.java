package com.conspectus.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by luan vu on 1/25/2017.
 */
@Entity
@Table(name = "CITY")
public class City {
    private Integer id;
    private String name;
    private Set<University> universities;
    private Set<Account> accounts;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }

    @OneToMany(mappedBy = "city")
    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}

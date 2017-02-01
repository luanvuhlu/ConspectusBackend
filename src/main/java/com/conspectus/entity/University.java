package com.conspectus.entity;

import com.conspectus.entity.base.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by luan vu on 1/25/2017.
 * Trường đại học
 */
@Entity
@Table
public class University extends BaseEntity implements NameProperty, AddressProperty, HiddenProperty {
    private Long id;
    private String name;
    private String nameAbbr;
    private String address1;
    private String address2;
    private String address3;
    private boolean hidden;
    private City city;
    private Date founding;
    private Set<UClass> uClasses;
    private Set<Office> offices;
    private Set<Department> departments;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAbbr() {
        return nameAbbr;
    }

    public void setNameAbbr(String nameAbbr) {
        this.nameAbbr = nameAbbr;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getFounding() {
        return founding;
    }

    public void setFounding(Date founding) {
        this.founding = founding;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Set<UClass> getuClasses() {
        return uClasses;
    }

    public void setuClasses(Set<UClass> uClasses) {
        this.uClasses = uClasses;
    }

    public Set<Office> getOffices() {
        return offices;
    }

    public void setOffices(Set<Office> offices) {
        this.offices = offices;
    }

    public void addUClass(UClass uClass) {
        getuClasses().add(uClass);
    }

    public void removeUClass(UClass uClass) {
        getuClasses().remove(uClass);
    }

    public void addOffice(Office office) {
        getOffices().add(office);
    }

    public void removeOffice(Office office) {
        getOffices().remove(office);
    }

    @OneToMany(mappedBy = "university")
    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public void adđepartment(Department department) {
        getDepartments().add(department);
    }

    public void removeDepartment(Department department) {
        getDepartments().remove(department);
    }
}
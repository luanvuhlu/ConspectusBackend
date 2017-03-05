package com.conspectus.entity;

import com.conspectus.entity.base.AddressProperty;
import com.conspectus.entity.base.BaseEntity;
import com.conspectus.entity.base.HiddenProperty;
import com.conspectus.entity.base.NameProperty;
import com.conspectus.hibernate.type.NullBoolean;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by luan vu on 1/25/2017.
 * Trường đại học
 */
@Entity
@Table(name = "UNIVERSITY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE, region = "university")
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
    private List<UClass> uClasses;
    private List<Office> offices;
    private List<Department> departments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "NAME_ABBR")
    public String getNameAbbr() {
        return nameAbbr;
    }

    public void setNameAbbr(String nameAbbr) {
        this.nameAbbr = nameAbbr;
    }

    @Column(name = "ADDRESS_1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Column(name = "ADDRESS_2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Column(name = "ADDRESS_3")
    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    @JoinColumn(name = "CITY", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
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

    @Column(name = "HIDDEN")
    @Type(type = NullBoolean.NAME)
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @OneToMany(mappedBy = "university")
    public List<UClass> getuClasses() {
        return uClasses;
    }

    public void setuClasses(List<UClass> uClasses) {
        this.uClasses = uClasses;
    }

    @OneToMany(mappedBy = "university")
    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
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
    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void adđepartment(Department department) {
        getDepartments().add(department);
    }

    public void removeDepartment(Department department) {
        getDepartments().remove(department);
    }
}

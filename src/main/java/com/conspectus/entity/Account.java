package com.conspectus.entity;

import com.conspectus.entity.base.AddressProperty;
import com.conspectus.entity.base.BaseEntity;
import com.conspectus.entity.base.City;
import com.conspectus.entity.base.HiddenProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 * Tài khoản
 */
@Entity
@Table
public class Account extends BaseEntity implements AddressProperty, HiddenProperty {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String address3;
    private City city;
    private Date dateOfBirth;
    private AccountLoginType loginType;
    private boolean blocked;
    private boolean hidden;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @Column(name = "DATE_OF_BIRTH")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "LOGIN_TYPE")
    public AccountLoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(AccountLoginType loginType) {
        this.loginType = loginType;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}

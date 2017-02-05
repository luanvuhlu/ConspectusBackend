package com.conspectus.entity;

import com.conspectus.entity.base.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luan vu on 1/30/2017.
 * Tài khoản
 */
@Entity
@Table(name = "ACCOUNT")
public class Account implements AddressProperty, HiddenProperty, IEntity {
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
    private Account lastUpdatedBy;
    private boolean deleted;
    private Date createTime;
    private Date updateTime;


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

    @JoinColumn(name = "LAST_UPDATED_BY", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Account getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Account lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

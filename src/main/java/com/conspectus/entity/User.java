package com.conspectus.entity;

import com.conspectus.entity.base.AddressProperty;
import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luan vu on 3/5/2017.
 */
@Entity
@Table(name = "USER")
public class User extends BaseEntity implements AddressProperty {
    private Long id;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String address3;
    private City city;
    private Date dateOfBirth;
    private Account account;



    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
}

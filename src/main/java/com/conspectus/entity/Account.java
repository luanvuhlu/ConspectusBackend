package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;
import com.conspectus.entity.base.BlockedProperty;
import com.conspectus.entity.base.HiddenProperty;
import com.conspectus.entity.part.AccountLoginType;
import com.conspectus.hibernate.type.NullBoolean;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by luan vu on 1/30/2017.
 * Tài khoản
 */
@Entity
@Table(name = "ACCOUNT")
public class Account extends BaseEntity implements HiddenProperty, BlockedProperty {
    private Long id;
    private String username;
    private String email;
    private AccountLoginType loginType;
    private boolean blocked;
    private boolean hidden;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    @PrimaryKeyJoinColumn
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    @Column(name = "LOGIN_TYPE")
    public AccountLoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(AccountLoginType loginType) {
        this.loginType = loginType;
    }

    @Column(name = "BLOCKED")
    @Type(type = NullBoolean.NAME)
    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Column(name = "HIDDEN")
    @Type(type = NullBoolean.NAME)
    public boolean isHidden() {
        return hidden;
    }
}

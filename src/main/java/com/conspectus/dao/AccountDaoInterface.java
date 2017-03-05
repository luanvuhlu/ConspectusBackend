package com.conspectus.dao;

import com.conspectus.base.BaseDaoInterface;
import com.conspectus.entity.Account;
import com.conspectus.entity.User;

/**
 * Created by luan vu on 3/5/2017.
 */
public interface AccountDaoInterface extends BaseDaoInterface {
    void add(Account entity);
    boolean isExists(String userNameOrEmail);
    void update(Account entity);
    void updateAccount(Account entity);
    void updateUser(User entity);
    Account findById(Long id);
    void delete(Account entity);
}

package com.conspectus.service;

import com.conspectus.dao.AccountDaoInterface;
import com.conspectus.dao.impl.AccountDaoImpl;
import com.conspectus.entity.Account;
import com.conspectus.service.base.BaseService;

/**
 * Created by luan vu on 1/25/2017.
 */
public class AccountService extends BaseService {
    private AccountDaoInterface dao;
    public AccountService(){
        dao = new AccountDaoImpl();
    }

    public void add(Account entity) throws Exception {
        try {
            dao.openCurrentSessionWithTransaction();
            dao.add(entity);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSessionWithTransaction();
        }
    }

    public void update(Account entity) throws Exception {
        try {
            dao.openCurrentSessionWithTransaction();
            dao.update(entity);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSessionWithTransaction();
        }
    }

    public Account findById(Long id) throws Exception {
        try {
            dao.openCurrentSession();
            return dao.findById(id);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSession();
        }

    }

    public void delete(Account entity) throws Exception {
        try{
            dao.openCurrentSessionWithTransaction();
            dao.delete(entity);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSessionWithTransaction();
        }
    }

}

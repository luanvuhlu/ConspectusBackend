package com.conspectus.service;

import com.conspectus.dao.UniversityDaoImpl;
import com.conspectus.dao.UniversityDaoInterface;
import com.conspectus.entity.University;

/**
 * Created by luan vu on 1/25/2017.
 */
public class UniversityService extends BaseService{
    private UniversityDaoInterface dao;
    public UniversityService(){
        dao = new UniversityDaoImpl();
    }

    public void persist(University entity) throws Exception {
        try {
            dao.openCurrentSessionWithTransaction();
            dao.add(entity);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSessionWithTransaction();
        }
    }

    public void update(University entity) throws Exception {
        try {
            dao.openCurrentSessionWithTransaction();
            dao.update(entity);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSessionWithTransaction();
        }
    }

    public University findById(Long id) throws Exception {
        try {
            dao.openCurrentSession();
            return dao.findById(id);
        }catch (Exception e){
            throw e;
        }finally {
            dao.closeCurrentSession();
        }

    }

    public void delete(University entity) throws Exception {
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

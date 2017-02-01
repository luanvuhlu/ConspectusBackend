package com.conspectus.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by luan vu on 1/25/2017.
 */
public interface BaseDaoInterface {
    public Session openCurrentSession();
    public Session openCurrentSessionwithTransaction();
    public  void closeCurrentSession();
    public void closeCurrentSessionwithTransaction();
    public Session getCurrentSession();
    public void setCurrentSession(Session currentSession);
    public Transaction getCurrentTransaction();
    public void setCurrentTransaction(Transaction currentTransaction);
}

package com.conspectus.base;

import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class BaseDao {
    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() {
        if (currentSession == null || !currentSession.isOpen()) {
            currentSession = HibernateUtils.getFactory().openSession();
        }
        return currentSession;
    }

    public Session openCurrentSessionWithTransaction() {
        if (currentSession == null || !currentSession.isOpen()) {
            currentSession = HibernateUtils.getFactory().openSession();
        }
        if(currentTransaction==null) {
            currentTransaction = currentSession.beginTransaction();
        }
        return currentSession;
    }

    public void closeCurrentSession() {
        if (currentSession == null || !currentSession.isOpen()) {
            return;
        }
        currentSession.close();
    }

    public void closeCurrentSessionWithTransaction() {
        if (currentSession == null || !currentSession.isOpen()) {
            return;
        }
        currentTransaction.commit();
        currentSession.close();
    }



    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    protected <T, Z> CriteriaQueryGenerator getCriteriaQueryGenerator(Class<T> val, Class<Z> res) {
        return new CriteriaQueryGenerator(getCurrentSession(), val, res);
    }
    protected <T> CriteriaUpdateGenerator getCriteriaUpdateGenerator(Class<T> val) {
        return new CriteriaUpdateGenerator(getCurrentSession(), val);
    }
    protected <T> CriteriaDeleteGenerator getCriteriaDeleteGenerator(Class<T> val) {
        return new CriteriaDeleteGenerator(getCurrentSession(), val);
    }
}

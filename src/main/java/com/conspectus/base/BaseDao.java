package com.conspectus.base;

import com.conspectus.hibernate.base.CriteriaGenerator;
import com.conspectus.hibernate.base.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class BaseDao {
    private Session currentSession;
    private Transaction currentTransaction;
    private CriteriaGenerator criteriaGenerator;

    public BaseDao() {
        criteriaGenerator = new CriteriaGenerator();
    }

    public BaseDao(CriteriaGenerator criteriaGenerator) {
        this.criteriaGenerator = criteriaGenerator;
    }

    public Session openCurrentSession() {
        if (currentSession == null || !currentSession.isOpen()) {
            currentSession = getSessionFactory().openSession();
        }
        return currentSession;
    }

    private SessionFactory getSessionFactory(){
        return HibernateUtils.getInstance().getSessionFactory();
    }
    public Session openCurrentSessionWithTransaction() {
        if (currentSession == null || !currentSession.isOpen()) {
            currentSession = getSessionFactory().openSession();
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

    protected final <T> CriteriaDeleteGenerator<T> getCriteriaDeleteGenerator(Class<T> objClass) {
        criteriaGenerator.setSession(getCurrentSession());
        return criteriaGenerator.getCriteriaDeleteGenerator(objClass);
    }

    protected final <T, Z> CriteriaQueryGenerator<T,Z> getCriteriaQueryGenerator(Class<T> objClass1, Class<Z> objClass2) {
        criteriaGenerator.setSession(getCurrentSession());
        return criteriaGenerator.getCriteriaQueryGenerator(objClass1, objClass2);
    }

    protected final <T> CriteriaUpdateGenerator<T> getCriteriaUpdateGenerator(Class<T> objClass) {
        criteriaGenerator.setSession(getCurrentSession());
        return criteriaGenerator.getCriteriaUpdateGenerator(objClass);
    }
}

package com.conspectus.dao;

import com.conspectus.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public abstract class BaseDao {
    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        if (currentSession == null || !currentSession.isOpen()) {
            return;
        }
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        if (currentSession == null || !currentSession.isOpen()) {
            return;
        }
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Account.class)
                .addAnnotatedClass(AccountLoginType.class)
                .addAnnotatedClass(Awareness.class)
                .addAnnotatedClass(Awareness_Detail.class)
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Conspectus.class)
                .addAnnotatedClass(ConspectusLearningWeek.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Department_.class)
                .addAnnotatedClass(Exercise.class)
                .addAnnotatedClass(Faculty.class)
                .addAnnotatedClass(Holiday.class)
                .addAnnotatedClass(LearningDay.class)
                .addAnnotatedClass(LearningDayContent.class)
                .addAnnotatedClass(LearningDayRequirement.class)
                .addAnnotatedClass(LearningResource.class)
                .addAnnotatedClass(LearningResourceType.class)
                .addAnnotatedClass(LearningSession.class)
                .addAnnotatedClass(LearningWeek.class)
                .addAnnotatedClass(Library.class)
                .addAnnotatedClass(Menu.class)
                .addAnnotatedClass(Office.class)
                .addAnnotatedClass(Problem.class)
                .addAnnotatedClass(Problem_Detail.class)
                .addAnnotatedClass(Publishing.class)
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(Scholastic.class)
                .addAnnotatedClass(Semester.class)
                .addAnnotatedClass(Specialization.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(StudentSchedule.class)
                .addAnnotatedClass(Subject.class)
                .addAnnotatedClass(SubjectCommon.class)
                .addAnnotatedClass(SubjectStudentSchedule.class)
                .addAnnotatedClass(UClass.class)
                .addAnnotatedClass(University.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
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
}

package com.conspectus.hibernate.base;

import com.conspectus.entity.*;
import com.conspectus.entity.part.AccountLoginType;
import com.conspectus.entity.part.AuditData;
import com.conspectus.hibernate.type.AuditType;
import com.conspectus.hibernate.type.NullBoolean;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

/**
 * Created by luan vu on 3/4/2017.
 */
public final class HibernateUtils {
    private Configuration configuration;
    private SessionFactory sessionFactory;
    private Statistics stats;
    private static final HibernateUtils INSTANCE = new HibernateUtils();
    private HibernateUtils() {
        sessionFactory = getFactory();
        stats = sessionFactory.getStatistics();
    }

    public static synchronized HibernateUtils getInstance(){
        return INSTANCE;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private void cfgAnnotated(){
        configuration.addAnnotatedClass(MenuIcon.class)
            .addAnnotatedClass(Account.class)
            .addAnnotatedClass(User.class)
            .addAnnotatedClass(AccountLoginType.class)
            .addAnnotatedClass(Awareness.class)
            .addAnnotatedClass(AwarenessDetail.class)
            .addAnnotatedClass(City.class)
            .addAnnotatedClass(Conspectus.class)
            .addAnnotatedClass(ConspectusLearningWeek.class)
            .addAnnotatedClass(Course.class)
            .addAnnotatedClass(Department.class)
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
            .addAnnotatedClass(ProblemDetail.class)
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
    }

    private void cfgType(){
        configuration.registerTypeOverride(new AuditType(), new String[]{AuditData.class.getName()})
                .registerTypeOverride(new NullBoolean(), new String[]{NullBoolean.NAME});

    }

    private SessionFactory buildSessionFactory(){
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }

    private SessionFactory getFactory() {
        configuration = new Configuration().configure("hibernate.cfg.xml");
        cfgAnnotated();
        cfgType();
        return buildSessionFactory();
    }
    public void shutdown() {
        getSessionFactory().close();
    }

    public Statistics getStats() {
        return stats;
    }
}

package com.conspectus.base;

import com.conspectus.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by luanvv on 24/02/2017.
 */
public class HibernateUtils {
    private static final SessionFactory SESSION_FACTORY = getSessionFactory();
    private HibernateUtils(){

    }
    public static SessionFactory getFactory(){
        return SESSION_FACTORY;
    }
    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(MenuIcon.class)
                .addAnnotatedClass(Account.class)
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

}

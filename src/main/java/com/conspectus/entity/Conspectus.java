package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "CONSPECTUS")
public class Conspectus extends BaseEntity {
    private Long id;
    private List<Problem> problems;
    private List<Awareness> awarenesses;
    private List<ConspectusLearningWeek> conspectusLearningWeeks;
    private List<Exercise> exercises;
    private SubjectStudentSchedule subjectStudentSchedule;
    private Subject subject;
    private LearningSession learningSession;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "conspectus")
    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    @OneToMany(mappedBy = "conspectus")
    public List<Awareness> getAwarenesses() {
        return awarenesses;
    }

    public void setAwarenesses(List<Awareness> awarenesses) {
        this.awarenesses = awarenesses;
    }

    @OneToMany(mappedBy = "conspectus")
    public List<ConspectusLearningWeek> getConspectusLearningWeeks() {
        return conspectusLearningWeeks;
    }

    public void setConspectusLearningWeeks(List<ConspectusLearningWeek> conspectusLearningWeeks) {
        this.conspectusLearningWeeks = conspectusLearningWeeks;
    }

    @OneToMany(mappedBy = "conspectus")
    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    @JoinColumn(name = "SUBJECT_STUDENT_SCHEDULE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public SubjectStudentSchedule getSubjectStudentSchedule() {
        return subjectStudentSchedule;
    }

    public void setSubjectStudentSchedule(SubjectStudentSchedule subjectStudentSchedule) {
        this.subjectStudentSchedule = subjectStudentSchedule;
    }

    @JoinColumn(name = "SUBJECT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @JoinColumn(name = "LEARNING_SESSION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public LearningSession getLearningSession() {
        return learningSession;
    }

    public void setLearningSession(LearningSession learningSession) {
        this.learningSession = learningSession;
    }
}

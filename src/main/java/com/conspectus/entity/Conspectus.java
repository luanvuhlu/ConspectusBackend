package com.conspectus.entity;

import com.conspectus.entity.base.IEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "CONSPECTUS")
public class Conspectus implements IEntity {
    private Long id;
    private Set<Problem> problems;
    private Set<Awareness> awarenesses;
    private Set<ConspectusLearningWeek> conspectusLearningWeeks;
    private Set<Exercise> exercises;
    private SubjectStudentSchedule subjectStudentSchedule;
    private Subject subject;
    private LearningSession learningSession;
    private Account lastUpdatedBy;
    private boolean deleted;
    private Date createTime;
    private Date updateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "conspectus")
    public Set<Problem> getProblems() {
        return problems;
    }

    public void setProblems(Set<Problem> problems) {
        this.problems = problems;
    }

    @OneToMany(mappedBy = "conspectus")
    public Set<Awareness> getAwarenesses() {
        return awarenesses;
    }

    public void setAwarenesses(Set<Awareness> awarenesses) {
        this.awarenesses = awarenesses;
    }

    @OneToMany(mappedBy = "conspectus")
    public Set<ConspectusLearningWeek> getConspectusLearningWeeks() {
        return conspectusLearningWeeks;
    }

    public void setConspectusLearningWeeks(Set<ConspectusLearningWeek> conspectusLearningWeeks) {
        this.conspectusLearningWeeks = conspectusLearningWeeks;
    }

    @OneToMany(mappedBy = "conspectus")
    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }

    @JoinColumn(name = "SUBJECT_STUDENT_SCHEDULE", nullable = false)
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

    @JoinColumn(name = "LAST_UPDATED_BY", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Account getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Account lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

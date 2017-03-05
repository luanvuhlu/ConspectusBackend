package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "SUBJECT")
public class Subject extends BaseEntity {
    private Long id;
    private Course course;
    private SubjectCommon subjectCommon;
    private LearningSession learningSession;
    private List<Conspectus> conspectuses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "COURSE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @JoinColumn(name = "SUBJECT_COMMON_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public SubjectCommon getSubjectCommon() {
        return subjectCommon;
    }

    public void setSubjectCommon(SubjectCommon subjectCommon) {
        this.subjectCommon = subjectCommon;
    }

    @JoinColumn(name = "LEARNING_SESSION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public LearningSession getLearningSession() {
        return learningSession;
    }

    public void setLearningSession(LearningSession learningSession) {
        this.learningSession = learningSession;
    }

    @OneToMany(mappedBy = "subject")
    public List<Conspectus> getConspectuses() {
        return conspectuses;
    }

    public void setConspectuses(List<Conspectus> conspectuses) {
        this.conspectuses = conspectuses;
    }
}

package com.conspectus.entity;

import com.conspectus.entity.base.IEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "SUBJECT")
public class Subject implements IEntity {
    private Long id;
    private Course course;
    private SubjectCommon subjectCommon;
    private LearningSession learningSession;
    private Set<Conspectus> conspectuses;
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
    public Set<Conspectus> getConspectuses() {
        return conspectuses;
    }

    public void setConspectuses(Set<Conspectus> conspectuses) {
        this.conspectuses = conspectuses;
    }
}

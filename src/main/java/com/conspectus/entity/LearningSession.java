package com.conspectus.entity;

import com.conspectus.entity.base.IEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_SESSION")
public class LearningSession implements IEntity{
    private Long id;
    private Semester semester;
    private Set<Conspectus> conspectuses;
    private Set<LearningWeek> learningWeeks;
    private Set<Subject> subjects;
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

    @JoinColumn(name = "SEMESTER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @OneToMany(mappedBy = "learningSession")
    public Set<Conspectus> getConspectuses() {
        return conspectuses;
    }

    public void setConspectuses(Set<Conspectus> conspectuses) {
        this.conspectuses = conspectuses;
    }

    @OneToMany(mappedBy = "learningSession")
    public Set<LearningWeek> getLearningWeeks() {
        return learningWeeks;
    }

    public void setLearningWeeks(Set<LearningWeek> learningWeeks) {
        this.learningWeeks = learningWeeks;
    }

    @OneToMany(mappedBy = "learningSession")
    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
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

    @Column(name = "CREATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

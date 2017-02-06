package com.conspectus.entity;

import com.conspectus.entity.base.IEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_DAY")
public class LearningDay  implements IEntity {
    private Long id;
    private ConspectusLearningWeek conspectusLearningWeek;
    private Set<LearningDayContent> learningDayContents;
    private Set<LearningDayRequirement> learningDayRequirements;
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

    @JoinColumn(name = "CONSPECTUS_LEARNING_WEEK_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public ConspectusLearningWeek getConspectusLearningWeek() {
        return conspectusLearningWeek;
    }

    public void setConspectusLearningWeek(ConspectusLearningWeek conspectusLearningWeek) {
        this.conspectusLearningWeek = conspectusLearningWeek;
    }

    @OneToMany(mappedBy = "learningDay")
    public Set<LearningDayContent> getLearningDayContents() {
        return learningDayContents;
    }

    public void setLearningDayContents(Set<LearningDayContent> learningDayContents) {
        this.learningDayContents = learningDayContents;
    }

    @OneToMany(mappedBy = "learningDay")
    public Set<LearningDayRequirement> getLearningDayRequirements() {
        return learningDayRequirements;
    }

    public void setLearningDayRequirements(Set<LearningDayRequirement> learningDayRequirements) {
        this.learningDayRequirements = learningDayRequirements;
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

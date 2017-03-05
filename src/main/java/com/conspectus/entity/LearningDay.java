package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_DAY")
public class LearningDay extends BaseEntity {
    private Long id;
    private ConspectusLearningWeek conspectusLearningWeek;
    private List<LearningDayContent> learningDayContents;
    private List<LearningDayRequirement> learningDayRequirements;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public List<LearningDayContent> getLearningDayContents() {
        return learningDayContents;
    }

    public void setLearningDayContents(List<LearningDayContent> learningDayContents) {
        this.learningDayContents = learningDayContents;
    }

    @OneToMany(mappedBy = "learningDay")
    public List<LearningDayRequirement> getLearningDayRequirements() {
        return learningDayRequirements;
    }

    public void setLearningDayRequirements(List<LearningDayRequirement> learningDayRequirements) {
        this.learningDayRequirements = learningDayRequirements;
    }
}

package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_WEEK")
public class LearningWeek extends BaseEntity{
    private Long id;
    private LearningSession learningSession;
    private List<ConspectusLearningWeek> conspectusLearningWeeks;

    public LearningWeek() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "LEARNING_SESSION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public LearningSession getLearningSession() {
        return learningSession;
    }

    public void setLearningSession(LearningSession learningSession) {
        this.learningSession = learningSession;
    }

    @OneToMany(mappedBy = "learningWeek")
    public List<ConspectusLearningWeek> getConspectusLearningWeeks() {
        return conspectusLearningWeeks;
    }

    public void setConspectusLearningWeeks(List<ConspectusLearningWeek> conspectusLearningWeeks) {
        this.conspectusLearningWeeks = conspectusLearningWeeks;
    }
}

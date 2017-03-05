package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_DAY_CONTENT")
public class LearningDayContent extends BaseEntity{
    private Long id;
    private LearningDay learningDay;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "LEARNING_DAY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public LearningDay getLearningDay() {
        return learningDay;
    }

    public void setLearningDay(LearningDay learningDay) {
        this.learningDay = learningDay;
    }
}

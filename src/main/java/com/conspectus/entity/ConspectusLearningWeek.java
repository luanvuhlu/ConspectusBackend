package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "CONSPECTUS_LEARNING_WEEK")
public class ConspectusLearningWeek extends BaseEntity {
    private Long id;
    private LearningWeek learningWeek;
    private Conspectus conspectus;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "LEARNING_WEEK_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public LearningWeek getLearningWeek() {
        return learningWeek;
    }

    public void setLearningWeek(LearningWeek learningWeek) {
        this.learningWeek = learningWeek;
    }

    @JoinColumn(name = "CONSPECTUS_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Conspectus getConspectus() {
        return conspectus;
    }

    public void setConspectus(Conspectus conspectus) {
        this.conspectus = conspectus;
    }
}

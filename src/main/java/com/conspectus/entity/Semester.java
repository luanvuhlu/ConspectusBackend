package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "SEMESTER")
public class Semester extends BaseEntity {
    private Long id;
    private Scholastic scholastic;
    private List<LearningSession> learningSessions;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "SCHOLASTIC_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Scholastic getScholastic() {
        return scholastic;
    }

    public void setScholastic(Scholastic scholastic) {
        this.scholastic = scholastic;
    }

    @OneToMany(mappedBy = "semester")
    public List<LearningSession> getLearningSessions() {
        return learningSessions;
    }

    public void setLearningSessions(List<LearningSession> learningSessions) {
        this.learningSessions = learningSessions;
    }
}

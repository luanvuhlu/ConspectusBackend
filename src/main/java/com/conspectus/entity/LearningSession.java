package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_SESSION")
public class LearningSession extends BaseEntity{
    private Long id;
    private Semester semester;
    private List<Conspectus> conspectuses;
    private List<LearningWeek> learningWeeks;
    private List<Subject> subjects;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public List<Conspectus> getConspectuses() {
        return conspectuses;
    }

    public void setConspectuses(List<Conspectus> conspectuses) {
        this.conspectuses = conspectuses;
    }

    @OneToMany(mappedBy = "learningSession")
    public List<LearningWeek> getLearningWeeks() {
        return learningWeeks;
    }

    public void setLearningWeeks(List<LearningWeek> learningWeeks) {
        this.learningWeeks = learningWeeks;
    }

    @OneToMany(mappedBy = "learningSession")
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

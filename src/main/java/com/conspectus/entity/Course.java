package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "COURSE")
public class Course extends BaseEntity {
    private Long id;
    private List<Subject> subjects;
    private University university;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "course")
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @JoinColumn(name = "UNIVERSITY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}

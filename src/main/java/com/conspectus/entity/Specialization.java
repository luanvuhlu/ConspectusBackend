package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 * Chuyên khoa của sv
 */
@Entity
@Table(name = "SPECIALIZTION")
public class Specialization extends BaseEntity{
    private Long id;
    private University university;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

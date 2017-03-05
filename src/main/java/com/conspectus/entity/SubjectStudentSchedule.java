package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "SUBJECT_STUDENT_SCHEDULE")
public class SubjectStudentSchedule extends BaseEntity {
    private Long id;
    private StudentSchedule studentSchedule;
    private Conspectus conspectus;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "STUDENT_SCHEDULE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public StudentSchedule getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(StudentSchedule studentSchedule) {
        this.studentSchedule = studentSchedule;
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

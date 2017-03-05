package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "STUDENT_SCHEDULE")
public class StudentSchedule extends BaseEntity {
    private Long id;
    private Student student;
    private List<SubjectStudentSchedule> subjectStudentSchedules;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "STUDENT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @OneToMany(mappedBy = "studentSchedule")
    public List<SubjectStudentSchedule> getSubjectStudentSchedules() {
        return subjectStudentSchedules;
    }

    public void setSubjectStudentSchedules(List<SubjectStudentSchedule> subjectStudentSchedules) {
        this.subjectStudentSchedules = subjectStudentSchedules;
    }
}

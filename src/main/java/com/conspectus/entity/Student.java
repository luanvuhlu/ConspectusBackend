package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "STUDENT")
public class Student extends BaseEntity {
    private Long id;
    private Account account;
    private UClass uClass;
    private Specialization specialization;
    private List<StudentSchedule> studentSchedules;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @JoinColumn(name = "CLASS_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public UClass getuClass() {
        return uClass;
    }

    public void setuClass(UClass uClass) {
        this.uClass = uClass;
    }

    @JoinColumn(name = "SPECIALIZATION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @OneToMany(mappedBy = "student")
    public List<StudentSchedule> getStudentSchedules() {
        return studentSchedules;
    }

    public void setStudentSchedules(List<StudentSchedule> studentSchedules) {
        this.studentSchedules = studentSchedules;
    }
}

package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "PROBLEM_DETAIL")
public class ProblemDetail extends BaseEntity{
    private Long id;
    private Problem problem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "PROBLEM_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }
}

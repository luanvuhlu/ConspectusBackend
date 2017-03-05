package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "PROBLEM")
public class Problem extends BaseEntity{
    private Long id;
    private Conspectus conspectus;
    private List<ProblemDetail> problemDetails;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "CONSPECTUS_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Conspectus getConspectus() {
        return conspectus;
    }

    public void setConspectus(Conspectus conspectus) {
        this.conspectus = conspectus;
    }

    @OneToMany(mappedBy = "problem")
    public List<ProblemDetail> getProblemDetails() {
        return problemDetails;
    }

    public void setProblemDetails(List<ProblemDetail> problemDetails) {
        this.problemDetails = problemDetails;
    }
}

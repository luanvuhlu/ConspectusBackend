package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "AWARENESS_DETAIL")
public class AwarenessDetail extends BaseEntity {
    private Long id;
    private Awareness awareness;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "AWARENESS_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Awareness getAwareness() {
        return awareness;
    }

    public void setAwareness(Awareness awareness) {
        this.awareness = awareness;
    }
}

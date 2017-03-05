package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "AWARENESS")
public class Awareness extends BaseEntity {
    private Long id;
    private List<AwarenessDetail> awarenessDetails;
    private Conspectus conspectus;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "awareness")
    public List<AwarenessDetail> getAwarenessDetails() {
        return awarenessDetails;
    }

    public void setAwarenessDetails(List<AwarenessDetail> awarenessDetails) {
        this.awarenessDetails = awarenessDetails;
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

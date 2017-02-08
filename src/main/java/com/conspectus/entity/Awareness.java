package com.conspectus.entity;

import com.conspectus.entity.base.IEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "AWARENESS")
public class Awareness implements IEntity{
    private Long id;
    private Set<AwarenessDetail> awarenessDetails;
    private Conspectus conspectus;
    private Account lastUpdatedBy;
    private boolean deleted;
    private Date createTime;
    private Date updateTime;

    @JoinColumn(name = "LAST_UPDATED_BY", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Account getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Account lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "awareness")
    public Set<AwarenessDetail> getAwarenessDetails() {
        return awarenessDetails;
    }

    public void setAwarenessDetails(Set<AwarenessDetail> awarenessDetails) {
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

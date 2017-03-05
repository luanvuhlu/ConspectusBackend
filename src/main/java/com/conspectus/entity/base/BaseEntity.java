package com.conspectus.entity.base;

import com.conspectus.entity.User;
import com.conspectus.entity.part.AuditData;
import com.conspectus.hibernate.type.NullBoolean;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by luan vu on 3/5/2017.
 */
@MappedSuperclass
public class BaseEntity implements IEntity {
    private User lastUpdatedBy;
    private boolean deleted;
    private AuditData auditData;

    @JoinColumn(name = "LAST_UPDATED_BY", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public User getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(User lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Column(name = "DELETED")
    @Type(type = NullBoolean.NAME)
    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Columns(columns =
            {@Column(name = "CREATE_TIME"), @Column(name = "UPDATE_TIME")}
    )
    protected AuditData getAuditData() {
        return auditData;
    }

    public void setAuditData(AuditData auditData) {
        this.auditData = auditData;
    }
}

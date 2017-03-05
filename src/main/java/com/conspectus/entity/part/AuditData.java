package com.conspectus.entity.part;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luan vu on 3/5/2017.
 */
public class AuditData implements Serializable{
    private Date createTime;
    private Date updateTime;

    public AuditData() {
    }

    public AuditData(AuditData other) {
        setCreateTime(other.getCreateTime());
        setUpdateTime(other.getUpdateTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuditData auditData = (AuditData) o;

        if (!createTime.equals(auditData.createTime)) return false;
        return updateTime != null ? updateTime.equals(auditData.updateTime) : auditData.updateTime == null;
    }

    @Override
    public int hashCode() {
        int result = createTime.hashCode();
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "[ " + this.getClass() + " { createdTime : " + createTime+
                ", updatedTime: " + updateTime + "}]";
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

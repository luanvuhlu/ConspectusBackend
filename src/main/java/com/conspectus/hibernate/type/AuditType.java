package com.conspectus.hibernate.type;

import com.conspectus.entity.part.AuditData;
import com.luanvv.utils.time.DateConvert;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by luan vu on 3/5/2017.
 */
public class AuditType implements UserType {
    private static final Logger log = Logger.getLogger(AuditType.class);
    public static final String NAME = "audit";
    private static final int[] SQL_TYPES = {Types.DATE, Types.DATE};
    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    public Class returnedClass() {
        return AuditData.class;
    }

    public boolean equals(Object o1, Object o2) throws HibernateException {
        if (o1 == o2) {
            return true;
        }
        if (null == o1 || null == o2) {
            return false;
        }
        return o1.equals(o2);
    }

    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner) throws HibernateException, SQLException {
        AuditData auditData = null;
        if (!rs.wasNull()) {
            auditData = new AuditData();
            auditData.setCreateTime(rs.getDate(names[0]));
            auditData.setUpdateTime(rs.getDate(names[1]));
        }
        return auditData;
    }

    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
        if (null == value) {
            st.setNull(index, SQL_TYPES[0]);
            st.setNull(index, SQL_TYPES[1]);
            return;
        }
        AuditData auditData = (AuditData) value;
        log.debug("Saving object " + auditData);

        if(null != auditData.getCreateTime()) {
            st.setDate(index, DateConvert.convertSql(auditData.getCreateTime()));
        }else{
            st.setNull(index, Types.DATE);
        }

        if(null != auditData.getUpdateTime()) {
            st.setDate(index+1, DateConvert.convertSql(auditData.getUpdateTime()));
        }else{
            st.setNull(index+1, Types.DATE);
        }
    }

    public Object deepCopy(Object value) throws HibernateException {
        final AuditData recievedParam = (AuditData) value;
        return new AuditData(recievedParam);
    }

    public boolean isMutable() {
        return true;
    }

    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) value;
    }

    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return cached;
    }

    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return this.deepCopy(original);
    }
}

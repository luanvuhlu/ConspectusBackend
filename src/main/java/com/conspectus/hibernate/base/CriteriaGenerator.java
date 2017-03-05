package com.conspectus.hibernate.base;

import com.conspectus.base.CriteriaDeleteGenerator;
import com.conspectus.base.CriteriaQueryGenerator;
import com.conspectus.base.CriteriaUpdateGenerator;
import org.hibernate.Session;

/**
 * Created by luan vu on 3/4/2017.
 */
public class CriteriaGenerator {
    private Session session;

    public <T, Z> CriteriaQueryGenerator getCriteriaQueryGenerator(Class<T> val, Class<Z> res) {
        return new CriteriaQueryGenerator(session, val, res);
    }
    public <T> CriteriaUpdateGenerator getCriteriaUpdateGenerator(Class<T> val) {
        return new CriteriaUpdateGenerator(session, val);
    }
    public <T> CriteriaDeleteGenerator getCriteriaDeleteGenerator(Class<T> val) {
        return new CriteriaDeleteGenerator(session, val);
    }

    public void setSession(Session session) {
        this.session = session;
    }
}

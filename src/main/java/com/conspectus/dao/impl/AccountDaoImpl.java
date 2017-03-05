package com.conspectus.dao.impl;

import com.conspectus.base.BaseDao;
import com.conspectus.base.CriteriaQueryGenerator;
import com.conspectus.base.CriteriaUpdateGenerator;
import com.conspectus.dao.AccountDaoInterface;
import com.conspectus.entity.Account;
import com.conspectus.entity.Account_;
import com.conspectus.entity.User;
import com.conspectus.entity.User_;
import com.conspectus.entity.base.BaseEntity_;
import com.conspectus.hibernate.base.Builder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by luan vu on 3/5/2017.
 */
public class AccountDaoImpl extends BaseDao implements AccountDaoInterface {

    public void add(Account entity) {
        getCurrentSession().save(entity);
        getCurrentSession().save(entity.getUser());
    }

    @Override
    public boolean isExists(String userNameOrEmail) {
        CriteriaQueryGenerator<Account, Long> generator = getCriteriaQueryGenerator(Account.class, Long.class);
        CriteriaBuilder builder = generator.getBuilder();
        Root<Account> root = generator.getRoot();
        CriteriaQuery<Long> criteria = generator.getCriteria()
                .select(
                        builder.count(root)
                )
                .where(builder.and(
                        builder.or(
                                builder.equal(root.get(Account_.email), userNameOrEmail),
                                builder.equal(root.get(Account_.username), userNameOrEmail)
                        ),
                        Builder.isNotDeleted(builder, root)
                ));
        return getCurrentSession()
                .createQuery(criteria)
                .getSingleResult() > 0;
    }

    public void update(Account entity) {
        updateAccount(entity);
        updateUser(entity.getUser());
    }

    @Override
    public void updateAccount(Account entity) {
        getCurrentSession().update(entity);
    }

    @Override
    public void updateUser(User entity) {
        getCurrentSession().update(entity);
    }

    public Account findById(Long id) {
        CriteriaQueryGenerator<Account, Account> generator = getCriteriaQueryGenerator(Account.class, Account.class);
        CriteriaBuilder builder = generator.getBuilder();
        Root<Account> root = generator.getRoot();
        root.join(Account_.user);
        CriteriaQuery<Account> criteria = generator.getCriteria()
                .select(root)
                .where(builder.and(
                        builder.equal(root.get(Account_.id), id),
                        Builder.isNotDeleted(builder, root)
                ));
        return getCurrentSession()
                .createQuery(criteria)
                .uniqueResult();
    }

    public void delete(Account entity) {
        deleteAccount(entity.getId());
        deleteUser(entity.getId());
    }
    private void deleteAccount(Long id){
        CriteriaUpdateGenerator<Account> generator = getCriteriaUpdateGenerator(Account.class);
        CriteriaBuilder builder = generator.getBuilder();
        Root<Account> root = generator.getRoot();
        generator.getCriteria()
                .set(BaseEntity_.deleted, true);
        generator.getCriteria().where(
                builder.equal(
                        root.get(Account_.id), id
                )
        );
        getCurrentSession().createQuery(generator.getCriteria()).executeUpdate();
    }
    private void deleteUser(Long id){
        CriteriaUpdateGenerator<User> generator = getCriteriaUpdateGenerator(User.class);
        CriteriaBuilder builder = generator.getBuilder();
        Root<User> root = generator.getRoot();
        generator.getCriteria()
                .set(BaseEntity_.deleted, true);
        generator.getCriteria().where(
                builder.equal(
                        root.get(User_.id), id
                )
        );
        getCurrentSession().createQuery(generator.getCriteria()).executeUpdate();
    }
}

package model.repository.impl;

import model.DataSource;
import model.entity.Role;
import model.entity.User;
import model.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save(User user) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
    }

    @Override
    public User findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from User");
        return query.getResultList();
    }

    @Override
    public void delete(User user) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
        entityManager.getTransaction().commit();
    }
}

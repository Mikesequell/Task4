package model.repository.impl;

import model.DataSource;
import model.entity.Country;
import model.entity.Login;
import model.repository.LoginRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class LoginRepositoryImpl implements LoginRepository {
    @Override
    public void save(Login login) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(login);
        transaction.commit();
    }

    @Override
    public Login findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Login.class, id);
    }

    @Override
    public List<Login> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Login");
        return query.getResultList();
    }

    @Override
    public void delete(Login login) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(login) ? login : entityManager.merge(login));
        entityManager.getTransaction().commit();
    }
}

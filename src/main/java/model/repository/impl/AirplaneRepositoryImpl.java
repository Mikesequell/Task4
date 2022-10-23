package model.repository.impl;

import model.DataSource;
import model.entity.AirCompany;
import model.entity.Airplane;
import model.repository.AirplaneRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class AirplaneRepositoryImpl implements AirplaneRepository {
    @Override
    public void save(Airplane airplane) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(airplane);
        transaction.commit();
    }

    @Override
    public Airplane findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Airplane.class, id);
    }

    @Override
    public List<Airplane> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Airplane");
        return query.getResultList();
    }

    @Override
    public void delete(Airplane airplane) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(airplane) ? airplane : entityManager.merge(airplane));
        entityManager.getTransaction().commit();
    }
}

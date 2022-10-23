package model.repository.impl;

import model.DataSource;
import model.entity.City;
import model.entity.Country;
import model.repository.CountryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class CountryRepositoryImpl implements CountryRepository {
    @Override
    public void save(Country country) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(country);
        transaction.commit();
    }

    @Override
    public Country findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Country.class, id);
    }

    @Override
    public List<Country> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Country");
        return query.getResultList();
    }

    @Override
    public void delete(Country country) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(country) ? country : entityManager.merge(country));
        entityManager.getTransaction().commit();
    }
}

package model.repository.impl;

import model.DataSource;
import model.entity.Airplane;
import model.entity.City;
import model.repository.CityRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class CityRepositoryImpl implements CityRepository {
    @Override
    public void save(City city) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(city);
        transaction.commit();
    }

    @Override
    public City findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(City.class, id);
    }

    @Override
    public List<City> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from City");
        return query.getResultList();
    }

    @Override
    public void delete(City city) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(city) ? city : entityManager.merge(city));
        entityManager.getTransaction().commit();
    }
}

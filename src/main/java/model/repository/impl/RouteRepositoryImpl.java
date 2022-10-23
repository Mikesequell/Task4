package model.repository.impl;

import model.DataSource;
import model.entity.Role;
import model.entity.Route;
import model.repository.RouteRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class RouteRepositoryImpl implements RouteRepository {
    @Override
    public void save(Route route) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(route);
        transaction.commit();
    }

    @Override
    public Route findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Route.class, id);
    }

    @Override
    public List<Route> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Route");
        return query.getResultList();
    }

    @Override
    public void delete(Route route) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(route) ? route : entityManager.merge(route));
        entityManager.getTransaction().commit();
    }
}

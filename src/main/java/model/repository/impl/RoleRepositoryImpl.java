package model.repository.impl;

import model.DataSource;
import model.entity.Login;
import model.entity.Role;
import model.repository.RoleRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class RoleRepositoryImpl implements RoleRepository {
    @Override
    public void save(Role role) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(role);
        transaction.commit();
    }

    @Override
    public Role findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Role.class, id);
    }

    @Override
    public List<Role> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Role");
        return query.getResultList();
    }

    @Override
    public void delete(Role role) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(role) ? role : entityManager.merge(role));
        entityManager.getTransaction().commit();
    }
}

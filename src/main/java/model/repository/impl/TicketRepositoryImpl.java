package model.repository.impl;

import model.DataSource;
import model.entity.Role;
import model.entity.Ticket;
import model.repository.TicketRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class TicketRepositoryImpl implements TicketRepository {
    @Override
    public void save(Ticket ticket) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(ticket);
        transaction.commit();
    }

    @Override
    public Ticket findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Ticket.class, id);
    }

    @Override
    public List<Ticket> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket");
        return query.getResultList();
    }

    @Override
    public void delete(Ticket ticket) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(ticket) ? ticket : entityManager.merge(ticket));
        entityManager.getTransaction().commit();
    }
}

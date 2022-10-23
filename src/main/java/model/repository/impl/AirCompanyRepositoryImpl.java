package model.repository.impl;


import model.DataSource;
import model.entity.AirCompany;
import model.repository.AirCompanyRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import javax.persistence.EntityManager;
import java.util.List;

public class AirCompanyRepositoryImpl implements AirCompanyRepository {
    @Override
    public void save(AirCompany airCompany) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(airCompany);
        transaction.commit();
    }

    @Override
    public AirCompany findId(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(AirCompany.class, id);
    }

    @Override
    public List<AirCompany> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from AirCompany");
        return query.getResultList();
    }

    @Override
    public void delete(AirCompany airCompany) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(airCompany) ? airCompany : entityManager.merge(airCompany));
        entityManager.getTransaction().commit();
    }
}

package com.epam.mentoring.invman.dao;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.epam.mentoring.invman.entity.Warehouse;

public class WarehouseDao implements DataAccessObject<Warehouse> {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void save(final Warehouse warehouse) {
        final Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(warehouse);
        session.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public Collection<Warehouse> listAll() {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Warehouse");
        final List<Warehouse> warehouses = (List<Warehouse>) query.list();
        return warehouses;
    }

    @Override
    public Warehouse findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Warehouse entity) {
        // TODO Auto-generated method stub

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}

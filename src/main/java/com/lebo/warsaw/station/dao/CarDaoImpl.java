package com.lebo.warsaw.station.dao;

import com.lebo.warsaw.station.model.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CarDaoImpl implements CarDao {

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public Car getCarByIdFromDb(int id) {
        Query query = getCurrentSession().createQuery("from Car where id=:id");
        query.setParameter("id", id);
        return (Car) query.getSingleResult();
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}

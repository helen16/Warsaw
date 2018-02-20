package com.lebo.warsaw.station.dao;

import com.lebo.warsaw.station.model.entity.Place;
import com.lebo.warsaw.station.model.entity.PlaceCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@SuppressWarnings("unchecked")
public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public List<PlaceCategory> getCategories() {
        List<?> list = getCurrentSession().createQuery("from PlaceCategory").list();
        return (List<PlaceCategory>) list;
    }

    @Override
    public List<Place> getByCategoryId(List<Integer> id) {
        Query query = getCurrentSession().createQuery("from Place where categoryId IN (:ids)");
        query.setParameterList("ids", id);
        return ((List<Place>) query.list());
    }

    @Override
    public List<Place> getAll() {
        Query query = getCurrentSession().createQuery("from Place");
        return ((List<Place>) query.list());
    }

    @Override
    public Place getById(Integer id) {
        Query query = getCurrentSession().createQuery("from Place where id=:id");
        query.setParameter("id", id);
        return (Place) query.getSingleResult();
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}

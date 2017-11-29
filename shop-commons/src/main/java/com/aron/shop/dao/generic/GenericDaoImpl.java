package com.aron.shop.dao.generic;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
@Stateless
public class GenericDaoImpl <T, PK extends Serializable> implements GenericDao<T, PK>{

    private Class<T> type;

    public GenericDaoImpl() {
    }

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    @PersistenceContext(unitName = "shop-PU")
    public EntityManager entityManager;

    @Override
    public void create(T newInstance) {
        entityManager.persist(newInstance);
    }

    @Override
    public T findOne(PK id) {
        return entityManager.find(type,id);
    }

    @Override
    public List<T> findAll() {
        Query query = entityManager.createQuery("Select t from" + type.getSimpleName() + "t" + type);
        return query.getResultList();
    }

    @Override
    public void update(T transientObject) {
        entityManager.merge(transientObject);
    }

    @Override
    public void delete(T persistentObject) {
        entityManager.remove(persistentObject);
    }
}

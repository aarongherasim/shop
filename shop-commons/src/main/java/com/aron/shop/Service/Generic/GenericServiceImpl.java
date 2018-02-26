package com.aron.shop.Service.Generic;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.AbstractEntity;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
@Transactional
public abstract class GenericServiceImpl<T extends AbstractEntity> {

    public static final String ENTITY_NOT_FOUND_EXCEPTION = "Entity not found";

    @Inject
    private GenericDaoImpl<T, Long> genericDao;

    public GenericServiceImpl() {
    }

    public GenericServiceImpl(GenericDaoImpl genericDao) {
        this.genericDao = genericDao;
    }

    public boolean create(T newInstance) {
        if (genericDao.findOne(newInstance.getId()) == null){
            genericDao.create(newInstance);
            return true;
        }
        return false;
    }

    public T findOne(Long id) {
        T entity = genericDao.findOne(id);
        if (entity == null)
            throw new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION);
        return entity;
    }

    public List<T> findAll() {
        return genericDao.findAll();
    }

    public boolean update(T transientObject) {
        if (genericDao.findOne(transientObject.getId()) != null) {
            genericDao.update(transientObject);
            return true;
        }
        return false;
    }

    public void delete(T persistentObject) {
        genericDao.delete(persistentObject);
    }

    public GenericDaoImpl<T, Long> genericDao() {
        return genericDao;
    }
}

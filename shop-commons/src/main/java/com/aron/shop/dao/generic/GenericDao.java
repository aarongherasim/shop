package com.aron.shop.dao.generic;

import java.io.Serializable;
import java.util.List;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public interface GenericDao <T, PK extends Serializable> {

    void create(T newInstance);

    T findOne(PK id);

    List<T> findAll();

    void update(T transientObject);

    void delete(T persistentObject);
}

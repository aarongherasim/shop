package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Categories;

import javax.ejb.Stateless;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
@Stateless
public class CategoriesDao extends GenericDaoImpl<Categories, Long> {

    public CategoriesDao() {
        super(Categories.class);
    }
}

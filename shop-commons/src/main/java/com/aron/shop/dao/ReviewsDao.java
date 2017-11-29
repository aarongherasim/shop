package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Reviews;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public class ReviewsDao extends GenericDaoImpl <Reviews, Long> {

    public ReviewsDao() {
        super(Reviews.class);
    }
}

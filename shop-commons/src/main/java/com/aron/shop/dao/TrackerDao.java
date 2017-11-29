package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Tracker;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public class TrackerDao extends GenericDaoImpl <Tracker, Long> {

    public TrackerDao() {
        super(Tracker.class);
    }
}

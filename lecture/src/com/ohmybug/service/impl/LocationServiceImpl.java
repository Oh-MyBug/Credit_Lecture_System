package com.ohmybug.service.impl;

import com.ohmybug.dao.LocationDao;
import com.ohmybug.dao.impl.LocationDaoImpl;
import com.ohmybug.pojo.Location;
import com.ohmybug.service.LocationService;

import java.util.List;

/**
 * ClassName:   LocationServiceImpl
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class LocationServiceImpl implements LocationService {
    private LocationDao locationDao = new LocationDaoImpl();

    @Override
    public int addLocation(Location location) {
        return locationDao.addLocation(location);
    }

    @Override
    public int deleteLocationById(Integer id) {
        return locationDao.deleteLocationById(id);
    }

    @Override
    public int updateLocation(Location location) {
        return locationDao.updateLocation(location);
    }

    @Override
    public Location queryLocationById(Integer id) {
        return locationDao.queryLocationById(id);
    }

    @Override
    public List<Location> queryLocations() {
        return locationDao.queryLocations();
    }

    @Override
    public Integer queryIdByLocation(String location) {
        return locationDao.queryIdByLocation(location);
    }
}

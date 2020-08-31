package com.ohmybug.test;

import com.ohmybug.dao.LocationDao;
import com.ohmybug.dao.impl.LocationDaoImpl;
import com.ohmybug.pojo.Location;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationDaoImplTest {

    private LocationDao locationDao = new LocationDaoImpl();

    @Test
    public void addLocation() {
        locationDao.addLocation(new Location(null, "asdasd"));
    }

    @Test
    public void deleteLocationById() {
        locationDao.deleteLocationById(5);
    }

    @Test
    public void updateLocation() {
        locationDao.updateLocation(new Location(4, "汇紫楼"));
    }

    @Test
    public void queryLocationById() {
        System.out.println(locationDao.queryLocationById(1));
    }

    @Test
    public void queryLocations() {
        System.out.println(locationDao.queryLocations());
    }
}
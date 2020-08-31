package com.ohmybug.dao;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Location;

import java.util.List;

public interface LocationDao {
    int addLocation(Location location);

    int deleteLocationById(Integer id);

    int updateLocation(Location location);

    Location queryLocationById(Integer id);

    List<Location> queryLocations();
}

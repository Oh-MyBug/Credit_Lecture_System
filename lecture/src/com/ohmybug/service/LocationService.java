package com.ohmybug.service;

import com.ohmybug.pojo.Location;

import java.util.List;

public interface LocationService {
    int addLocation(Location location);

    int deleteLocationById(Integer id);

    int updateLocation(Location location);

    Location queryLocationById(Integer id);

    List<Location> queryLocations();
}

package com.ohmybug.dao.impl;

import com.ohmybug.dao.LocationDao;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Location;

import java.util.List;

/**
 * ClassName:   LocationImpl
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class LocationDaoImpl extends BaseDao implements LocationDao {
    @Override
    public int addLocation(Location location) {
        String sql = "insert into `lecture_location`(`location`) values(?)";
        return update(sql, location.getLocation());
    }

    @Override
    public int deleteLocationById(Integer id) {
        String sql = "delete from `lecture_location` where id = ?";
        return update(sql, id);
    }

    @Override
    public int updateLocation(Location location) {
        String sql = "update `lecture_location` set `location` = ? where id = ?";
        return update(sql, location.getLocation(), location.getId());
    }

    @Override
    public Location queryLocationById(Integer id) {
        String sql = "select `id`, `location` from `lecture_location` where id = ?";
        return queryForOne(Location.class, sql, id);
    }

    @Override
    public List<Location> queryLocations() {
        String sql = "select `id`, `location` from `lecture_location`";
        return queryForList(Location.class, sql);
    }

    @Override
    public Integer queryIdByLocation(String location) {
        String sql = "select `id` from `lecture_location` where `location` = ?";
        return (Integer) queryForSingleValue(sql, location);
    }
}

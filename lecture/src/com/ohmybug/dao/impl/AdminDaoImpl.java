package com.ohmybug.dao.impl;

import com.ohmybug.dao.AdminDao;
import com.ohmybug.pojo.Admin;

/**
 * ClassName:   UserDaoImpl
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class AdminDaoImpl extends BaseDao implements AdminDao {
    @Override
    public Admin queryAdminByNameAndPassword(String name, String password) {
        String sql = "select `id`, `name`, `password` from admin where name = ? and password = ?";
        return queryForOne(Admin.class, sql, name, password);
    }
}

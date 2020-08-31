package com.ohmybug.service.impl;

import com.ohmybug.dao.AdminDao;
import com.ohmybug.dao.impl.AdminDaoImpl;
import com.ohmybug.pojo.Admin;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.service.AdminService;

import java.util.List;

/**
 * ClassName:   AdminServiceImpl
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class AdminServiceImpl implements AdminService {
    private final AdminDao adminDao = new AdminDaoImpl();

    @Override
    public Admin login(Admin admin) {
        return adminDao.queryAdminByNameAndPassword(admin.getName(), admin.getPassword());
    }
}

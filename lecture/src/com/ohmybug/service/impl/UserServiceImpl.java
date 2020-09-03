package com.ohmybug.service.impl;

import com.ohmybug.dao.UserDao;
import com.ohmybug.dao.impl.UserDaoImpl;
import com.ohmybug.pojo.Admin;
import com.ohmybug.pojo.Student;
import com.ohmybug.service.UserService;

/**
 * ClassName:   AdminServiceImpl
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public Admin login(Admin admin) {
        return userDao.queryAdminByNameAndPassword(admin.getName(), admin.getPassword());
    }

    @Override
    public Student login(Student student) {
        return userDao.queryStudentByNameAndPassword(student.getName(), student.getPassword());
    }
}

package com.ohmybug.dao.impl;

import com.ohmybug.dao.UserDao;
import com.ohmybug.pojo.Admin;
import com.ohmybug.pojo.Student;

/**
 * ClassName:   UserDaoImpl
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public Admin queryAdminByNameAndPassword(String name, String password) {
        String sql = "select `id`, `name`, `password` from admin where name = ? and password = ?";
        return queryForOne(Admin.class, sql, name, password);
    }

    @Override
    public Student queryStudentByNameAndPassword(String stu_id, String password) {
        String sql = "select `id`, `name`, `password`, `sex` from `student` where `stu_id` = ? and `password` = ?";
        return queryForOne(Student.class, sql, stu_id, password);
    }
}

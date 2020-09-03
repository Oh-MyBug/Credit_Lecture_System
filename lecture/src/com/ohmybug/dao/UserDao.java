package com.ohmybug.dao;

import com.ohmybug.pojo.Admin;
import com.ohmybug.pojo.Student;

public interface UserDao {
    Admin queryAdminByNameAndPassword(String name, String password);

    Student queryStudentByNameAndPassword(String name, String password);
}

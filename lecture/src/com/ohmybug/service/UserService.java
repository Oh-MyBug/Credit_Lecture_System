package com.ohmybug.service;

import com.ohmybug.pojo.Admin;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Student;

import java.util.List;

public interface UserService {
    Admin login(Admin admin);

    Student login(Student student);
}

package com.ohmybug.dao;

import com.ohmybug.pojo.Student;

import java.util.List;

public interface StudentDao {
    int addStudent(Student student);

    int deleteStudentById(Integer id);

    int updateStudent(Student student);

    Student queryStudentById(Integer id);

    List<Student> queryStudents();
}

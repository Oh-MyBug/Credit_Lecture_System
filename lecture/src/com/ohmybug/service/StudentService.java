package com.ohmybug.service;

import com.ohmybug.pojo.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);

    int deleteStudentById(Integer id);

    int updateStudent(Student student);

    Student queryStudentById(Integer id);

    List<Student> queryStudents();
}

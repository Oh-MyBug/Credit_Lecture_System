package com.ohmybug.service.impl;

import com.ohmybug.dao.StudentDao;
import com.ohmybug.dao.impl.StudentDaoImpl;
import com.ohmybug.pojo.Student;
import com.ohmybug.service.StudentService;

import java.util.List;

/**
 * ClassName:   StudentServiceImpl
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int deleteStudentById(Integer id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentDao.queryStudentById(id);
    }

    @Override
    public List<Student> queryStudents() {
        return studentDao.queryStudents();
    }
}

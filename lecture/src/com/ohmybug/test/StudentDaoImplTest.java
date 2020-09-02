package com.ohmybug.test;

import com.ohmybug.dao.StudentDao;
import com.ohmybug.dao.impl.StudentDaoImpl;
import com.ohmybug.pojo.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDaoImplTest {
    private StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void addStudent() {
        for (int i = 30; i < 100; i++) {
            studentDao.addStudent(new Student(null, "20171911" + i, "李聪", 0, "08021133", "2017", "数计班", 12, "13411212816", "2017191123@email.szu.edu.cn"));
        }
    }

    @Test
    public void deleteStudentById() {
        studentDao.deleteStudentById(2);
    }

    @Test
    public void updateStudent() {
        studentDao.updateStudent(new Student(2, "2017191124", "李聪", 0, "08021133", "2017", "数计班", 12, "13411212816", "2017191124@email.szu.edu.cn"));
    }

    @Test
    public void queryStudentById() {
        System.out.println(studentDao.queryStudentById(5));
    }

    @Test
    public void queryStudents() {
        System.out.println(studentDao.queryStudents());
    }
}
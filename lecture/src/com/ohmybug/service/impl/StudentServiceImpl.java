package com.ohmybug.service.impl;

import com.ohmybug.dao.StudentDao;
import com.ohmybug.dao.impl.StudentDaoImpl;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;
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

    @Override
    public Page<Student> page(int pageNo, int pageSize) {
        Page<Student> page = new Page<>();

        page.setPageSize(pageSize);

        Integer pageTotalCount = studentDao.queryForPageTotalCount();
        page.setPageTotalCount(pageTotalCount);

        int pageTotal = pageTotalCount % pageSize > 0 ? pageTotalCount / pageSize + 1 : pageTotalCount / pageSize;
        page.setPageTotal(pageTotal);

        page.setPageNo(pageNo);

        int begin = (page.getPageNo() - 1) * pageSize;
        List<Student> items = studentDao.queryforPageItems(begin, pageSize);
        page.setItems(items);

        return page;
    }
}

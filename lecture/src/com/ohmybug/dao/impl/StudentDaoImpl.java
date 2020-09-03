package com.ohmybug.dao.impl;

import com.ohmybug.dao.StudentDao;
import com.ohmybug.pojo.Student;

import java.util.List;

/**
 * ClassName:   StudentDaoImpl
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class StudentDaoImpl extends BaseDao implements StudentDao {
    @Override
    public int addStudent(Student student) {
        String sql = "insert into `student`(`stu_id`, `name`, `sex`, `password`, `grade`, `t_class`, `certification`," +
                " `phone`, `email`) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return update(sql, student.getStu_id(), student.getName(), student.getSex(), student.getPassword(),
                student.getGrade(), student.getT_class(), student.getCertification(), student.getPhone(),
                student.getEmail());
    }

    @Override
    public int deleteStudentById(Integer id) {
        String sql = "delete from `student` where `id` = ?";
        return update(sql, id);
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update `student` set `stu_id` = ?, `name` = ?, `sex` = ?, `password` = ?, `grade` = ?, " +
                "`t_class` = ?, `certification` = ?, `phone` = ?, `email` = ? where `id` = ?";
        return update(sql, student.getStu_id(), student.getName(), student.getSex(), student.getPassword(),
                student.getGrade(), student.getT_class(), student.getCertification(), student.getPhone(),
                student.getEmail(), student.getId());
    }

    @Override
    public Student queryStudentById(Integer id) {
        String sql = "select `id`, `stu_id`, `name`, `sex`, `password`, `grade`, `t_class`, `certification`, `phone`," +
                " `email` from `student` where `id` = ?";
        return queryForOne(Student.class, sql, id);
    }

    @Override
    public List<Student> queryStudents() {
        String sql = "select `id`, `stu_id`, `name`, `sex`, `password`, `grade`, `t_class`, `certification`, `phone`," +
                " `email` from `student`";
        return queryForList(Student.class, sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from `student`";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<Student> queryforPageItems(int begin, int pageSize) {
        String sql = "select `id`, `stu_id`, `name`, `sex`, `password`, `grade`, `t_class`, `certification`, `phone`," +
                " `email` from `student` limit ?, ?";
        return queryForList(Student.class, sql, begin, pageSize);
    }
}

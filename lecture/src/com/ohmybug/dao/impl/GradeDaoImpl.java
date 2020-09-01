package com.ohmybug.dao.impl;

import com.ohmybug.dao.GradeDao;
import com.ohmybug.pojo.Grade;

import java.util.List;

/**
 * ClassName:   GradeDaoImpl
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class GradeDaoImpl extends BaseDao implements GradeDao {
    @Override
    public int addGrade(Grade grade) {
        String sql = "insert into `grade`(`grade`) values(?)";
        return update(sql, grade.getGrade());
    }

    @Override
    public int deleteGradeById(Integer id) {
        String sql = "delete from `grade` where id = ?";
        return update(sql, id);
    }

    @Override
    public int updateGrade(Grade grade) {
        String sql = "update `grade` set `grade` = ? where id = ?";
        return update(sql, grade.getGrade(), grade.getId());
    }

    @Override
    public Grade queryGradeById(Integer id) {
        String sql = "select `id`, `grade` from `grade` where `id` = ?";
        return queryForOne(Grade.class, sql, id);
    }

    @Override
    public List<Grade> queryGrades() {
        String sql = "select `id`, `grade` from `grade`";
        return queryForList(Grade.class, sql);
    }
}

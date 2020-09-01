package com.ohmybug.dao;

import com.ohmybug.pojo.Grade;

import java.util.List;

/**
 * ClassName:   GradeDao
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public interface GradeDao {
    int addGrade(Grade grade);

    int deleteGradeById(Integer id);

    int updateGrade(Grade grade);

    Grade queryGradeById(Integer id);

    List<Grade> queryGrades();
}

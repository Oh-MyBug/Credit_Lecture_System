package com.ohmybug.service;

import com.ohmybug.pojo.Grade;

import java.util.List;

public interface GradeService {
    int addGrade(Grade grade);

    int deleteGradeById(Integer id);

    int updateGrade(Grade grade);

    Grade queryGradeById(Integer id);

    List<Grade> queryGrades();
}

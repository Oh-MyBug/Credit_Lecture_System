package com.ohmybug.service.impl;

import com.ohmybug.dao.GradeDao;
import com.ohmybug.dao.impl.GradeDaoImpl;
import com.ohmybug.pojo.Grade;
import com.ohmybug.service.GradeService;

import java.util.List;

/**
 * ClassName:   GradeServiceImpl
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class GradeServiceImpl implements GradeService {
    private GradeDao gradeDao = new GradeDaoImpl();

    @Override
    public int addGrade(Grade grade) {
        return gradeDao.addGrade(grade);
    }

    @Override
    public int deleteGradeById(Integer id) {
        return gradeDao.deleteGradeById(id);
    }

    @Override
    public int updateGrade(Grade grade) {
        return gradeDao.updateGrade(grade);
    }

    @Override
    public Grade queryGradeById(Integer id) {
        return gradeDao.queryGradeById(id);
    }

    @Override
    public List<Grade> queryGrades() {
        return gradeDao.queryGrades();
    }
}

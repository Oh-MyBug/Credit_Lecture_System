package com.ohmybug.test;

import com.ohmybug.dao.GradeDao;
import com.ohmybug.dao.impl.GradeDaoImpl;
import com.ohmybug.pojo.Grade;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeDaoImplTest {
    private GradeDao gradeDao = new GradeDaoImpl();

    @Test
    public void addGrade() {
        gradeDao.addGrade(new Grade(null,"2017"));
        gradeDao.addGrade(new Grade(null,"2018"));
        gradeDao.addGrade(new Grade(null,"2019"));
        gradeDao.addGrade(new Grade(null,"2020"));
    }

    @Test
    public void deleteGradeById() {
        gradeDao.deleteGradeById(9);
    }

    @Test
    public void updateGrade() {
        gradeDao.updateGrade(new Grade(1,"2017"));
    }

    @Test
    public void queryGradeById() {
        System.out.println(gradeDao.queryGradeById(1));
    }

    @Test
    public void queryGrades() {
        for (Grade queryGrade : gradeDao.queryGrades()) {
            System.out.println(queryGrade);
        }
    }
}
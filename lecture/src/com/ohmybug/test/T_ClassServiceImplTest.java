package com.ohmybug.test;

import com.ohmybug.dao.T_ClassDao;
import com.ohmybug.pojo.T_Class;
import com.ohmybug.service.T_ClassService;
import com.ohmybug.service.impl.T_ClassServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class T_ClassServiceImplTest {
    private T_ClassService t_classService = new T_ClassServiceImpl();

    @Test
    public void addT_Class() {
        t_classService.addT_Class(new T_Class(null, "应数班"));
        t_classService.addT_Class(new T_Class(null, "统计班"));
        t_classService.addT_Class(new T_Class(null, "信计班"));
        t_classService.addT_Class(new T_Class(null, "数计班"));
        t_classService.addT_Class(new T_Class(null, "数金班"));
        t_classService.addT_Class(new T_Class(null, "数师班"));
    }

    @Test
    public void deleteT_ClassById() {
        t_classService.deleteT_ClassById(7);
    }

    @Test
    public void updateT_Class() {
        t_classService.updateT_Class(new T_Class(1,"应数班"));
    }

    @Test
    public void queryT_ClassById() {
        System.out.println(t_classService.queryT_ClassById(1));
    }

    @Test
    public void queryT_Classs() {
        for (T_Class queryT_classs : t_classService.queryT_Classs()) {
            System.out.println(queryT_classs);
        }
    }
}
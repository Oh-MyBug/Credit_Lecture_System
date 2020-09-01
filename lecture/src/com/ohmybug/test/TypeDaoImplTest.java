package com.ohmybug.test;

import com.ohmybug.dao.TypeDao;
import com.ohmybug.dao.impl.TypeDaoImpl;
import com.ohmybug.pojo.Type;
import org.junit.Test;

public class TypeDaoImplTest {
    private TypeDao typeDao = new TypeDaoImpl();

    @Test
    public void addType() {
        typeDao.addType(new Type(null, "数学与统计学院大学数学系列讲座"));
        typeDao.addType(new Type(null, "数学与统计学院本科生学术讲座"));
        typeDao.addType(new Type(null, "数学与统计学院本科生生涯讲座"));
    }

    @Test
    public void deleteTypeById() {
        typeDao.deleteTypeById(5);
    }

    @Test
    public void updateType() {
        typeDao.updateType(new Type(4, "数学与统计学院大学数学系列讲座"));
    }

    @Test
    public void queryTypeById() {
        System.out.println(typeDao.queryTypeById(1));
    }

    @Test
    public void queryTypes() {
        System.out.println(typeDao.queryTypes());
    }
}
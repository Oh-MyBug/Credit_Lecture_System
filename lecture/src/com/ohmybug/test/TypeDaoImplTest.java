package com.ohmybug.test;

import com.ohmybug.dao.TypeDao;
import com.ohmybug.dao.impl.TypeDaoImpl;
import com.ohmybug.pojo.Type;
import org.junit.Test;

public class TypeDaoImplTest {
    private TypeDao typeDao = new TypeDaoImpl();

    @Test
    public void addType() {
        typeDao.addType(new Type(null, "类型2"));
        typeDao.addType(new Type(null, "类型3"));
        typeDao.addType(new Type(null, "类型4"));
    }

    @Test
    public void deleteTypeById() {
        typeDao.deleteTypeById(5);
    }

    @Test
    public void updateType() {
        typeDao.updateType(new Type(4, "类型5"));
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
package com.ohmybug.test;

import com.ohmybug.dao.UserDao;
import com.ohmybug.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoImplTest {

    @Test
    public void queryAdminByNameAndPassword() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.queryAdminByNameAndPassword("admin1", "admin"));
    }
}
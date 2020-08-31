package com.ohmybug.test;

import com.ohmybug.dao.AdminDao;
import com.ohmybug.dao.impl.AdminDaoImpl;
import org.junit.Test;

public class AdminDaoImplTest {

    @Test
    public void queryAdminByNameAndPassword() {
        AdminDao adminDao = new AdminDaoImpl();
        System.out.println(adminDao.queryAdminByNameAndPassword("admin1", "admin"));
    }
}
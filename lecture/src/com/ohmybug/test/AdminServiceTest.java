package com.ohmybug.test;

import com.ohmybug.pojo.Admin;
import com.ohmybug.service.AdminService;
import com.ohmybug.service.impl.AdminServiceImpl;
import org.junit.Test;

public class AdminServiceTest {

    AdminService adminService = new AdminServiceImpl();

    @Test
    public void login() {
        System.out.println(adminService.login(new Admin(null, "admin", "1")));
    }
}
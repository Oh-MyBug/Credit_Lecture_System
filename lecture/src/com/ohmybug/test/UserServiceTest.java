package com.ohmybug.test;

import com.ohmybug.pojo.Admin;
import com.ohmybug.service.UserService;
import com.ohmybug.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void login() {
        System.out.println(userService.login(new Admin(null, "admin", "1")));
    }
}
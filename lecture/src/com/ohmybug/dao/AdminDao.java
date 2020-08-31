package com.ohmybug.dao;

import com.ohmybug.pojo.Admin;

public interface AdminDao {
    Admin queryAdminByNameAndPassword(String name, String password);
}

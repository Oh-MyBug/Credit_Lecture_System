package com.ohmybug.pojo;

/**
 * ClassName:   Admin
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Admin {
    private Integer Id;
    private String name;
    private String password;

    public Admin(Integer id, String name, String password) {
        Id = id;
        this.name = name;
        this.password = password;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

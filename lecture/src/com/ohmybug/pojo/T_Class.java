package com.ohmybug.pojo;

/**
 * ClassName:   T_Class
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class T_Class {
    private Integer id;
    private String t_class;

    public T_Class(Integer id, String t_class) {
        this.id = id;
        this.t_class = t_class;
    }

    public T_Class() {
    }

    @Override
    public String toString() {
        return "T_Class{" +
                "id=" + id +
                ", t_class='" + t_class + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getT_class() {
        return t_class;
    }

    public void setT_class(String t_class) {
        this.t_class = t_class;
    }
}

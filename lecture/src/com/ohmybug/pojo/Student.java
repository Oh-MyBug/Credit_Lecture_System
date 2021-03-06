package com.ohmybug.pojo;

/**
 * ClassName:   Student
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Student {
    private Integer id;
    private String stu_id;
    private String name;
    private Integer sex;
    private String password;
    private String grade;
    private String t_class;
    private Integer certification;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(Integer id, String stu_id, String name, Integer sex, String password, String grade, String t_class
            , Integer certification, String phone, String email) {
        this.id = id;
        this.stu_id = stu_id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.grade = grade;
        this.t_class = t_class;
        this.certification = certification;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stu_id='" + stu_id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", password='" + password + '\'' +
                ", grade='" + grade + '\'' +
                ", t_class='" + t_class + '\'' +
                ", certification=" + certification +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getT_class() {
        return t_class;
    }

    public void setT_class(String t_class) {
        this.t_class = t_class;
    }

    public Integer getCertification() {
        return certification;
    }

    public void setCertification(Integer certification) {
        this.certification = certification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.ohmybug.pojo;

/**
 * ClassName:   Grade
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Grade {
    private Integer id;
    private String grade;

    public Grade(Integer id, String grade) {
        this.id = id;
        this.grade = grade;
    }

    public Grade() {
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

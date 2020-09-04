package com.ohmybug.pojo;

/**
 * ClassName:   Reservation
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Reservation {
    private Integer id;
    private Integer studentId;
    private Integer lectureId;

    public Reservation(Integer id, Integer studentId, Integer lectureId) {
        this.id = id;
        this.studentId = studentId;
        this.lectureId = lectureId;
    }

    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", stuId=" + studentId +
                ", lectureId=" + lectureId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }
}

package com.ohmybug.dao;

import com.ohmybug.pojo.Lecture;

import java.util.List;


public interface LectureDao {
    int addLecture(Lecture lecture);

    int deleteLectureById(int id);

    int updateLecture(Lecture lecture);

    Lecture queryLectureById(Integer id);

    List<Lecture> queryLectures();
}

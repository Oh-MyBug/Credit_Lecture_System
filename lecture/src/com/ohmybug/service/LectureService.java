package com.ohmybug.service;

import com.ohmybug.pojo.Lecture;

import java.util.List;

public interface LectureService {
    int addLecture(Lecture lecture);

    int deleteLectureById(Integer id);

    int updateLecture(Lecture lecture);

    Lecture queryLectureById(Integer id);

    List<Lecture> queryLectures();
}

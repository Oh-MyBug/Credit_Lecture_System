package com.ohmybug.service;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;

import java.util.List;

public interface LectureService {
    int addLecture(Lecture lecture);

    int deleteLectureById(Integer id);

    int updateLecture(Lecture lecture);

    Lecture queryLectureById(Integer id);

    List<Lecture> queryLectures();

    Page<Lecture> page(int pageNo, int pageSize);
}

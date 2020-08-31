package com.ohmybug.service.impl;

import com.ohmybug.dao.LectureDao;
import com.ohmybug.dao.impl.LectureDaoImpl;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.service.LectureService;

import java.util.List;

/**
 * ClassName:   LectureServiceImpl
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class LectureServiceImpl implements LectureService {
    private LectureDao lectureDao = new LectureDaoImpl();

    @Override
    public int addLecture(Lecture lecture) {
        return lectureDao.addLecture(lecture);
    }

    @Override
    public int deleteLectureById(Integer id) {
        return lectureDao.deleteLectureNyId(id);
    }

    @Override
    public int updateLecture(Lecture lecture) {
        return lectureDao.updateLecture(lecture);
    }

    @Override
    public Lecture queryLectureById(Integer id) {
        return lectureDao.queryLectureById(id);
    }

    @Override
    public List<Lecture> queryLectures() {
        return lectureDao.queryLectures();
    }
}

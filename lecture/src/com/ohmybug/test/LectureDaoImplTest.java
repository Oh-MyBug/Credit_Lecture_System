package com.ohmybug.test;

import com.ohmybug.dao.LectureDao;
import com.ohmybug.dao.impl.LectureDaoImpl;
import com.ohmybug.pojo.Lecture;
import org.junit.Test;

import java.sql.Date;

public class LectureDaoImplTest {

    private LectureDao lectureDao = new LectureDaoImpl();

    @Test
    public void addLecture() {
        for (int i = 0; i < 20; i++) {
            lectureDao.addLecture(new Lecture(null, "title", "类型1", 2, "speaker", "汇紫楼", new Date(123456789),
                    "speakerIntroduction", "content", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                    20, 21, 22, 23, 24));
        }
    }

    @Test
    public void deleteLectureNyId() {
        lectureDao.deleteLectureNyId(9);
    }

    @Test
    public void updateLecture() {
        lectureDao.updateLecture(new Lecture(10, "title", "类型1", 2, "speaker1", "汇紫楼", new Date(123456789),
                "speakerIntroduction", "content", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24));
    }

    @Test
    public void queryLectureById() {
        System.out.println(lectureDao.queryLectureById(1));
    }

    @Test
    public void queryLectures() {
        System.out.println(lectureDao.queryLectures());
    }
}
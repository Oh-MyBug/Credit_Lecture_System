package com.ohmybug.test;

import com.ohmybug.dao.LectureDao;
import com.ohmybug.dao.impl.LectureDaoImpl;
import com.ohmybug.pojo.Lecture;
import org.junit.Test;

import java.util.Date;

public class LectureDaoImplTest {

    private LectureDao lectureDao = new LectureDaoImpl();

    @Test
    public void addLecture() {
        for (int i = 0; i < 20; i++) {
            lectureDao.addLecture(new Lecture(null, "大三的选择题", "数学与统计学院本科生学术讲座", "已结束", "卢宏洲"+i, "汇星楼", new Date(123456789),
                    "卢宏洲，深圳市优伴教育科技有限公司的创始人。毕业后一直从事教育行业，公司主要围绕智慧纸笔的软件开发为主，致力于服务老师与学生，借科技之力改善师生的教与学。2010年毕业于信息与计算科学专业，毕业十年，创业五年。", "如果能让我回到大三，我想对自己说什么？", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                    20, 21, 22, 23, 24));
        }
    }

    @Test
    public void deleteLectureNyId() {
        lectureDao.deleteLectureNyId(9);
    }

    @Test
    public void updateLecture() {
        lectureDao.updateLecture(new Lecture(10, "大三的选择题", "数学与统计学院本科生学术讲座", "已结束", "卢宏洲", "汇星楼", new Date(123456789),
                "卢宏洲，深圳市优伴教育科技有限公司的创始人。毕业后一直从事教育行业，公司主要围绕智慧纸笔的软件开发为主，致力于服务老师与学生，借科技之力改善师生的教与学。2010年毕业于信息与计算科学专业，毕业十年，创业五年。", "如果能让我回到大三，我想对自己说什么？", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
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
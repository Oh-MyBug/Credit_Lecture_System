package com.ohmybug.test;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;
import com.ohmybug.service.LectureService;
import com.ohmybug.service.impl.LectureServiceImpl;
import org.junit.Test;

public class LectureServiceImplTest {

    private LectureService lectureService = new LectureServiceImpl();

    @Test
    public void page() {
        Page<Lecture> page = lectureService.page(4, 4);
        for (Lecture item : page.getItems()) {
            System.out.println(item);
        }
    }

    @Test
    public void test() {
        System.out.println(Math.ceil((double) 8/5));
    }
}
package com.ohmybug.web;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.service.LectureService;
import com.ohmybug.service.impl.LectureServiceImpl;
import com.ohmybug.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:   LectureServlet
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class LectureServlet extends BaseServlet {
    private LectureService lectureService = new LectureServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Lecture lecture = WebUtils.copyParamToBean(req.getParameterMap(), new Lecture());
        req.setAttribute("lecture", lecture);
        lectureService.addLecture(lecture);
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Lecture> lectures = lectureService.queryLectures();
        req.setAttribute("lectures", lectures);
        req.getRequestDispatcher("/pages/admin/lecture_manage.jsp").forward(req, resp);
    }
}

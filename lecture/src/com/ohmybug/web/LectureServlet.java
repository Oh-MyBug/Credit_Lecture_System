package com.ohmybug.web;

import com.ohmybug.pojo.*;
import com.ohmybug.service.LectureService;
import com.ohmybug.service.LocationService;
import com.ohmybug.service.TypeService;
import com.ohmybug.service.impl.LectureServiceImpl;
import com.ohmybug.service.impl.LocationServiceImpl;
import com.ohmybug.service.impl.TypeServiceImpl;
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
    private final LectureService lectureService = new LectureServiceImpl();
    private final TypeService typeService = new TypeServiceImpl();
    private final LocationService locationService = new LocationServiceImpl();

    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        Page<Lecture> page = lectureService.page(pageNo, pageSize);
        page.setUrl("admin/lectureServlet?action=page&page=lecture");
        req.setAttribute("page", page);
        req.getRequestDispatcher("/pages/admin/lecture_manage.jsp").forward(req, resp);
    }

    protected void getSelectorList(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        List<Type> types = typeService.queryTypes();
        req.setAttribute("types", types);
        List<Location> locations = locationService.queryLocations();
        req.setAttribute("locations", locations);
        req.setAttribute("status", Status.status.entrySet());
        req.getRequestDispatcher("/pages/admin/lecture_edit.jsp").forward(req, resp);
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Lecture lecture = WebUtils.copyParamToBean(req.getParameterMap(), new Lecture());
        int addLecture = lectureService.addLecture(lecture);
        if (addLecture == -1) {
            lecture.setId(null);
            req.setAttribute("lecture", lecture);
            req.getRequestDispatcher("lectureServlet?action=getSelectorList").forward(req, resp);
        } else {
            int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 0);
            pageNo += 1;
            resp.sendRedirect(req.getContextPath() + "/admin/lectureServlet?action=page&page=lecture&pageNo=" + pageNo);
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Lecture lecture = WebUtils.copyParamToBean(req.getParameterMap(), new Lecture());
        lectureService.updateLecture(lecture);
        resp.sendRedirect(req.getContextPath() + "/admin/lectureServlet?action=page&page=lecture&pageNo=" + req.getParameter("pageNo"));
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        lectureService.deleteLectureById(id);
        resp.sendRedirect(req.getContextPath() + "/admin/lectureServlet?action=page&page=lecture&pageNo=" + req.getParameter("pageNo"));
    }

    protected void getLecture(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Lecture lecture = lectureService.queryLectureById(id);
        req.setAttribute("lecture", lecture);
        String[] time = lecture.getTime().toString().split(" ");
        StringBuilder sb = new StringBuilder();
        req.setAttribute("time", sb.append(time[0]).append("T").append(time[1]).toString());
        getSelectorList(req, resp);
    }

    protected void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Lecture lecture = lectureService.queryLectureById(id);
        req.setAttribute("lecture", lecture);
        req.getRequestDispatcher("/pages/lecture/lecture_msg.jsp").forward(req, resp);
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Lecture> lectures = lectureService.queryLectures();
        req.setAttribute("lectures", lectures);
        req.getRequestDispatcher("/pages/admin/lecture_manage.jsp").forward(req, resp);
    }
}

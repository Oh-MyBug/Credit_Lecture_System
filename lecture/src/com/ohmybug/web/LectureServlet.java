package com.ohmybug.web;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Location;
import com.ohmybug.pojo.Status;
import com.ohmybug.pojo.Type;
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
            req.setAttribute("lecture", lecture);
            req.getRequestDispatcher("lectureServlet?action=getSelectorList").forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/admin/lectureServlet?action=list&page=lecture");
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Lecture lecture = WebUtils.copyParamToBean(req.getParameterMap(), new Lecture());
        lectureService.updateLecture(lecture);
        resp.sendRedirect(req.getContextPath() + "/admin/lectureServlet?action=list&page=lecture");
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        lectureService.deleteLectureById(id);
        resp.sendRedirect(req.getContextPath() + "/admin/lectureServlet?action=list&page=lecture");
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

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Lecture> lectures = lectureService.queryLectures();
        req.setAttribute("lectures", lectures);
        req.getRequestDispatcher("/pages/admin/lecture_manage.jsp").forward(req, resp);
    }
}

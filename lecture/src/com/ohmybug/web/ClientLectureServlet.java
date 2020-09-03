package com.ohmybug.web;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;
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

/**
 * ClassName:   StudentLectureServlet
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class ClientLectureServlet extends BaseServlet {
    private final LectureService lectureService = new LectureServiceImpl();
    private final TypeService typeService = new TypeServiceImpl();
    private final LocationService locationService = new LocationServiceImpl();

    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        Page<Lecture> page = lectureService.page(pageNo, pageSize);
        page.setUrl("client/clientLectureServlet?action=page&page=lecture");
        req.setAttribute("page", page);
        req.getRequestDispatcher("/pages/client/lecture_message.jsp").forward(req, resp);
    }

    protected void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Lecture lecture = lectureService.queryLectureById(id);
        req.setAttribute("lecture", lecture);
        req.getRequestDispatcher("/pages/lecture/lecture_msg.jsp").forward(req, resp);
    }
}

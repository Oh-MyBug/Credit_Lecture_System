package com.ohmybug.web;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;
import com.ohmybug.pojo.Reservation;
import com.ohmybug.pojo.Student;
import com.ohmybug.service.ReservationService;
import com.ohmybug.service.impl.ReservationServletImpl;
import com.ohmybug.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:   ReservationServlet
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class ClientReservationServlet extends BaseServlet {

    private final ReservationService reservationService = new ReservationServletImpl();

    protected void reserve(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Reservation reservation = WebUtils.copyParamToBean(req.getParameterMap(), new Reservation());
        reservationService.addResercation(reservation);
        req.getRequestDispatcher("clientLectureServlet?action=page&page=clientLecture&pageNo=1").forward(req, resp);
    }

    protected void cancelReserve(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        Reservation reservation = WebUtils.copyParamToBean(req.getParameterMap(), new Reservation());
        reservationService.deleteResercation(reservation);
        req.getRequestDispatcher("clientLectureServlet?action=page&page=clientLecture&pageNo=1").forward(req, resp);
    }

    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {

        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        Student student = (Student) req.getSession().getAttribute("user");
        Integer studentId = student.getId();
        Page<Lecture> page = reservationService.page(pageNo, pageSize, studentId);
        page.setUrl("client/clientReservationServlet?action=page&page=clientReservation");
        req.setAttribute("page", page);
        req.getRequestDispatcher("/pages/client/my_lecture.jsp").forward(req, resp);
    }
}

package com.ohmybug.web;

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
public class ReservationServlet extends BaseServlet {

    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath());
    }
}

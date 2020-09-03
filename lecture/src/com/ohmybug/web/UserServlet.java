package com.ohmybug.web;

import com.ohmybug.pojo.Admin;
import com.ohmybug.pojo.Student;
import com.ohmybug.service.UserService;
import com.ohmybug.service.impl.UserServiceImpl;
import com.ohmybug.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:   UserServlet
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class UserServlet extends BaseServlet {
    private final UserService userService = new UserServiceImpl();

    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath());
    }

    protected void adminLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin = WebUtils.copyParamToBean(req.getParameterMap(), new Admin());
        String passcode = req.getParameter("passcode");
        if (!"bmbmp".equalsIgnoreCase(passcode)) {
            req.setAttribute("msg", "验证码错误！");
            req.setAttribute("name", admin.getName());
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            return;
        }
        Admin loginAdmin = userService.login(admin);
        if (loginAdmin == null) {
            req.setAttribute("msg", "用户名或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("user", loginAdmin);
            req.getRequestDispatcher("admin/lectureServlet?action=page&page=lecture").forward(req, resp);
        }
    }

    protected void clientLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = WebUtils.copyParamToBean(req.getParameterMap(), new Student());
        String passcode = req.getParameter("passcode");
        if (!"bmbmp".equalsIgnoreCase(passcode)) {
            req.setAttribute("msg", "验证码错误！");
            req.setAttribute("name", student.getName());
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            return;
        }
        Student loginClient = userService.login(student);
        if (loginClient == null) {
            req.setAttribute("msg", "用户名或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("user", loginClient);
            req.getRequestDispatcher("client/clientLectureServlet?action=page&page=lecture").forward(req, resp);
        }
    }
}

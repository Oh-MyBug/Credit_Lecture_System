package com.ohmybug.web;

import com.ohmybug.pojo.Admin;
import com.ohmybug.service.AdminService;
import com.ohmybug.service.impl.AdminServiceImpl;
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
    private final AdminService adminService = new AdminServiceImpl();

    protected void adminLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin = WebUtils.copyParamToBean(req.getParameterMap(), new Admin());
        String passcode = req.getParameter("passcode");
        if (!"bmbmp".equalsIgnoreCase(passcode)) {
            req.setAttribute("msg", "验证码错误！");
            req.setAttribute("name", admin.getName());
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            return;
        }
        String loginType = req.getParameter("login_type");
        if (loginType == null) {
            req.setAttribute("msg", "请选择身份！");
            req.setAttribute("name", admin.getName());
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            return;
        }
        Admin loginAdmin = adminService.login(admin);
        if (loginAdmin == null) {
            req.setAttribute("msg", "用户名或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("admin/lectureServlet?action=list").forward(req, resp);
        }
    }
}

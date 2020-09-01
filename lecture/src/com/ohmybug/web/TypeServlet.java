package com.ohmybug.web;

import com.ohmybug.pojo.Type;
import com.ohmybug.service.TypeService;
import com.ohmybug.service.impl.TypeServiceImpl;
import com.ohmybug.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:   TypeServlet
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class TypeServlet extends BaseServlet {
    private final TypeService typeService = new TypeServiceImpl();

    protected void getType(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        Type type = typeService.queryTypeById(id);
        req.setAttribute("type", type);
        req.getRequestDispatcher("/pages/admin/type_edit.jsp").forward(req, resp);
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Type type = WebUtils.copyParamToBean(req.getParameterMap(), new Type());
        int addType = typeService.addType(type);
        if (addType == -1){
            req.setAttribute("msg", "当前类型已存在！");
            req.setAttribute("type", new Type(null, type.getType()));
            req.getRequestDispatcher("/pages/admin/type_edit.jsp").forward(req, resp);
            return;
        }
        resp.sendRedirect(req.getContextPath() + "/admin/typeServlet?action=list&page=type");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Type type = WebUtils.copyParamToBean(req.getParameterMap(), new Type());
        int updateType = typeService.updateType(type);
        if (updateType != -1) {
            resp.sendRedirect(req.getContextPath() + "/admin/typeServlet?action=list&page=type");
        } else {
            req.setAttribute("msg", "当前类型已存在！");
            req.getRequestDispatcher("typeServlet?action=getType").forward(req, resp);
        }
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Type> types = typeService.queryTypes();
        req.setAttribute("types", types);
        req.getRequestDispatcher("/pages/admin/lecture_type.jsp").forward(req, resp);
    }
}

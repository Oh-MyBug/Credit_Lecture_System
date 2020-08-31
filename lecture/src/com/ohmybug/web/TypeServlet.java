package com.ohmybug.web;

import com.ohmybug.pojo.Location;
import com.ohmybug.pojo.Type;
import com.ohmybug.service.TypeService;
import com.ohmybug.service.impl.TypeServiceImpl;

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

    protected void addLectureList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Type> types = typeService.queryTypes();
        req.setAttribute("types", types);
        req.getRequestDispatcher("locationServlet?action=addLectureList").forward(req, resp);
    }
}

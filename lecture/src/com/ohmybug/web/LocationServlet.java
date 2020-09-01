package com.ohmybug.web;

import com.ohmybug.pojo.Location;
import com.ohmybug.pojo.Type;
import com.ohmybug.service.LocationService;
import com.ohmybug.service.impl.LocationServiceImpl;
import com.ohmybug.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:   LocationServlet
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class LocationServlet extends BaseServlet {
    private final LocationService locationService = new LocationServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Location location = WebUtils.copyParamToBean(req.getParameterMap(), new Location());
        int addLocation = locationService.addLocation(location);
        if (addLocation == -1){
            req.setAttribute("msg", "当前地点已存在！");
            req.setAttribute("location", new Location(null, location.getLocation()));
            req.getRequestDispatcher("/pages/admin/location_edit.jsp").forward(req, resp);
            return;
        }
        resp.sendRedirect(req.getContextPath() + "/admin/locationServlet?action=list&page=location");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Location location = WebUtils.copyParamToBean(req.getParameterMap(), new Location());
        int updateLocation = locationService.updateLocation(location);
        if (updateLocation != -1) {
            resp.sendRedirect(req.getContextPath() + "/admin/locationServlet?action=list&page=location");
        } else {
            req.setAttribute("msg", "当前地点已存在！");
            req.getRequestDispatcher("locationServlet?action=getLocation").forward(req, resp);
        }
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        locationService.deleteLocationById(id);
        resp.sendRedirect(req.getContextPath() + "/admin/locationServlet?action=list&page=location");
    }

    protected void getLocation(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        Location location = locationService.queryLocationById(id);
        req.setAttribute("location", location);
        req.getRequestDispatcher("/pages/admin/location_edit.jsp").forward(req, resp);
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Location> locations = locationService.queryLocations();
        req.setAttribute("locations", locations);
        req.getRequestDispatcher("/pages/admin/lecture_location.jsp").forward(req, resp);
    }
}

package com.ohmybug.web;

import com.ohmybug.pojo.Location;
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
    private LocationService locationService = new LocationServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Location location = WebUtils.copyParamToBean(req.getParameterMap(), new Location());
        req.setAttribute("location", location);
        locationService.addLocation(location);
        req.getRequestDispatcher("/pages/lecture_location.jsp").forward(req, resp);
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Location> locations = locationService.queryLocations();
        req.setAttribute("locations", locations);
        req.getRequestDispatcher("/pages/lecture_location.jsp").forward(req, resp);
    }

    protected void addLectureList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Location> locations = locationService.queryLocations();
        req.setAttribute("locations", locations);
        req.getRequestDispatcher("/pages/admin/lecture_edit.jsp").forward(req, resp);
    }
}

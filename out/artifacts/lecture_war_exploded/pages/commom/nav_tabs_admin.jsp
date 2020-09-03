<%--
  Created by IntelliJ IDEA.
  User: YM
  Date: 2020/8/31
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <ul class="nav nav-tabs">
        <li class="nav-item">
            <a class="nav-link ${param.page eq "lecture" ? "active" : ""}"
               href="admin/lectureServlet?action=page&page=lecture&pageNo=1">讲座信息管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link ${param.page eq "type" ? "active" : ""}" href="admin/typeServlet?action=list&page=type">讲座类型管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link ${param.page eq "location" ? "active" : ""}"
               href="admin/locationServlet?action=list&page=location">讲座地点管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link ${param.page eq "student" ? "active" : ""}"
               href="admin/studentServlet?action=page&page=student">学生信息管理</a>
        </li>
    </ul>
</div>

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
            <a class="nav-link ${param.page eq "clientLecture" ? "active" : ""}"
               href="client/clientLectureServlet?action=page&page=clientLecture&pageNo=1">讲座信息查询</a>
        </li>
        <li class="nav-item">
            <a class="nav-link ${param.page eq "clientReservation" ? "active" : ""}"
               href="client/clientReservationServlet?action=page&page=clientReservation">我的讲座</a>
        </li>
    </ul>
</div>

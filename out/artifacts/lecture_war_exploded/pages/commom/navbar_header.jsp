<%--
  Created by IntelliJ IDEA.
  User: YM
  Date: 2020/8/30
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <a class="navbar-brand">
            <img src="static/img/logo.png" alt="">
        </a>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mr-auto"></ul>
            <c:if test="${not empty sessionScope.user}">
                <img class="circle_icon" src="static/img/user.png">
                <span class="navbar-text text-warning">
                        &nbsp;${sessionScope.user.name}
                </span>
                <a class="text-dark" href="userServlet?action=logout">&ensp;注销</a>
            </c:if>
        </div>
    </nav>
</div>

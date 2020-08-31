<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp"%>
    <title>后台管理页面</title>
</head>
<body>

<%@include file="/pages/commom/navbar-header.jsp"%>

<div class="container">
    <ul class="nav nav-tabs">
        <li class="nav-item">
            <a class="nav-link active" href="manager/lectureServlet?action=list">讲座信息管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="pages/admin/lecture_type.jsp">讲座类型管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="pages/admin/lecture_location.jsp">讲座地点管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="pages/admin/student_manage.jsp">学生信息管理</a>
        </li>
    </ul>
</div>

<div class="container"><br>

    <nav class="navbar">
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
        <a type="button" class="btn btn-success" href="admin/typeServlet?action=addLectureList">新建</a>
    </nav>

    <table class="table table-hover">
        <thead>
        <tr align="center" valign="middle">
            <th scope="col">编号</th>
            <th scope="col">讲座题目</th>
            <th scope="col">讲座类型</th>
            <th scope="col">讲座时间</th>
            <th scope="col">讲座地点</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.lectures}" var="lecture">
        <tr align="center" valign="middle">
            <th scope="row">${lecture.id}</th>
            <td><a href="pages/lecture/lecture_msg.jsp" target="_blank">${lecture.title}</a></td>
            <td>${lecture.type}</td>
            <td>${lecture.time}</td>
            <td>${lecture.location}</td>
            <td>
                <a type="button" class="btn btn-secondary" href="lecture_edit.jsp">编辑</a>
                <a type="button" class="btn btn-danger">删除</a>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

    <nav aria-label="...">
        <ul class="pagination justify-content-center">
            <li class="page-item disabled">
                <span class="page-link">Previous</span>
            </li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item active" aria-current="page">
      <span class="page-link">
        2
        <span class="sr-only">(current)</span>
      </span>
            </li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item">
                <a class="page-link" href="#">Next</a>
            </li>
        </ul>
    </nav>
</div>

<%@include file="/pages/commom/footer.jsp"%>
</body>
</html>
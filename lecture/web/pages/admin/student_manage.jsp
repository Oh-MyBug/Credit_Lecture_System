<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>后台学生信息管理</title>
</head>
<body>
<%@include file="/pages/commom/navbar-header.jsp" %>

<%@include file="/pages/commom/nav-tabs.jsp" %>

<div class="container"><br>
    <nav class="navbar">
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
        <a type="button" class="btn btn-success" href="admin/studentServlet?action=getSelectorList">新建</a>
    </nav>

    <table class="table table-hover">
        <thead>
        <tr align="center" valign="middle">
            <th scope="col">学号</th>
            <th scope="col">姓名</th>
            <th scope="col">性别</th>
            <th scope="col">密码</th>
            <th scope="col">年级</th>
            <th scope="col">班级</th>
            <th scope="col">讲座次数</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.students}" var="student">
            <tr align="center" valign="middle">
                <th scope="row">${student.stu_id}</th>
                <td><a target="_blank">${student.name}</a></td>
                <td>${student.sex eq 0 ? "男" : "女"}</td>
                <td>${student.password}</td>
                <td>${student.grade}</td>
                <td>${student.t_class}</td>
                <td>${student.certification}</td>
                <td>
                    <a type="button" class="btn btn-secondary" href="admin/studentServlet?action=getStudent&id=${student.id}">编辑</a>
                    <a type="button" class="btn btn-danger" href="admin/studentServlet?action=delete&id=${student.id}">删除</a>
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

<%@include file="/pages/commom/footer.jsp" %>
</body>
</html>
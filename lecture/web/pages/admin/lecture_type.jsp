<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
            <a class="nav-link" href="manager/lectureServlet?action=list">讲座信息管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" href="pages/admin/lecture_type.jsp">讲座类型管理</a>
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
        <a type="button" class="btn btn-success">添加</a>
    </nav>

    <table class="table">
        <thead  align="center" valign="middle">
        <tr>
            <th scope="col">编号</th>
            <th scope="col">讲座类型</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody  align="center" valign="middle">
        <tr>
            <th scope="row">1</th>
            <td>数学与统计学院大学数学系列讲座</td>
            <td>
                <a type="button" class="btn btn-secondary">编辑</a>
                <a type="button" class="btn btn-danger">删除</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>

<%@include file="/pages/commom/footer.jsp"%>
</body>
</html>
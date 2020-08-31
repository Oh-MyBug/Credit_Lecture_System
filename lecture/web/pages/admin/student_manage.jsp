<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp"%>
    <title>后台学生信息管理</title>
</head>
<body>
<%@include file="/pages/commom/navbar-header.jsp"%>

<div class="container">
    <ul class="nav nav-tabs">
        <li class="nav-item">
            <a class="nav-link" href="manager/lectureServlet?action=list">讲座信息管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="pages/admin/lecture_type.jsp">讲座类型管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="pages/admin/lecture_location.jsp">讲座地点管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" href="pages/admin/student_manage.jsp">学生信息管理</a>
        </li>
    </ul>
</div>

<div class="container"><br>

    <nav class="navbar">
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
        <a type="button" class="btn btn-success" href="pages/admin/lecture_edit.jsp">新建</a>
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
        <tr align="center" valign="middle">
            <th scope="row">2017191123</th>
            <td><a href="pages/lecture/lecture_msg.jsp" target="_blank">李聪</a></td>
            <td>男</td>
            <td>123456</td>
            <td>2017</td>
            <td>数计班</td>
            <td>12</td>
            <td>
                <a type="button" class="btn btn-secondary" href="lecture_edit.jsp">编辑</a>
                <a type="button" class="btn btn-danger">删除</a>
            </td>
        </tr>
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
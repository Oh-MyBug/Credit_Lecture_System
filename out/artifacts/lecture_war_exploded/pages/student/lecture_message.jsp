<%--
  Created by IntelliJ IDEA.
  User: YM
  Date: 2020/9/2
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>讲座信息页面</title>
</head>
<body>

<%@include file="/pages/commom/navbar_header.jsp" %>

<%@include file="/pages/commom/nav_tabs_student.jsp" %>

<div class="container"><br>

    <nav class="navbar">
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
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
        <c:forEach items="${requestScope.page.items}" var="lecture">
            <tr align="center" valign="middle">
                <th scope="row">${lecture.id}</th>
                <td><a href="admin/lectureServlet?action=detail&id=${lecture.id}" target="_blank">${lecture.title}</a>
                </td>
                <td>${lecture.type}</td>
                <td>${lecture.time}</td>
                <td>${lecture.location}</td>
                <td>
                    <a type="button" class="btn btn-secondary"
                       href="admin/lectureServlet?action=getLecture&id=${lecture.id}">预约</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <%@include file="/pages/commom/page_nav.jsp"%>
</div>

<%@include file="/pages/commom/footer.jsp" %>

<script type="text/javascript">
    $(function () {
        $("a.deleteClass").click(function () {
            return confirm("你确定要删除【" + $(this).parent().parent().find("td:first").text() + "】？")
        });
    });
</script>
</body>
</html>

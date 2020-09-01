<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>讲座类型管理页面</title>
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
        <a type="button" class="btn btn-success" href="pages/admin/type_edit.jsp">添加</a>
    </nav>

    <table class="table">
        <thead align="center" valign="middle">
        <tr>
            <th scope="col">编号</th>
            <th scope="col">讲座类型</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody align="center" valign="middle">
        <c:forEach items="${requestScope.types}" var="type">
            <tr>
                <th scope="row">${type.id}</th>
                <td>${type.type}</td>
                <td>
                    <a type="button" class="btn btn-secondary" href="admin/typeServlet?action=getType&id=${type.id}">编辑</a>
                    <a type="button" class="btn btn-danger" href="admin/typeServlet?action=delete&id=${type.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="/pages/commom/footer.jsp" %>
</body>
</html>
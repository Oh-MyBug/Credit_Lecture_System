<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <%@include file="/pages/commom/header.jsp"%>
    <title>讲座信息</title>
</head>
<body>

<%@include file="/pages/commom/navbar-header.jsp"%>

<div class="container">
    <div><br>
        <h3 align="center">${requestScope.lecture.type}</h3><br>
        <table class="mailTable"  cellspacing="0" cellpadding="0">
            <tr>
                <td class="column">讲座题目</td>
                <td>${requestScope.lecture.title}</td>
            </tr>
            <tr>
                <td class="column">主讲人</td>
                <td>${requestScope.lecture.speaker}</td>
            </tr>
            <tr>
                <td class="column">讲座时间</td>
                <td>${requestScope.lecture.time}</td>
            </tr>
            <tr>
                <td class="column">讲座地点</td>
                <td>${requestScope.lecture.location}</td>
            </tr>
            <tr>
                <td class="column">讲座人简介</td>
                <td>
                    ${requestScope.lecture.speaker_introduction}
                </td>
            </tr>
            <tr>
                <td class="column">讲座内容</td>
                <td>${requestScope.lecture.content}</td>
            </tr>
        </table>
    </div>
</div>

<%@include file="/pages/commom/footer.jsp"%>
</body>
</html>
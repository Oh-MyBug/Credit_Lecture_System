<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YM
  Date: 2020/9/1
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>学生信息编辑页面</title>
</head>
<body>
<%@include file="/pages/commom/navbar-header.jsp" %>
<div class="container">
    <div class="bg-light">
        <div align="center"><br>
            <h3>学生信息编辑</h3><br>
        </div>

        <form class="maginDiv needs-validation was-validated" action="admin/studentServlet" method="post">
            <input type="hidden" name="action" value="${empty param.id ? "add" : "update"}">
            <input type="hidden" name="id" value="${requestScope.student.id}">

            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="stu_id">学号:</label>
                    <input type="text" class="form-control" id="stu_id" name="stu_id"
                           value="${requestScope.student.stu_id}" required>
                    <div class="invalid-feedback">
                        学号不能为空
                    </div>
                </div>
                <div class="form-group col-md-4">
                    <label for="name">姓名:</label>
                    <input type="text" class="form-control" id="name" name="name"
                           value="${requestScope.student.name}" required>
                    <div class="invalid-feedback">
                        姓名不能为空
                    </div>
                </div>
                <div class="form-group col-md-4">
                    <label for="sex">性别:</label>
                    <select id="sex" class="form-control" name="sex" required>
                        <option value="${requestScope.student.sex}">${empty requestScope.student.sex ? "请选择..." : requestScope.student.sex eq 0 ? "男" : "女"}</option>
                        <option value="0">男</option>
                        <option value="1">女</option>
                    </select>
                    <div class="invalid-feedback">
                        性别不能为空
                    </div>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="password">密码:</label>
                    <input type="text" class="form-control" id="password" name="password"
                           value="${requestScope.student.password}" required>
                    <div class="invalid-feedback">
                        密码不能为空
                    </div>
                </div>
                <div class="form-group col-md-4">
                    <label for="grade">年级:</label>
                    <select id="grade" class="form-control" name="grade" required>
                        <option value="${requestScope.student.grade}">${empty requestScope.student.grade ? "请选择..." : requestScope.student.grade}</option>
                        <c:forEach items="${requestScope.grades}" var="grade">
                            <option value="${grade.grade}">${grade.grade}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        年级不能为空
                    </div>
                </div>
                <div class="form-group col-md-4">
                    <label for="t_class">班级:</label>
                    <select id="t_class" class="form-control" name="t_class" required>
                        <option value="${requestScope.student.t_class}">${empty requestScope.student.t_class ? "请选择..." : requestScope.student.t_class}</option>
                        <c:forEach items="${requestScope.t_classes}" var="t_class">
                            <option value="${t_class.t_class}">${t_class.t_class}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        班级不能为空
                    </div>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="certification">讲座认证:</label>
                    <input type="text" class="form-control" id="certification" name="certification"
                           value="${requestScope.student.certification}" required>
                    <div class="invalid-feedback">
                        讲座认证不能为空
                    </div>
                </div>
                <div class="form-group col-md-4">
                    <label for="phone">手机:</label>
                    <input type="text" class="form-control" id="phone" name="phone"
                           value="${requestScope.student.phone}" required>
                    <div class="invalid-feedback">
                        手机不能为空
                    </div>
                </div>
                <div class="form-group col-md-4">
                    <label for="email">邮箱:</label>
                    <input type="text" class="form-control" id="email" name="email"
                           value="${requestScope.student.email}" required>
                    <div class="invalid-feedback">
                        邮箱不能为空
                    </div>
                </div>
            </div>
            <div align="center">
                <button type="submit" class="btn btn-primary">提交</button>
                <a type="button" class="${empty param.id ? "backClass" : ""} btn btn-secondary"
                   href="admin/studentServlet?action=list&page=student">返回</a>
            </div>
            <br>
        </form>
    </div>
</div>

<%@include file="/pages/commom/footer.jsp" %>
<script type="text/javascript">
    $(function () {
        $("a.backClass").click(function () {
            return confirm("返回后编辑信息将会消失！确定返回吗？")
        });
    });
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: YM
  Date: 2020/8/31
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>讲座类型编辑页面</title>
</head>
<body>
<%@include file="/pages/commom/navbar-header.jsp" %>

<div class="container">
    <div class="bg-light">
        <div align="center"><br>
            <h3>讲座类型编辑</h3><br>
        </div>

        <form class="maginDiv needs-validation was-validated" action="admin/typeServlet" method="post">
            <input type="hidden" name="action" value="${empty param.id ? "add" : "update"}">
            <input type="hidden" name="id" value="${requestScope.type.id}">
            <input type="hidden" name="msg" class="msg" value="${requestScope.msg}">
            <div class="form-row">
                <div class="form-group col-md-3">
                </div>
                <!--讲座题目-->
                <div class="form-group col-md-6">
                    <label for="type">讲座类型:</label>
                    <input type="text" class="form-control" id="type" name="type"
                           value="${requestScope.type.type}" required>
                    <div class="invalid-feedback">
                        讲座类型不能为空
                    </div>
                </div>
            </div>
            <div align="center">
                <button type="submit" class="btn btn-primary">提交</button>
                <a type="button" class="${empty param.id ? "backClass" : ""} btn btn-secondary" href="admin/typeServlet?action=list&page=type">返回</a>
            </div>
            <br>
        </form>
    </div>
</div>

<%@include file="/pages/commom/footer.jsp" %>
<script type="text/javascript">
    $(function () {
        var msg = $("input.msg").val()
        if (msg !== ""){
            alert(msg);
        }

        $("a.backClass").click(function () {
            return confirm("返回后编辑信息将会消失！确定返回吗？")
        });
    });
</script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>学生登陆页面</title>
</head>

<body class="my-login-page">

<%@include file="/pages/commom/navbar_header.jsp" %>

<div class="container">
    <div class="bg-primary">
        <br>
        <div class="row card_margin">
            <div id="login_content" class="col-md-7" align="center">
                <span class="login_word">学分讲座细则...</span>
            </div>
            <div class="card-wrapper col-md-5">
                <div class="card fat">
                    <div class="card-body">
                        <h3 class="card-title">登录</h3>
                        <div class="msg_cont">
                            <b></b>
                            <span class="errorMsg">
                                ${empty requestScope.msg ? "请输入用户名和密码" : requestScope.msg}
                            </span>
                        </div>
                        <br>
                        <form action="userServlet" method="post">
                            <input id="login_method" type="hidden" name="action" value="clientLogin">
                            <div class="form-group">
                                <label for="name">学号 / 管理员账号：</label>
                                <input id="name" type="text" class="form-control" name="name"
                                       placeholder="请输入账号"
                                       value="${requestScope.name}" required autofocus>
                            </div>

                            <div class="form-group">
                                <label for="password">密码：</label>
                                <input id="password" type="password" class="form-control" name="password"
                                       placeholder="请输入密码" required data-eye>
                            </div>

                            <div class="form-group">
                                <div class="field">
                                    <label for="passcode">验证码：</label>
                                    <div class="row">
                                        <div class="col-6">
                                            <input id="passcode" type="text" class="form-control" name="passcode"
                                                   placeholder="请输入验证码" data-validate="required:请填写右侧的验证码"/>
                                        </div>
                                        <div class="col-6">
                                            <img src="static/img/code.bmp"
                                                 width="80" height="38" class="passcode"/>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-4">
                                    <label><input id="student" name="login_type" type="radio" value="0" checked/>
                                        学生</label>
                                </div>
                                <div class="col-4">
                                    <label><input id="admin" name="login_type" type="radio" value="1"/>管理员</label>
                                </div>
                            </div>

                            <div class="form-group no-margin">
                                <button type="submit" class="btn btn-primary btn-block">
                                    登陆
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <br>
    </div>
</div>

<%@include file="/pages/commom/footer.jsp" %>

<script type="text/javascript">
    $(function () {
        $('input:radio[name="login_type"]').click(function () {
            var login_type = $(this).val();
            if (login_type === "0") {
                $("#login_method").val("clientLogin");
            } else if (login_type === "1") {
                $("#login_method").val("adminLogin");
            }
        });
    })
</script>
</body>
</html>
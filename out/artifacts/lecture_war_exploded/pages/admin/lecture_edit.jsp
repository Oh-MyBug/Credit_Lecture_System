<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>讲座信息编辑页面</title>
</head>
<body>

<%@include file="/pages/commom/navbar_header.jsp" %>

<div class="container">
    <div class="bg-light">
        <div align="center"><br>
            <h3>讲座信息编辑</h3><br>
        </div>

        <form class="maginDiv needs-validation was-validated" action="admin/lectureServlet" method="post">
            <input type="hidden" name="pageNo" value="${param.pageNo}">
            <input type="hidden" name="action" value="${empty param.id ? "add" : "update"}">
            <input type="hidden" name="id" value="${requestScope.lecture.id}">
            <div class="form-row">
                <!--讲座题目-->
                <div class="form-group col-md-6">
                    <label for="title">讲座主题:</label>
                    <input type="text" class="form-control" id="title" name="title"
                           value="${requestScope.lecture.title}" required>
                    <div class="invalid-feedback">
                        讲座主题不能为空
                    </div>
                </div>
                <!--讲座类型-->
                <div class="form-group col-md-4">
                    <label for="type">讲座类型:</label>
                    <select id="type" class="form-control" name="type" required>
                        <option value="${requestScope.lecture.type}">${empty requestScope.lecture.type ? "请选择..." : requestScope.lecture.type}</option>
                        <c:forEach items="${requestScope.types}" var="type">
                            <option value="${type.type}">${type.type}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        讲座类型不能为空
                    </div>
                </div>
                <!--讲座类型-->
                <div class="form-group col-md-2">
                    <label for="status">讲座状态:</label>
                    <select id="status" class="form-control" name="status" required>
                        <option value="${requestScope.lecture.status}">${empty requestScope.lecture.status ? "请选择..." : requestScope.lecture.status}</option>
                        <c:forEach items="${requestScope.status}" var="status">
                            <option value="${status.key}">${status.key}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        讲座状态不能为空
                    </div>
                </div>
            </div>
            <div class="form-row">
                <!--主讲人-->
                <div class="form-group col-md-4">
                    <label for="speaker">主讲人:</label>
                    <input type="text" class="form-control" id="speaker" name="speaker"
                           value="${requestScope.lecture.speaker}">
                </div>
                <!--讲座地点-->
                <div class="form-group col-md-4">
                    <label for="location">讲座地点:</label>
                    <select id="location" class="form-control" name="location" required>
                        <option value="${requestScope.lecture.location}">${empty requestScope.lecture.location ? "请选择..." : requestScope.lecture.location}</option>
                        <c:forEach items="${requestScope.locations}" var="location">
                            <option value="${location.location}">${location.location}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        讲座地点不能为空
                    </div>
                </div>
                <!--讲座时间-->
                <div class="form-group col-md-4">
                    <label for="time">讲座时间:</label>
                    <input type="datetime-local" class="form-control" id="time" name="time"
                           value='${requestScope.time}'>
                </div>
            </div>
            <!--主讲人介绍-->
            <div class="form-group">
                <label for="speaker_introduction">主讲人介绍:</label>
                <textarea class="form-control" id="speaker_introduction" rows="3"
                          name="speaker_introduction">${requestScope.lecture.speaker_introduction}</textarea>
            </div>
            <!--讲座内容-->
            <div class="form-group">
                <label for="content">讲座内容:</label>
                <textarea class="form-control" id="content" rows="3" name="content"
                          required>${requestScope.lecture.content}</textarea>
                <div class="invalid-feedback">
                    讲座内容不能为空
                </div>
            </div>

            <br>
            <hr>
            <br>

            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="yingshu1">应数班(大一)/总人数</label>
                    <input type="number" class="form-control" id="yingshu1" name="yingshu1" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.yingshu1 ? 0 : requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="yingshu2">应数班(大二)/总人数</label>
                    <input type="number" class="form-control" id="yingshu2" name="yingshu2" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.yingshu2 ? 0 : requestScope.lecture.yingshu2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="yingshu3">应数班(大三)/总人数</label>
                    <input type="number" class="form-control" id="yingshu3" name="yingshu3" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.yingshu3 ? 0 : requestScope.lecture.yingshu3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="yingshu4">应数班(大四)/总人数</label>
                    <input type="number" class="form-control" id="yingshu4" name="yingshu4" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.yingshu4 ? 0 : requestScope.lecture.yingshu4}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="tongji1">统计班(大一)/总人数</label>
                    <input type="number" class="form-control" id="tongji1" name="tongji1" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.tongji1 ? 0 : requestScope.lecture.tongji1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="tongji2">统计班(大二)/总人数</label>
                    <input type="number" class="form-control" id="tongji2" name="tongji2" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.tongji2 ? 0 : requestScope.lecture.tongji2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="tongji3">统计班(大三)/总人数</label>
                    <input type="number" class="form-control" id="tongji3" name="tongji3" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.tongji3 ? 0 : requestScope.lecture.tongji3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="tongji4">统计班(大四)/总人数</label>
                    <input type="number" class="form-control" id="tongji4" name="tongji4" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.tongji4 ? 0 : requestScope.lecture.tongji4}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="xinji1">信计班(大一)/总人数</label>
                    <input type="number" class="form-control" id="xinji1" name="xinji1" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.xinji1 ? 0 : requestScope.lecture.xinji1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="xinji2">信计班(大二)/总人数</label>
                    <input type="number" class="form-control" id="xinji2" name="xinji2" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.xinji2 ? 0 : requestScope.lecture.xinji2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="xinji3">信计班(大三)/总人数</label>
                    <input type="number" class="form-control" id="xinji3" name="xinji3" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.xinji3 ? 0 : requestScope.lecture.xinji3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="xinji4">信计班(大四)/总人数</label>
                    <input type="number" class="form-control" id="xinji4" name="xinji4" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.xinji4 ? 0 : requestScope.lecture.xinji4}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="shuji1">数计班(大一)/总人数</label>
                    <input type="number" class="form-control" id="shuji1" name="shuji1" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shuji1 ? 0 : requestScope.lecture.shuji1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shuji2">数计班(大二)/总人数</label>
                    <input type="number" class="form-control" id="shuji2" name="shuji2" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shuji2 ? 0 : requestScope.lecture.shuji2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shuji3">数计班(大三)/总人数</label>
                    <input type="number" class="form-control" id="shuji3" name="shuji3" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shuji3 ? 0 : requestScope.lecture.shuji3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shuji4">数计班(大四)/总人数</label>
                    <input type="number" class="form-control" id="shuji4" name="shuji4" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shuji4 ? 0 : requestScope.lecture.shuji4}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="shujin1">数金班(大一)/总人数</label>
                    <input type="number" class="form-control" id="shujin1" name="shujin1" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shujin1 ? 0 : requestScope.lecture.shujin1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shujin2">数金班(大二)/总人数</label>
                    <input type="number" class="form-control" id="shujin2" name="shujin2" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shujin2 ? 0 : requestScope.lecture.shujin2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shujin3">数金班(大三)/总人数</label>
                    <input type="number" class="form-control" id="shujin3" name="shujin3" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shujin3 ? 0 : requestScope.lecture.shujin3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shujin4">数金班(大四)/总人数</label>
                    <input type="number" class="form-control" id="shujin4" name="shujin4" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shujin4 ? 0 : requestScope.lecture.shujin4}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="shushi1">数师班(大一)/总人数</label>
                    <input type="number" class="form-control" id="shushi1" name="shushi1" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shushi1 ? 0 : requestScope.lecture.shushi1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shushi2">数师班(大二)/总人数</label>
                    <input type="number" class="form-control" id="shushi2" name="shushi2" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shushi2 ? 0 : requestScope.lecture.shushi2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shushi3">数师班(大三)/总人数</label>
                    <input type="number" class="form-control" id="shushi3" name="shushi3" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shushi3 ? 0 : requestScope.lecture.shushi3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shushi4">数师班(大四)/总人数</label>
                    <input type="number" class="form-control" id="shushi4" name="shushi4" min="0" placeholder="输入人数"
                           value="${empty requestScope.lecture.shushi4 ? 0 : requestScope.lecture.shushi4}">
                </div>
            </div>
            <div align="center">
                <button type="submit" class="btn btn-primary">提交</button>
                <a type="button" class="${empty param.id ? "backClass" : ""} btn btn-secondary"
                   href="admin/lectureServlet?action=list&page=lecture">返回</a>
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
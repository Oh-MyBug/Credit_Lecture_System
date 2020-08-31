<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/pages/commom/header.jsp" %>
    <title>讲座信息编辑页面</title>

</head>
<body>

<%@include file="/pages/commom/navbar-header.jsp" %>

<div class="container">
    <div class="bg-light">
        <div align="center"><br>
            <h3 style="color: grey">讲座信息编辑</h3><br>
        </div>

        <form class="maginDiv needs-validation was-validated" action="admin/lectureServlet" method="post">
            <input type="hidden" name="action" value="add">
            <div class="form-row">
                <!--讲座题目-->
                <div class="form-group col-md-8">
                    <label for="lecture_title">讲座主题:</label>
                    <input type="text" class="form-control" id="lecture_title" value="${requestScope.lecture.title}"
                           required>
                    <div class="invalid-feedback">
                        讲座主题不能为空
                    </div>
                </div>
                <!--讲座类型-->
                <div class="form-group col-md-2">
                    <label for="lecture_type">讲座类型:</label>
                    <select id="lecture_type" class="form-control" required>
                        <option value="">请选择...</option>
                        <c:forEach items="${requestScope.types}" var="type">
                        <option value="${type.id}">${type.type}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        讲座类型不能为空
                    </div>
                </div>
                <!--讲座类型-->
                <div class="form-group col-md-2">
                    <label for="lecture_status">讲座状态:</label>
                    <select id="lecture_status" class="form-control" required>
                        <option value="">请选择...</option>
                        <option value="0">未开放</option>
                        <option value="1">抽签阶段</option>
                        <option value="2">确认阶段</option>
                        <option value="3">已结束</option>
                    </select>
                </div>
                <div class="invalid-feedback">
                    讲座状态不能为空
                </div>
            </div>
            <div class="form-row">
                <!--主讲人-->
                <div class="form-group col-md-4">
                    <label for="lecture_speaker">主讲人:</label>
                    <input type="text" class="form-control" id="lecture_speaker"
                           value="${requestScope.lecture.speaker}">
                </div>
                <!--讲座地点-->
                <div class="form-group col-md-4">
                    <label for="lecture_location">讲座地点:</label>
                    <select id="lecture_location" class="form-control" required>
                        <option value="">请选择...</option>
                        <c:forEach items="${requestScope.locations}" var="location">
                        <option value="${location.id}">${location.location}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="invalid-feedback">
                    讲座地点不能为空
                </div>
                <!--讲座时间-->
                <div class="form-group col-md-4">
                    <label for="lecture_time">讲座时间:</label>
                    <input type="datetime-local" class="form-control" id="lecture_time"
                           value="${requestScope.lecture.time}">
                </div>
            </div>
            <!--主讲人介绍-->
            <div class="form-group">
                <label for="speaker_introduction">主讲人介绍:</label>
                <textarea class="form-control" id="speaker_introduction" rows="3"
                          value="${requestScope.lecture.speakerIntroduction}"></textarea>
            </div>
            <!--讲座内容-->
            <div class="form-group">
                <label for="lecture_content">讲座内容:</label>
                <textarea class="form-control" id="lecture_content" rows="3" value="${requestScope.lecture.content}"
                          required></textarea>
            </div>
            <div class="invalid-feedback">
                讲座内容不能为空
            </div>
            <br>
            <hr>
            <br>

            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="yingshu1">应数班(大一)/总人数</label>
                    <input type="number" class="form-control" id="yingshu1" name="yingshu1" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="yingshu2">应数班(大二)/总人数</label>
                    <input type="number" class="form-control" id="yingshu2" name="yingshu2" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="yingshu3">应数班(大三)/总人数</label>
                    <input type="number" class="form-control" id="yingshu3" name="yingshu3" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu3}">
                </div>
                <div class="form-group col-md-3">
                    <label for="yingshu4">应数班(大四)/总人数</label>
                    <input type="number" class="form-control" id="yingshu4" name="yingshu4" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu4}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="tongji1">统计班(大一)/总人数</label>
                    <input type="number" class="form-control" id="tongji1" name="tongji1" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.tongji1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="tongji2">统计班(大二)/总人数</label>
                    <input type="number" class="form-control" id="tongji2" name="tongji2" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.tongji2}">
                </div>
                <div class="form-group col-md-3">
                    <label for="tongji3">统计班(大三)/总人数</label>
                    <input type="number" class="form-control" id="tongji3" name="tongji3" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="tongji4">统计班(大四)/总人数</label>
                    <input type="number" class="form-control" id="tongji4" name="tongji4" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="xinji1">信计班(大一)/总人数</label>
                    <input type="number" class="form-control" id="xinji1" name="xinji1" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="xinji2">信计班(大二)/总人数</label>
                    <input type="number" class="form-control" id="xinji2" name="xinji2" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="xinji3">信计班(大三)/总人数</label>
                    <input type="number" class="form-control" id="xinji3" name="xinji3" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="xinji4">信计班(大四)/总人数</label>
                    <input type="number" class="form-control" id="xinji4" name="xinji4" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="shuji1">数计班(大一)/总人数</label>
                    <input type="number" class="form-control" id="shuji1" name="shuji1" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shuji2">数计班(大二)/总人数</label>
                    <input type="number" class="form-control" id="shuji2" name="shuji2" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shuji3">数计班(大三)/总人数</label>
                    <input type="number" class="form-control" id="shuji3" name="shuji3" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shuji4">数计班(大四)/总人数</label>
                    <input type="number" class="form-control" id="shuji4" name="shuji4" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="shujin1">数金班(大一)/总人数</label>
                    <input type="number" class="form-control" id="shujin1" name="shujin1" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shujin2">数金班(大二)/总人数</label>
                    <input type="number" class="form-control" id="shujin2" name="shujin2" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shujin3">数金班(大三)/总人数</label>
                    <input type="number" class="form-control" id="shujin3" name="shujin3" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shujin4">数金班(大四)/总人数</label>
                    <input type="number" class="form-control" id="shujin4" name="shujin4" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="shushi1">数师班(大一)/总人数</label>
                    <input type="number" class="form-control" id="shushi1" name="shushi1" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shushi2">数师班(大二)/总人数</label>
                    <input type="number" class="form-control" id="shushi2" name="shushi2" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shushi3">数师班(大三)/总人数</label>
                    <input type="number" class="form-control" id="shushi3" name="shushi3" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
                <div class="form-group col-md-3">
                    <label for="shushi4">数师班(大四)/总人数</label>
                    <input type="number" class="form-control" id="shushi4" name="shushi4" min="0" placeholder="输入人数"
                           value="${requestScope.lecture.yingshu1}">
                </div>
            </div>
            <div align="center">
                <button type="submit" class="btn btn-primary">提交</button>
            </div>
            <br>
        </form>
    </div>
</div>

<%@include file="/pages/commom/footer.jsp" %>
</body>
</html>
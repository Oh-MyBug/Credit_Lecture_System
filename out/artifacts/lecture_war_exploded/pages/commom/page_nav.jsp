<%--
  Created by IntelliJ IDEA.
  User: YM
  Date: 2020/9/2
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-2"></div>
    <nav aria-label="...">
        <ul class="pagination justify-content-center">
            <li class="page-item ${requestScope.page.pageNo > 1 ? "" : "disabled"}">
                <a class="page-link" href="${requestScope.page.url}&pageNo=1">
                    首页
                </a>
            </li>

            <li class="page-item ${requestScope.page.pageNo > 1 ? "" : "disabled"}">
                <a class="page-link" href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo - 1}">
                    上一页
                </a>
            </li>

            <%-- 页码输出的开始 --%>
            <c:choose>
                <c:when test="${requestScope.page.pageTotal <= 5}">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="${requestScope.page.pageTotal}"/>
                </c:when>

                <c:when test="${requestScope.page.pageTotal > 5}">
                    <c:choose>
                        <c:when test="${requestScope.page.pageNo <= 3}">
                            <c:set var="begin" value="1"/>
                            <c:set var="end" value="5"/>
                        </c:when>
                        <c:when test="${requestScope.page.pageNo > requestScope.page.pageTotal - 3}">
                            <c:set var="begin" value="${requestScope.page.pageTotal - 4}"/>
                            <c:set var="end" value="${requestScope.page.pageTotal}"/>
                        </c:when>
                        <c:otherwise>
                            <c:set var="begin" value="${requestScope.page.pageNo - 2}"/>
                            <c:set var="end" value="${requestScope.page.pageNo + 2}"/>
                        </c:otherwise>
                    </c:choose>
                </c:when>
            </c:choose>

            <c:forEach begin="${begin}" end="${end}" var="i">
                <c:if test="${i == requestScope.page.pageNo}">
                    <li class="page-item active" aria-current="page">
                        <span class="page-link"> ${i} <span class="sr-only">(current)</span> </span>
                    </li>
                </c:if>
                <c:if test="${i != requestScope.page.pageNo}">
                    <li class="page-item">
                        <a class="page-link" href="${requestScope.page.url}&pageNo=${i}">${i}</a>
                    </li>
                </c:if>
            </c:forEach>
            <%-- 页码输出的结束 --%>

            <li class="page-item ${requestScope.page.pageNo < requestScope.page.pageTotal ? "" : "disabled"}">
                <a class="page-link" href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo + 1}">下一页</a>
            </li>

            <li class="page-item ${requestScope.page.pageNo < requestScope.page.pageTotal ? "" : "disabled"}">
                <a class="page-link" href="${requestScope.page.url}&pageNo=${requestScope.page.pageTotal}">末页</a>
            </li>
        </ul>
    </nav>

    <span>
        &nbsp;&nbsp;&nbsp;共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录
        到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页
        <input class="btn btn-primary" id="searchPageBtn" type="button" value="确定">
    </span>

</div>

<script type="text/javascript">
    $(function () {
        $("#searchPageBtn").click(function () {
            var pageNo = $("#pn_input").val();
            var pageTotal = ${requestScope.page.pageTotal};
            if (pageNo <= pageTotal && pageNo >= 1)
                location.href = "${pageScope.basePath}${requestScope.page.url}&pageNo=" + pageNo;
        })
    })
</script>
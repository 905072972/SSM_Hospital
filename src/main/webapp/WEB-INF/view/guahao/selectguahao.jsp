<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/8 0008
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>查询挂号</title>
</head>
<body>
<form action="selectguahao" method="post">
    挂号单编号<input type="text" name="guahao_id">
    <input type="submit" value="查询">
</form>
<form >
    <table border="1">
        <tr>
            <td><strong>挂号编号</strong>
            </td>
            <td><strong>医院编号</strong>
            </td>
            <td><strong>挂号类型</strong>
            </td>
            <td><strong>姓名</strong>
            </td>
            <td><strong>性别</strong>
            </td>
            <td><strong>年龄</strong>
            </td>
            <td><strong>挂号日期</strong>
            </td>
            <td><strong>病人编号</strong>
            </td>
        </tr>


        <c:forEach items="${requestScope.pagemsg}" var="mf">
        <tr><td>${mf.guahao_id }</td>
            <td>${mf.hospital_id }</td>
            <td>${mf.guahao_type }</td>
            <td>${mf.name }</td>
            <td>${mf.sex}</td>
            <td>${mf.age}</td>
            <td><fmt:formatDate value="${mf.guahao_date}" pattern="yyyy-M-d" /></td>
            <td>${mf.patient_id}</td>
            </c:forEach>
    </table>
</form>
<br>
<%--<span>第${requestScope.pagemsg.currPage }/ ${requestScope.pagemsg.totalPage}页</span>--%>
<%--<span>总记录数：${requestScope.pagemsg.totalCount }每页显示:${requestScope.pagemsg.pageSize}</span>--%>
<%--<span>--%>
       <%--<c:if test="${requestScope.pagemsg.currPage != 1}">--%>
           <%--<a href="${pageContext.request.contextPath }/selectguahao?currentPage=1">[首页]</a>--%>
           <%--<a href="${pageContext.request.contextPath }/selectguahao?currentPage=${requestScope.pagemsg.currPage-1}">[上一页]</a>--%>
       <%--</c:if>--%>

       <%--<c:if test="${requestScope.pagemsg.currPage != requestScope.pagemsg.totalPage}">--%>
           <%--<a href="${pageContext.request.contextPath }/selectguahao?currentPage=${requestScope.pagemsg.currPage+1}">[下一页]</a>--%>
           <%--<a href="${pageContext.request.contextPath }/selectguahao?currentPage=${requestScope.pagemsg.totalPage}">[尾页]</a>--%>
       <%--</c:if>--%>

<A  href="guahao">返回挂号主页</A><br>
<a href="javascript:history.back(-1)" >上一页</a>
</body>
</html>

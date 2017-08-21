<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/11 0011
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>门诊管理</title>
</head>
<body>
<form action="list" method="post">
    挂号单编号<input type="text" name="name">
    <input type="submit" value="查询">
</form>
<form >
    <table border="1">
        <tr>
            <td><strong>挂号编号</strong>
            </td>
            <td><strong>姓名</strong>
            </td>
            <td><strong>操作</strong>
            </td>
            <td><strong>状态</strong></td>
        </tr>
        <c:forEach items="${list}" var="mf">
        <tr><td>${mf.guahao_id }</td>
            <td>${mf.name }</td>
            <td><A href="load/${mf.patient_id}">接诊</A>
            </td>
            <td><c:forEach items="${list2}" var="k">
                <c:if test="${k==mf.patient_id}">
                    已接诊
                </c:if>
                </c:forEach>
            </td>
            </c:forEach>
    </table>
</form>
<br>


<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>

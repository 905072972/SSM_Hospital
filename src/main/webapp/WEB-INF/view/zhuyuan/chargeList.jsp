<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12 0012
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="addcharge" >添加住院人收费信息</a>
<form action="list2" method="post">
    病人姓名<input type="text" name="name">
    <input type="submit" value="查询">
</form>
<table border="1">
    <tr>
        <td>收费编号</td>
        <td>病人编号</td>
        <td>姓名</td>
        <td>收费日期</td>
        <td>收费金额</td>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${list}" var="e" >
        <tr >
            <td>${e.id}</td>
            <td>${e.patient_id}</td>
            <td>${e.name}</td>
            <td><fmt:formatDate value="${e.date}" pattern="yyyy-M-d" /></td>
            <td>${e.money}</td>
            <td><a href="load2/${e.patient_id}">编辑</a>
                <a href="delete2/${e.patient_id}">删除</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>

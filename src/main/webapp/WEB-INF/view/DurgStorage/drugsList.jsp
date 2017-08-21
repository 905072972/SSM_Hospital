<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/10 0010
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>药品查询</title>
</head>
<body>
<form action="list" method="post">
    <a href="add">添加员工</a><br>
    药品名称<input type="text" name="drugsname">
    <input type="submit" value="查询">
</form>
<table border="1">
    <tr>
        <td>药品编号</td>
        <td>类品编号</td>
        <td>药品名称</td>
        <td>单价单位编号</td>
        <td>规格</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${list}" var="mf">
    <tr>
        <td>${mf.drugsid }</td>
        <td>${mf.typeid}</td>
        <td>${mf.drugsname}</td>
        <td>${mf.pricecompanyid }</td>
        <td>${mf.size }</td>
        <td><a href="load/${mf.drugsid}">编辑</a>
            <a href="delete/${mf.drugsid}">删除</a>
        </td>
    </tr>
    </c:forEach>
</table>

<a href="javascript:history.back(-1)" >上一页</a>
</body>
</html>

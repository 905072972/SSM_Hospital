<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12 0012
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>编辑住院人收费信息</h1>

<form action="update2" method="post">
    <input type="hidden" value="${list.patient_id}" name="patient_id">
    收费编号：
    <input type="text" name="id" value="${list.id}"><br>
    姓名：
    <input type="text" name="name" value="${list.name}"><br>

    收费日期：
    <input type="date" name="date" value="${list.date}"><br>
    费用：
    <input type="text" name="money" value="${list.money}"><br>
    <input type="submit" />
</form>

<a href="javascript:history.back(-1)">上一页</a>
</body>
</html>

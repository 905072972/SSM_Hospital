<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/4 0004
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<h2>欢迎登录</h2>

<form action="login" method="get">
    用户编号：
    <input type="text" name="userid" value="${cookie.userid.value}"><br>
    员工编号：
    <input type="text" name="employeeid" value="${cookie.employeeid.value}"><br>
    用户名:
    <input type="text" name="username" value="${cookie.username.value}"/><br>
    密&nbsp;码:
    <input type="password" name="password" value="${cookie.pwd.value}"/><br>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
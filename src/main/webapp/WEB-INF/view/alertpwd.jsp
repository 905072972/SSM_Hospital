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
    <title>修改密码</title>
</head>
<body>

<h2>修改密码</h2>

<form  action="alertpwd.do" method="post" >
    请输入用户名：
    <input type="text"  name="username" ><br>
    请输入原来密码：
    <input type="text"  name="password" ><br>
    请输入新密码：
    <input type="password" name="newpwd"><br>
    再输入新密码：
    <input type="password" name="newpwd2"/><br>
    <input type="submit" value="更改"/>
</form>
<A  href="login1">重新登录</A><br>
<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>
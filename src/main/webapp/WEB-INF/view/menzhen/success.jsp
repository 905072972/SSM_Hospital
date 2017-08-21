<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/14 0014
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":"
            + request.getServerPort() +
            path + "/";
%>
<body>
<h1>处理成功！！！</h1>
<a href="<%=basePath%>menzhen/list" >继续查看挂号人</a>
</body>
</html>

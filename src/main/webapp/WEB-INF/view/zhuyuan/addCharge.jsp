<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12 0012
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加住院人收费信息</h1>

<form action="save2" method="post">

    病人编号：
    <input type="text" name="patient_id"><br>
    收费项目编号：
    <input type="text" name="id"><br>
    收费名称：
    <input type="text" name="name"><br>
    收费日期：
    <input type="date" name="date"><br>
    费用：
    <input type="text" name="money"/><br>
    <input type="submit" value="添加"/>
</form>

<a href="javascript:history.back(-1)">上一页</a>
</body>
</html>

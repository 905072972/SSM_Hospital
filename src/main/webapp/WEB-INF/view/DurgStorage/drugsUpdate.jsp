<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Document</title>
</head>
<body>
<h1>编辑药品</h1>
<form action="update" method="post">
    <input type="hidden" value="${drugs.drugsid}" name="drugsid">
    类品编号：
    <input type="text" name="typeid" value="${drugs.typeid}"> <br>
    药品名称：
    <input type="text" name="drugsname" value="${drugs.drugsname}"> <br>
    单价单位编号：
    <input type="text" name="pricecompanyid" value="${drugs.pricecompanyid}"> <br>
    规格：
    <input type="text" name="size" value="${drugs.size}"> <br>
    <input type="submit">
</form>
</body>
</html>
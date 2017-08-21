<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="add1" method="post">
    药品编号:<input type="text" name="drugsid"><br>
    类品编号:<input type="text" name="typeid"><br>
    药品名称： <input type="text" name="drugsname"><br>
    单价单位编号：<input type="text" name="pricecompanyid"><br>
    规格：<input type="text" name="size"><br>
    <input type="submit" value="确认">
</form>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/8 0008
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>挂号单的录入</h2>

<form action="addguahao1" method="post">

    挂号编号：
    <input type="text" name="guahao_id"><br>
    医院编号：
    <input type="text" name="hospital_id"><br>

    挂号类型：
    <select name="guahao_type" id="guahao_type">
    <option value="">--请选择类型--</option>
    <br>
    <c:forEach items="${guahaoList}" var="guahao">
    <option value="${guahao.guahao_type}">
            ${guahao.type}
    </option>
    </c:forEach>
    </select>
    <br>
    姓名：
    <input type="text" name="name"/><br>
    性别：
    <input type="radio" name="sex" value="男"/>男
    <input type="radio" name="sex" value="女"/>女
    <br>
    年龄：
    <input type="text" name="age"/><br>
    挂号日期：
    <input type="date" name="guahao_date"/><br>
    病人编号：
    <input type="text" name="patient_id"/><br>
    <input type="submit" value="添加"/>
</form>

<A href="guahao">返回挂号主页</A><br>
<a href="javascript:history.back(-1)">上一页</a>
</body>
</html>

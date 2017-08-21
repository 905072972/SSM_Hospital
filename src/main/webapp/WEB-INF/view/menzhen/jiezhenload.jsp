<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/11 0011
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>接诊的病人</h1>
<form action="add" method="post">
    <input type="hidden" value="${patient.patient_id}" name="patient_id">
    病人姓名：
    <input type="text" name="name" value="${patient.name}"><br>
    性别:
    <input type="text" name="sex" value="${patient.sex}"><br>
    年龄:
    <input type="text" name="age" value="${patient.age}"><br>
    挂号日期:
    <input type="text" name="guahao_date"
           value="<fmt:formatDate value="${patient.guahao_date}" pattern="yyyy-M-d" />"><br>
    病人编号:
    <input type="text" name="guahao_date" value="${patient.patient_id}"><br>
    诊断:<br>
    <textarea name="zhenduan" cols="30" rows="10"></textarea><br>
    <input type="submit">
    <br>

    <a href="javascript:history.back(-1)">上一页</a>

</form>

</body>
</html>

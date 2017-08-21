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
<form action="save" method="post">
    员工编号:<input type="text" name="employee_id"><br>
    医院编号:<input type="text" name="hospital_id"><br>
    员工姓名： <input type="text" name="name"><br>
    员工性别：
    <input type="radio" name="sex" value="男">男
    <input type="radio" name="sex" value="女">女
    <br>
    年龄：<input type="text" name="age"><br>
    出生日期：<input type="date" name="birthday"><br>
    家庭地址：<input type="text" name="address"><br>
    电话 ：<input type="text" name="phone"><br>
    科室： <select name="deptid" id="deptid">
    <option value="">--请选择科室--</option><br>
    <c:forEach items="${deptList}" var="dept">
        <option value="${dept.deptid}">
        ${dept.name}</option>
    </c:forEach>
</select>
    职位： <select name="pid" id="pid">
    <option value="">--请选择职位--</option>
    <c:forEach items="${positions}" var="pos">
        <option value="${pos.pid}">${pos.pname}</option>
    </c:forEach>
</select>
    <br>
    <input type="submit" value="确认">
</form>
<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>
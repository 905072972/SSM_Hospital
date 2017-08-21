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
<h1>编辑住院人信息</h1>

<form action="update" method="post">
    <input type="hidden" value="${list.patient_id}" name="patient_id">
    医院编号：
    <input type="text" name="hospital_id" value="${list.hospital_id}"><br>
    病床编号：
    <input type="text" name="bed_id" value="${list.bed_id}"><br>
    医生编号：
    <input type="text" name="doctor_id" value="${list.doctor_id}"><br>
    护士编号：
    <input type="text" name="nurse_id" value="${list.nurse_id}"><br>
    姓名：
    <input type="text" name="name" value="${list.name}"><br>
    性别：

    <input type="radio" name="sex" value="男"
    <c:if test="${list.sex == '男'}"> checked </c:if>>
    男
    <input type="radio" name="sex" value="女"
    <c:if test="${list.sex== '女'}"> checked </c:if>>
    女
    <br>
    年龄：
    <input type="text" name="age" value="${list.age}"><br>
    入院日期：
    <input type="date" name="ruyuandate" value="${list.ruyuandate}"><br>
    出院日期：
    <input type="date" name="chuyuandate" value="${list.chuyuandate}"><br>
    家庭住址：
    <input type="text" name="address" value="${list.address}"><br>
    联系方式：
    <input type="text" name="phone" value="${list.phone}"><br>
    担保人：
    <input type="text" name="bondsman" value="${list.bondsman}"><br>
    出院结论：
    <input type="text" name="result" value="${list.result}"><br>
    押金：
    <input type="text" name="yajin" value="${list.yajin}"><br>
    <input type="submit" />
</form>

<a href="javascript:history.back(-1)">上一页</a>
</body>
</html>

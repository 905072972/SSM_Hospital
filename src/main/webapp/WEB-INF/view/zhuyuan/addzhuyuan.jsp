<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12 0012
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加住院人信息</h1>

<form action="save" method="post">

    医院编号：
    <input type="text" name="hospital_id"><br>
    病人编号：
    <input type="text" name="patient_id"><br>
    病床编号：
    <input type="text" name="bed_id"><br>
    医生编号：
    <input type="text" name="doctor_id"><br>
    护士编号：
    <input type="text" name="nurse_id"><br>
    姓名：
    <input type="text" name="name"><br>
    性别：
    <input type="radio" name="sex" value="男"/>男
    <input type="radio" name="sex" value="女"/>女
    <br>
    年龄：
    <input type="text" name="age"><br>
    入院日期：
    <input type="date" name="ruyuandate"><br>
    出院日期：
    <input type="date" name="chuyuandate"><br>
    家庭住址：
    <input type="text" name="address"/><br>
    联系方式：
    <input type="text" name="phone"/><br>
    担保人：
    <input type="text" name="bondsman"/><br>
    出院结论：
    <input type="text" name="result"/><br>
    押金：
    <input type="text" name="yajin"/><br>
    <input type="submit" value="添加"/>
</form>

<a href="javascript:history.back(-1)">上一页</a>
</body>
</html>

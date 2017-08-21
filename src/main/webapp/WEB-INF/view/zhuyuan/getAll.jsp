<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12 0012
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="add" >添加住院人信息</a>
<form action="list" method="post">
    病人姓名<input type="text" name="name">
    <input type="submit" value="查询">
</form>
<table border="1">
    <tr>
        <td>医院编号</td>
        <td>病人编号</td>
        <td>病床编号</td>
        <td>医生编号</td>
        <td>护士编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>入院日期</td>
        <td>出院日期</td>
        <td>家庭住址</td>
        <td>联系方式</td>
        <td>担保人</td>
        <td>出院结论</td>
        <td>押金</td>
        <td>操作</td>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${list}" var="e" >
                <tr >
                    <td>${e.hospital_id}</td>
                    <td>${e.patient_id}</td>
                    <td>${e.bed_id}</td>
                    <td>${e.doctor_id}</td>
                    <td>${e.nurse_id}</td>
                    <td>${e.name}</td>
                    <td>${e.sex}</td>
                    <td>${e.age}</td>
                    <td><fmt:formatDate value="${e.ruyuandate}" pattern="yyyy-M-d" /></td>
                    <td><fmt:formatDate value="${e.chuyuandate}" pattern="yyyy-M-d" /></td>
                    <td>${e.address}</td>
                    <td>${e.phone}</td>
                    <td>${e.bondsman}</td>
                    <td>${e.result}</td>
                    <td>${e.yajin}</td>
                    <td><a href="load/${e.patient_id}">编辑</a>
                        <a href="delete/${e.patient_id}">删除</a>
                    </td>
                </tr>
    </c:forEach>



    </tbody>
</table>
<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>

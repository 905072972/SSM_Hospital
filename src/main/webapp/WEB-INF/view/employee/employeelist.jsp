
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/css/pure-min.css">
</head>
<body>
<a href="add" class="button-secondary pure-button">添加员工</a>

<table class="pure-table">
    <thead>
    <tr>
        <th>序号</th>
        <th>员工编号</th>
        <th>医院编号</th>
        <th>职位编号</th>
        <th>科室编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>出生日期</th>
        <th>家庭地址</th>
        <th>电话</th>
        <th>操作</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${emplist}" var="e" varStatus="s">
        <c:choose>
            <c:when test="${s.index % 2==0}">
                <tr class="pure-table-odd">
                    <td>${s.index}</td>
                    <td>${e.employee_id}</td>
                    <td>${e.hospital_id}</td>
                    <td>${e.pid}</td>
                    <td>${e.deptid}</td>
                    <td>${e.name}</td>
                    <td>${e.sex}</td>
                    <td>${e.age}</td>
                    <td><fmt:formatDate value="${e.birthday}" pattern="yyyy-M-d" /></td>
                    <td>${e.address}</td>
                    <td>${e.phone}</td>
                    <td><a href="load/${e.employee_id}">编辑</a>
                        <a href="delete/${e.employee_id}">删除</a>
                    </td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td>${s.index}</td>
                    <td>${e.employee_id}</td>
                    <td>${e.hospital_id}</td>
                    <td>${e.pid}</td>
                    <td>${e.deptid}</td>
                    <td>${e.name}</td>
                    <td>${e.sex}</td>
                    <td>${e.age}</td>
                    <td><fmt:formatDate value="${e.birthday}" pattern="yyyy-M-d" /></td>
                    <td>${e.address}</td>
                    <td>${e.phone}</td>
                    <td><a href="load/${e.employee_id}">编辑</a>
                        <a href="delete/${e.employee_id}">删除</a>
                    </td>
                </tr>
            </c:otherwise>
        </c:choose>
    </c:forEach>



    </tbody>
</table>
<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/10 0010
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>入库单编号</th>
        <th>药品编号</th>
        <th>入库日期</th>
        <th>进货价格</th>
        <th>进货数量</th>
        <th>员工编号</th>
        <th>性别</th>
        <th>供应商编号</th>
        <th>生产日期</th>
        <th>有效期</th>
    </tr>

    <c:forEach items="${pagemsg}" var="mf">
    <tr>
        <td>${mf.guahao_id }</td>
        <td>${mf.hospital_id }</td>
        <td>${mf.guahao_type }</td>
        <td>${mf.name }</td>
        <td>${mf.sex}</td>
        <td>${mf.age}</td>
        <td><fmt:formatDate value="${mf.guahao_date}" pattern="yyyy-M-d"/></td>
        <td>${mf.patient_id}</td>
        </c:forEach>
</table>
</body>
</html>

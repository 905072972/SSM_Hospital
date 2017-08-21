<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
<head>
    <title>Document</title>
</head>
<body>
<h1>编辑员工</h1>
<form action="update1" method="post">
    <input type="hidden" value="${employee.employee_id}" name="employee_id">
    员工姓名： <input type="text" name="name"  value="${employee.name}">
    <br>
    <%--员工性别：--%>
    <%--<input type="radio" name="sex" value="男"--%>
    <%--<c:if test="${employee.sex==男}"> checked </c:if>--%>
    <%-->男--%>
    <%--<input type="radio" name="sex" value="女"--%>
    <%--<c:if test="${employee.sex==女}"> checked </c:if>--%>
    <%-->女--%>
    <br>
    <%--科室： <select name="deptid" id="deptid">--%>
    <%--<option value="">--请选择科室--</option>--%>
    <%--<c:forEach items="${deptList}" var="dept">--%>
        <%--<c:choose>--%>
            <%--<c:when test="${dept.deptid == employee.deptid}">--%>
                <%--<option value="${dept.deptid}" selected>--%>
                        <%--${dept.name}</option>--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <%--<option value="${dept.deptid}">--%>
                        <%--${dept.name}</option>--%>
            <%--</c:otherwise>--%>
        <%--</c:choose>--%>
    <%--</c:forEach>--%>
<%--</select>--%>
    <%--职位： <select name="pid" id="pid">--%>
    <%--<option value="">--请选择职位--</option>--%>
    <%--<c:forEach items="${positions}" var="pos">--%>
        <%--<c:choose>--%>
            <%--<c:when test="${pos.pid == employee.pid}">--%>
                <%--<option value="${pos.pid}" selected>${pos.pname}</option>--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <%--<option value="${pos.pid}">${pos.pname}</option>--%>
            <%--</c:otherwise>--%>
        <%--</c:choose>--%>

    <%--</c:forEach>--%>
<%--</select><br>--%>
    <input type="submit">
</form>
<a href="javascript:history.back(-1)">上一页</a>

</body>
</html>
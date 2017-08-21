<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/4 0004
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<A  href="alertpwd">修改密码</A><br>
<c:if test="${currentUser.limits==1}">
    <TR>
        <TD>
            <A  href="guahao">挂号</A><br>
        </TD>
        <TD>
            <A  href="newOperator.jsp">结算</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${currentUser.limits==2}">
    <TR>
        <TD>
            <A  href="zhuyuan/list">住院信息的管理</A><br>
        </TD>
        <TD>
            <A  href="zhuyuan/list2">住院收费管理</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${currentUser.limits==3}">
    <TR>
        <TD >
            <A  href="menzhen/list">查看挂号人</A><br>
        </TD>
        <TD>
            <A  href="newOperator.jsp"></A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${currentUser.limits==4}">
    <TR>

        <TD width=165 height="29" bgColor=#7691c7>

            <A  href="DurgStorage/list">查询药品</A><br>
        </TD>
        <TD>
            <A  href="DurgStorage/list">药品调拨</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${currentUser.limits==5}">
    <TR>
        <TD>
            <A  href="employee/list">查询医院员工</A><br>
        </TD>
        <TD >
            <A  href="newOperator.jsp"></A><br>
        </TD>
    </TR>
</c:if>
<A  href="login1">退出登录</A><br>
</body>
</html>

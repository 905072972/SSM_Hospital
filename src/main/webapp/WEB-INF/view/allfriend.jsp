<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'allfriend.jsp' starting page</title>

</head>
<body>
	<form action="allfriend"  method="post">
		<table border="1">

			<tr>
				<td><strong>name</strong>
				</td>
				<td><strong>sex</strong>
				</td>
				<td><strong>age</strong>
				</td>
				<td><strong>qq</strong>
				</td>
				<td><strong>telephone</strong>
				</td>
				<td><strong>email</strong>
				</td>
				<td><strong>address</strong>
				</td>
			</tr>


			<c:forEach items="${requestScope.pagemsg.lists}" var="mf">
			<tr><td>${mf.name }</td><td>${mf.sex}</td><td>${mf.age}</td><td>${mf.qq}</td>
			<td>${mf.telephone}</td><td>${mf.email}</td><td>${mf.address}</td></tr>
			</c:forEach>

		</table>
	</form>
	<br>
	<span>第${requestScope.pagemsg.currPage }/ ${requestScope.pagemsg.totalPage}页</span>
	<span>总记录数：${requestScope.pagemsg.totalCount }每页显示:${requestScope.pagemsg.pageSize}</span>
	<span>
       <c:if test="${requestScope.pagemsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/allfriend?currentPage=1">[首页]</a>
           <a href="${pageContext.request.contextPath }/allfriend?currentPage=${requestScope.pagemsg.currPage-1}">[上一页]</a>
       </c:if>

       <c:if test="${requestScope.pagemsg.currPage != requestScope.pagemsg.totalPage}">
           <a href="${pageContext.request.contextPath }/allfriend?currentPage=${requestScope.pagemsg.currPage+1}">[下一页]</a>
           <a href="${pageContext.request.contextPath }/allfriend?currentPage=${requestScope.pagemsg.totalPage}">[尾页]</a>
       </c:if>
</body>

</html>

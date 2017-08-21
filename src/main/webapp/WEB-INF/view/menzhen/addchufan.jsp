<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/11 0011
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":"
            + request.getServerPort() +
            path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="adddrugs" method="post">
<h1>添加处方药品</h1>
    病人编号： <input type="text"  name="patient_id"><br>
    住院: 是<input type="radio" name="zhuyuan" value="是">
    否<input type="radio" name="zhuyuan" value="否">
<div id="add">
药品处方： <select name="drugsid" id="drugsid">
    <option value="">--请选药品处方：--</option>
    <br>
    <c:forEach items="${drugslist}" var="list">
        <option value="${list.drugsid}">
                ${list.drugsname}(${list.size})</option>
    </c:forEach>
</select>
数量：<input type="text" name="num">
<input type="button" id="adds" value="继续添加药品" /><br>

</div>
    <br>
        <input type="submit" id="tijiao" value="提交">
    </form>
</body>
<%--<script src="<%=basePath%>js/awesomplete.js"></script>--%>
<script src="<%=basePath%>js/jquery-3.1.1.min.js"></script>
<script>
    $(function () {
        //var count=0;
        $('#adds').click(function () {
            var tr ='药品处方： <select name="drugsid" id="drugsid"> ' +
                '<option value="">--请选药品处方：--</option> ' +
                '<br><c:forEach items="${drugslist}" var="list">'+
                '<option value="${list.drugsid}">${list.drugsname}(${list.size})'+
                '</option>'+
                ' </c:forEach> </select> '+
                ' 数量：<input type="text" name="num"> <br> ';
            $('#add').append(tr);
        })
    })
</script>
<br><a href="javascript:history.back(-1)">上一页</a>

</html>

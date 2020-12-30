  <%@page contentType="text/html;charset=UTF-8" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>学⽣信息</h1>
<table>
    <tr>
        <th>学⽣编号</th>
        <th>学⽣姓名</th>
        <th>学⽣年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.sex}</td>
            <td>
                <a href="/student/findById/${student.id}">修改</a>
                <a href="/student/deleteById/${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/save.jsp">添加学⽣</a>
</body>
</html>
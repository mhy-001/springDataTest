<%@page contentType="text/html;charset=UTF-8" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<title>测试项目</title>
<body>
<c:forEach items="${list}" var="stu">
    ${stu.id}--${stu.name}--${stu.age}
</c:forEach>
<c:if test="${std != null}">
    ${std.id}--${std.name}--${std.age}--${std.sex}
</c:if>
</body>
</html>
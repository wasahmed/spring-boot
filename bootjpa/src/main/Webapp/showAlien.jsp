<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<%--${alien}--%>
<p>
<c:forEach items="${alien}" var="alien">

    <p>${alien.ananme}</p>

</c:forEach>
</p>
</body>
</html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <title><spring:message code = "categoryTitle"/></title>
</head>
<body>
<c:forEach var="category" items="${categories}">
    <p>${category.getName()}</p>
</c:forEach>
</body>
</html>

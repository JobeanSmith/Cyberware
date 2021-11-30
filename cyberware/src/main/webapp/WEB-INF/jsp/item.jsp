<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <title><spring:message code = "itemTitle"/></title>
</head>
<body>
<c:forEach var="item" items="${items}">
    <p>${item.getName()}</p>
</c:forEach>
</body>
</html>

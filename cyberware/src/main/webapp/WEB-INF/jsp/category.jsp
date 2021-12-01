<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <title><spring:message code = "categoryTitle"/></title>
</head>
<body>
<h1 style="text-align: center; padding: 20px"><spring:message code = "categoryTitle"/></h1>
<ul class="list-group" style="align-items: center">
    <div>
        <li class="list-group-item d-flex justify-content-between align-items-center" style="width: 1500px">
            <div style="padding-left: 180px"><spring:message code = "nameTitle"/></div>
            <div style="padding-left: -50px; padding-right: 20px"><spring:message code = "descriptionTitle"/></div>
        </li>
        <c:forEach var="categorie" items="${categories}">
            <li class="list-group-item d-flex justify-content-between align-items-center" style="width: 1500px">
                <img alt="${categorie.getName()}" src="<spring:url value="/image/cyber.png"/>" height="100" width="100" style="border-right: 50px"/>
                <div style="padding-left: 20px; padding-right: 20px; width: 400px">${categorie.getName()}</div>
                <div style="padding-left: 20px; padding-right: 20px; width: 400px">${categorie.getName()}</div>
            </li>
        </c:forEach>
    </div>
</ul>
</body>
</html>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <title><spring:message code="categoryTitle"/></title>
</head>
<body>
<h1 style="text-align: center; padding: 20px"><spring:message code="categoryTitle"/></h1>
<div class="list-group" style="text-align: center; margin: auto; width: 1500px">
    <c:forEach var="category" items="${categories}">
            <a class="list-group-item list-group-item-action flex-column align-items-start" href="<spring:url value="/item/${category.getCategory().getIdentifier()}"/>">
                <div>
                    <img alt="${category.getName()}"
                         src="<spring:url value="/image/${category.getCategory().getImageName()}"/>" height="100" width="100" style="border-right: 50px"/>
                    <h5 class="mb-1">${category.getName()}</h5>
                    <p class="mb-1">${category.getCategory().getDescription()}</p>
                </div>
            </a>
    </c:forEach>
</div>
</body>
</html>
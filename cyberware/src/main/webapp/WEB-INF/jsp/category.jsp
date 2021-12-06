<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/category.css"/>" rel="Stylesheet">
    <title><spring:message code="categoryTitle"/></title>
</head>
<body>
<h1><spring:message code="categoryTitle"/></h1>
<p><spring:message code="categoryLabel"/></p>
<div class="container mt-5">
    <div class="row">
        <c:forEach var="category" items="${categories}">
            <a class="col-md-4" href="<spring:url value="/itemList/${category.getCategory().getIdentifier()}"/>">
                <div class="card p-3">
                    <div class="d-flex flex-row mb-3">
                        <img class="imgImage" alt="${category.getName()}" src="<spring:url value="/image/${category.getCategory().getImageName()}"/>"/>
                        <div class="d-flex flex-column ml-2">
                            <h4>${category.getName()}</h4>
                            <span>${category.getCategory().getDescription()}</span>
                        </div>
                    </div>
                </div>
            </a>
        </c:forEach>
    </div>
</div>
</body>
</html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/itemList.css"/>" rel="Stylesheet">
    <title><spring:message code="itemTitle"/></title>
</head>
<body>
<h1>
    <c:if test="${category == null}">
        <spring:message code="itemTitle"/>
    </c:if>
    <c:if test="${category != null}">
        ${category}
    </c:if>
</h1>
<p>
    <c:if test="${category == null}">
        <spring:message code="itemLabel"/>
    </c:if>
    <c:if test="${category != null}">
        <spring:message code="specificCategoryItemLabel"/>
    </c:if>
</p>


<div class="container mt-5">
    <div class="row">
        <c:forEach var="item" items="${items}">
            <a class="col-md-4" href="<spring:url value="/item/${item.getIdentifier()}"/>">
                <div class="card p-5">
                    <div class="d-flex flex-row mb-3">
                        <img class="imgImage" alt="${item.getName()}" src="<spring:url value="/image/${item.getImageName()}"/>"/>
                        <div class="d-flex flex-column ml-2">
                            <h4>${item.getName()}</h4>
                        </div>
                    </div>
                </div>
            </a>
        </c:forEach>
    </div>
</div>

</body>
</html>
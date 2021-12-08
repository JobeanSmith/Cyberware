<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/catalog.css"/>" rel="Stylesheet">
    <title><spring:message code="itemsTitle"/></title>
</head>
<body>
<h1>
    <c:if test="${category == null}">
        <spring:message code="itemsTitle"/>
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
<div class="container">
    <div class="rowCatalog row">
        <c:forEach var="item" items="${items}">
            <a class="aCatalog col-md-2" href="<spring:url value="/item/${item.getIdentifier()}"/>">
                <div class="cardCatalog card shadow">
                    <img class="imgCatalog card-img-top" alt="${item.getName()}" src="<spring:url value="/image/${item.getImageName()}"/>"/>
                    <div class="divCatalog <c:if test="${category != null}">divAllCatalog</c:if> card-body text-center">
                        <h6>${item.getName()}</h6>
                        <c:if test="${category == null}">
                            <div class="card-text text-black-50">
                                <c:forEach var="categoryTranslation" items="${categoryTranslations}">
                                    <c:if test="${categoryTranslation.getCategory().getIdentifier() == item.getCategory().getIdentifier()}">
                                        ${categoryTranslation.getName()}
                                    </c:if>
                                </c:forEach>
                            </div>
                        </c:if>
                    </div>
                </div>
            </a>
        </c:forEach>
    </div>
</div>
</body>
</html>
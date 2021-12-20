<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/catalog.css"/>" rel="Stylesheet">
    <title><spring:message code="itemsTitle"/></title>
    <c:if test="${category != null}"><c:set var = "size" value="withCategory"/></c:if>
    <c:if test="${category == null}"><c:set var = "size" value="withoutCategory"/></c:if>
</head>
<body>
<h1>
    <c:if test="${category == null}"><spring:message code="itemsTitle"/></c:if>
    <c:if test="${category != null}">${category}</c:if>
</h1>
<p>
    <c:if test="${category == null}"><spring:message code="itemLabel"/></c:if>
    <c:if test="${category != null}"><spring:message code="specificCategoryItemLabel"/></c:if>
</p>
<div class="container">
    <div class="rowCatalog row">
        <c:forEach var="item" items="${items}">
            <form:form cssClass="${size} formCatalog col-md-2" id="form" method="POST" action="/cyberware/catalog/send" modelAttribute="selectedItem">
                <form:hidden path="identifier" value="${item.identifier}"/>
                <form:button class="buttonCatalog ${size}">
                    <img class="imgCatalog card-img-top" alt="${item.name}" src="<spring:url value="/image/item/${item.imageName}"/>"/>
                    <div class="divCatalog <c:if test="${category != null}">divAllCatalog</c:if> card-body text-center">
                        <h6>${item.name}</h6>
                        <c:if test="${category == null}">
                            <div class="card-text text-black-50">
                                <c:forEach var="categoryTranslation" items="${categoryTranslations}">
                                    <c:if test="${categoryTranslation.category.identifier == item.category.identifier}">
                                        ${categoryTranslation.name}
                                    </c:if>
                                </c:forEach>
                            </div>
                        </c:if>
                    </div>
                </form:button>
            </form:form>
        </c:forEach>
    </div>
</div>
</body>
</html>
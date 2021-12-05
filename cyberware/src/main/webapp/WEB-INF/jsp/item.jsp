<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/item.css"/>" rel="Stylesheet">
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
<form:form id="form" method="POST" action="/cyberware/item/send" modelAttribute="cart">
<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th scope="col">
            <spring:message code="imageTitle"/>
        </th>
        <th scope="col">
            <spring:message code="nameTitle"/>
        </th>
        <th scope="col">
            <spring:message code="descriptionTitle"/>
        </th>
        <c:if test="${category == null}">
            <th scope="col">
                <spring:message code="categoryTitle"/>
            </th>
        </c:if>
        <th scope="col">
            <spring:message code="priceTitle"/>
        </th>
        <th scope="col">
            <spring:message code="quantityTitle"/>
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${items}">
        <tr>
            <td class="tdImage">
                <img class="imgImage" alt="${item.getName()}" src="<spring:url value="/image/${item.getImageName()}"/>"/>
            </td>
            <td class="tdName">
                <label class="labelName" for="${item.getIdentifier()}">
                        ${item.getName()}
                </label>
            </td>
            <td class="tdDescription">
                    ${item.getDescription()}
            </td>
            <c:if test="${category == null}">
                <td>
                    <c:forEach var="categoryTranslation" items="${categoryTranslations}">
                        <c:if test="${categoryTranslation.getCategory().getIdentifier() == item.getCategory().getIdentifier()}">
                            ${categoryTranslation.getName()}
                        </c:if>
                    </c:forEach>
                </td>
            </c:if>
            <td class="tdPrice">
                <div class="divPrice">
                        ${item.getPrice().intValue()} $
                </div>
            </td>
            <td class="tdQuantity">
                <input class="inputQuantity" type="number" id="${item.getIdentifier()}" min="0" max="100" step="1" value="0">
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="divButton">
    <form:button class="btn btn-lg btn-primary btn-block">
        <spring:message code="updateCartTitle"/>
    </form:button>
</div>
</form:form>
</body>
</html>
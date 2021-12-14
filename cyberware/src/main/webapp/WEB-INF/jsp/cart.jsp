<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/cart.css"/>" rel="Stylesheet">
    <title><spring:message code="cartTitle"/></title>
</head>
<body>
<h1><spring:message code="cartTitle"/></h1>
<p><spring:message code="cartLabel"/></p>
<c:if test="${cart.getAllPurchaseLines().isEmpty()}">
    <p><spring:message code="emptyCartLabel"/>... 🤷‍♂️</p>
</c:if>
<c:if test="${!(cart.getAllPurchaseLines().isEmpty())}">
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
            <th scope="col">
                <spring:message code="priceTitle"/>
            </th>
            <th scope="col">
                <spring:message code="quantityTitle"/>
            </th>
            <th scope="col">
                <spring:message code="totalTitle"/>
            </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="purchaseLine" items="${cart.getAllPurchaseLines()}">
            <tr>
                <td class="tdImage">
                    <img alt="${purchaseLine.getItem().getName()}" src="<spring:url value="/image/item/${purchaseLine.getItem().getImageName()}"/>"/>
                </td>
                <td class="tdName">
                        ${purchaseLine.getItem().getName()}
                </td>
                <td class="tdDescription">
                        ${purchaseLine.getItem().getDescription()}
                </td>
                <td class="tdPrice">
                    <div class="divPrice">
                            ${purchaseLine.getItemPrice().intValue()} $
                    </div>
                </td>
                <td class="tdQuantity">
                        ${purchaseLine.getRequestedQuantity()}
                </td>
                <td class="tdPrice">
                    <div class="divPrice">
                            ${purchaseLine.getRequestedQuantity() * purchaseLine.getItemPrice().intValue()} $
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="divButton">
        <button class="btn btn-lg btn-primary btn-block"><spring:message code="confirmTitle"/></button>
    </div>
</c:if>
</body>
</html>
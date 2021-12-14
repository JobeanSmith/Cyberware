<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/item.css"/>" rel="Stylesheet">
    <title><spring:message code="${item.getName()}"/></title>
</head>
<body>
<div class="card px-3 row"
     style="width: 60%; height: 60%; margin-left: auto; margin-right: auto; background-color: #FFFF00; color: black; margin-top: 50px;">
    <div class="col-md-6" style="height: 100%; padding: 40px 40px 40px 24px">
        <img class="imgItem" alt="${item.getName()}" src="<spring:url value="/image/item/${item.getImageName()}"/>"
             style="width: 100%; height: 100%; border: solid 1px rgba(0, 0, 0, 0.125); background-color: black; border-radius: 4px"/>
    </div>
    <div class="col-md-6" style="margin-top: 100px">
        <form:form id="form" method="POST" action="/cyberware/item/${item.getIdentifier()}/addToCart" modelAttribute="itemForm">
            <h5>${category}</h5>
            <h1>${item.getName()}</h1>
            <h6>${item.getDescription()}</h6>
            <br>
            <br>
            <h5>${item.getPrice().intValue()} $</h5>
            <br>
            <form:label path="quantity">
                <spring:message code="quantityTitle"/> :
            </form:label>
            <form:input path="quantity" cssStyle="width: 100px"/>
            <form:errors path="quantity"/>
            <br>
            <br>
            <form:button class="btn btn-lg btn-primary btn-block"><spring:message code="addToCartTitle"/></form:button>
        </form:form>
    </div>
</div>
</body>
</html>
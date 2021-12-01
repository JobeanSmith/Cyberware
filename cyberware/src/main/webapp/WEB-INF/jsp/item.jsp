<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <title><spring:message code = "itemTitle"/></title>
</head>
<body>
<h1 style="text-align: center; padding: 20px"><spring:message code = "itemTitle"/></h1>
<ul class="list-group" style="align-items: center">
    <div>
        <li class="list-group-item d-flex justify-content-between align-items-center" style="width: 1500px">
            <div style="padding-left: 180px"><spring:message code = "nameTitle"/></div>
            <div style="padding-left: -50px; padding-right: 20px"><spring:message code = "descriptionTitle"/></div>
            <div style="padding-left: 20px; padding-right: 20px"><spring:message code = "priceTitle"/></div>
        </li>
        <c:forEach var="item" items="${items}">
        <li class="list-group-item d-flex justify-content-between align-items-center" style="width: 1500px">
            <img alt="${item.getName()}" src="<spring:url value="/image/${item.getImageName()}"/>" height="100" width="100" style="border-right: 50px"/>
            <div style="padding-left: 20px; padding-right: 20px; width: 400px">${item.getName()}</div>
            <div style="padding-left: 20px; padding-right: 20px; width: 400px">${item.getDescription()}</div>
            <div style="padding-left: 20px; padding-right: 20px; width: 400px; text-align: right">${item.getPrice().intValue()} $</div>
        </li>
    </c:forEach>
    </div>
</ul>
</body>
</html>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/login.css"/>" rel="Stylesheet">
    <title><spring:message code="loginTitle"/></title>
</head>
<body>
<h1><spring:message code="loginTitle"/></h1>
<p><spring:message code="loginLabel"/></p>
    <form:form class="form" id="form" method="POST" modelAttribute="customer">
        <div class="bigDivInput">
            <div class="littleDivInput">
                <form:label path="username">
                    <spring:message code="customerFormUsernameLabel"/>
                </form:label>
                <form:errors path="username"> : <form:errors path="username" cssStyle="color: red"/></form:errors>
                <br>
                <form:input class="realInput" path="username" type="email"/>
            </div>
        </div>
        <div class="bigDivInput">
            <div class="littleDivInput">
                <form:label path="password">
                    <spring:message code="customerFormPasswordLabel"/>
                </form:label>
                <form:errors path="password"> : <form:errors path="password" cssStyle="color: red"/></form:errors>
                <br>
                <form:password class="realInput" path="password"/>
            </div>
        </div>
        <div class="divButton">
            <form:button class="btn btn-lg btn-primary btn-block"><spring:message code="loginTitle"/></form:button>
        </div>
    </form:form>
</body>
</html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/signin.css"/>" rel="Stylesheet">
    <title><spring:message code="signinTitle"/></title>
</head>
<body>
<h1><spring:message code="signinTitle"/></h1>
<p><spring:message code="signinLabel"/></p>
<div class="list-group">
    <form:form id="form" method="POST" action="/cyberware/signin/send" modelAttribute="customer">
    <div class="bigDivInput">
        <div class="littleDivInput">
            <form:label path="firstName">
                <spring:message code="customerFormFirstNameLabel"/>
            </form:label>
            <form:errors path="firstName">
                <br>
                ⚠️ <form:errors path="firstName"/>
            </form:errors>
            <br>
            <form:input class="realInput" path="firstName"/>
        </div>
        <div class="littleDivInput">
            <form:label path="lastName">
                <spring:message code="customerFormLastNameLabel"/>
            </form:label>
            <form:errors path="lastName">
                <br>
                ⚠️ <form:errors path="lastName"/>
            </form:errors>
            <br>
            <form:input class="realInput" path="lastName"/>
        </div>
    </div>
    <div class="bigDivInput">
        <div class="littleDivInput">
            <form:label path="username">
                <spring:message code="customerFormUsernameLabel"/>
            </form:label>
            <form:errors path="username">
                <br>
                ⚠️ <form:errors path="username"/>
            </form:errors>
            <br>
            <form:input class="realInput" path="username" type="email"/>
        </div>
        <div class="littleDivInput">
            <form:errors path="username">
                <br>
            </form:errors>
            <form:label path="phoneNumber">
                <spring:message code="customerFormPhoneNumberLabel"/>
            </form:label>
            <br>
            <form:input class="realInput" path="phoneNumber" pattern="[0-9]"/>
        </div>
    </div>
    <div class="bigDivInput">
        <div class="largeDivInput">
            <form:label path="address">
                <spring:message code="customerFormAddressLabel"/>
            </form:label>
            <form:errors path="address">
                <br>
                ⚠️ <form:errors path="address"/>
            </form:errors>
            <br>
            <form:input class="realLargeInput" path="address"/>
        </div>
    </div>
    <div class="bigDivInput">
        <div class="largeDivInput">
            <form:label path="password">
                <spring:message code="customerFormPasswordLabel"/>
            </form:label>
            <form:errors path="password">
                <br>
                ⚠️ <form:errors path="password"/>
            </form:errors>
            <br>
            <form:password class="realLargeInput" path="password"/>
        </div>
    </div>
</div>
<div class="divButton">
    <form:button class="btn btn-lg btn-primary btn-block"><spring:message code="signinTitle"/></form:button>
</div>
</form:form>
</body>
</html>

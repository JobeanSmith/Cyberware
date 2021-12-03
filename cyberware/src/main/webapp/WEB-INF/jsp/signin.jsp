<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value='/css/signin.css' />" rel="Stylesheet">
    <title><spring:message code="signinTitle"/></title>
</head>
<body>
<h1><spring:message code="signinTitle"/></h1>
<p><spring:message code="signinLabel"/></p>
<div class="list-group">
    <form:form id="form" method="POST" action="/cyberware/signin/send" modelAttribute="customer">
            <div class="bigDivInput">
                <div class="littleDivInput">
                    <form:label path="firstName"><spring:message code="customerFormFirstNameLabel"/></form:label>
                    <br>
                    <form:input class="realInput" path="firstName"/>
                    <form:errors path="firstName">firstName</form:errors>
                </div>
                <div class="littleDivInput">
                    <form:label path="lastName"><spring:message code="customerFormLastNameLabel"/></form:label>
                    <br>
                    <form:input class="realInput" path="lastName"/>
                    <form:errors path="lastName">lastName</form:errors>
                </div>
            </div>
            <div class="bigDivInput">
                <div class="littleDivInput">
                    <form:label path="username"><spring:message code="customerFormUsernameLabel"/></form:label>
                    <br>
                    <form:input class="realInput" path="username" type="email"/>
                    <form:errors path="username">username</form:errors>
                </div>
                <div class="littleDivInput">
                    <form:label path="phoneNumber"><spring:message code="customerFormPhoneNumberLabel"/></form:label>
                    <br>
                    <form:input class="realInput" path="phoneNumber" type="tel" pattern="[0-9]{10}"/>
                    <form:errors path="phoneNumber">phoneNumber</form:errors>
                </div>
            </div>
            <div class="bigDivInput">
                <div class="largeDivInput">
                    <form:label path="address"><spring:message code="customerFormAddressLabel"/></form:label>
                    <br>
                    <form:input class="realLargeInput" path="address"/>
                    <form:errors path="address">address</form:errors>
                </div>
            </div>
            <div class="bigDivInput">
                <div class="largeDivInput">
                    <form:label path="password"><spring:message code="customerFormPasswordLabel"/></form:label>
                    <br>
                    <form:password class="realLargeInput" path="password"/>
                    <form:errors path="password">password</form:errors>
                </div>
            </div>
        </div>
        <div class="divButton">
            <form:button class="btn btn-lg btn-primary btn-block"><spring:message code="signinTitle"/></form:button>
        </div>
    </form:form>
</body>
</html>

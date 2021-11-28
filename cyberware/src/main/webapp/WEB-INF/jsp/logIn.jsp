<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <title><spring:message code = "loginTitle"/></title>
</head>
<body>
<p><spring:message code = "loginLabel"/></p>
<form:form id="form" method="POST" modelAttribute="customer">
    <form:label path="username"><spring:message code = "customerFormUsernameLabel"/></form:label>
    <form:input path="username"/>
    <br>
    <form:label path="password"><spring:message code = "customerFormPasswordLabel"/></form:label>
    <form:password path="password"/>
    <br>
    <form:button><spring:message code = "loginTitle"/></form:button>
</form:form>
</body>
</html>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
  <title><spring:message code = "signinTitle"/></title>
</head>
<body>
<p><spring:message code = "signinLabel"/></p>
<form:form id="form" method="POST" action="/cyberware/signin/send"  modelAttribute="customer">
  <form:label path="firstName"><spring:message code = "customerFormFirstNameLabel"/></form:label>
  <form:input path="firstName"/>
  <form:errors path="firstName">firstName</form:errors>
  <br>
  <form:label path="lastName"><spring:message code = "customerFormLastNameLabel"/></form:label>
  <form:input path="lastName"/>
  <form:errors path="lastName">lastName</form:errors>
  <br>
  <form:label path="username"><spring:message code = "customerFormUsernameLabel"/></form:label>
  <form:input path="username" type="email"/>
  <form:errors path="username">username</form:errors>
  <br>
  <form:label path="phoneNumber"><spring:message code = "customerFormPhoneNumberLabel"/></form:label>
  <form:input path="phoneNumber"/>
  <form:errors path="phoneNumber">phoneNumber</form:errors>
  <br>
  <form:label path="address"><spring:message code = "customerFormAddressLabel"/></form:label>
  <form:input path="address"/>
  <form:errors path="address">address</form:errors>
  <br>
  <form:label path="password"><spring:message code = "customerFormPasswordLabel"/></form:label>
  <form:password path="password"/>
  <form:errors path="password">password</form:errors>
  <br>
  <form:button><spring:message code = "signinTitle"/></form:button>
</form:form>
</body>
</html>

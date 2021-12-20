<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <link type="text/css" href="<spring:url value="/css/payment.css"/>" rel="Stylesheet">
    <title><spring:message code="paymentTitle"/></title>
    <c:set var = "index" value="1"/>
</head>
<body>
<h1><spring:message code="paymentTitle"/></h1>
<p><spring:message code="paymentLabel"/></p>
<form action="https://www.paypal.com/cgi-bin/webscr" method="post">
    <input type="hidden" name="charset" value="utf-8">
    <input type="hidden" name="cmd" value="_cart">
    <input type="hidden" name="upload" value="1">
    <input type="hidden" name="business" value="sb-ulhbx8591819@business.example.com">
    <input type="hidden" name="cert_id" value="AZDiV9-894hIKy9QQo328EVdPHf93wNtwDmGTJy79pR3hEKjQB1ShdTeB0C-JxNj4pGbrcOFtzAGAuQf">
    <c:forEach var="purchaseLine" items="${cart.getCart().values()}">
        <input type="hidden" name="item_name_${index}" value="${purchaseLine.getItem().getName()}">
        <input type="hidden" name="quantity_${index}" value="${purchaseLine.getRequestedQuantity()}">
        <input type="hidden" name="amount_${index}" value="${purchaseLine.getItemPrice()}">
        <c:set var = "index" value="${index + 1}"/>
    </c:forEach>
    <input type="hidden" name="currency_code" value="USD">
    <input type="hidden" name="return" value="paymentResult/successfulPayment.jsp">
    <input type="hidden" name="cancel_return" value="paymentResult/cancelledPayment.jsp">
    <input type="image" src="https://www.paypal.com/en_US/i/btn/x-click-but01.gif" name="submit" alt="Make payments with PayPal - it's fast, free and secure!">
</form>
</body>
</html>
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
    <input type="hidden" name="cmd" value="_xclick">
    <input type="hidden" name="business" value="business.example@business.example.com">
    <input type="hidden" name="cert_id" value="AYuqKeM_hdtn2MOQquMow5_qygpZFGvhw2cCtyBmcCbRIWVOUmwk2X00ZUQm2pz-sufaJ0Da2c15DX_J">
    <input type="hidden" name="item_name" value="Cyberware">
    <input type="hidden" name="amount" value="${sessionCart.getFinalTotalPrice()}">
    <input type="hidden" name="currency_code" value="USD">
    <input type="hidden" name="return" value="http://localhost:8082/cyberware/payment/successful">
    <input type="hidden" name="cancel_return" value="http://localhost:8082/cyberware/payment/cancelled">
    <input type="image" src="https://www.paypal.com/en_US/i/btn/x-click-but01.gif" name="submit" alt="Make payments with PayPal - it's fast, free and secure!">
</form>
</body>
</html>
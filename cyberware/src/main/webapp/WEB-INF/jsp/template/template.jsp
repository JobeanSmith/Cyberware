<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="../include/importTags.jsp" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
    <link type="text/css" href="<spring:url value='/css/template/template.css' />" rel="Stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous">
    </script>
    <spring:url var="localeFr" value="">
        <spring:param name="locale" value="fr"/>
    </spring:url>
    <spring:url var="localeEn" value="">
        <spring:param name="locale" value="en"/>
    </spring:url>
    <title>Cyberware</title>
</head>
<body>
<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <!-- Cyberware -->
            <a class="navbar-brand">
                <img alt="Cyber" src="<spring:url value="/image/cyber.png"/>" height="50" width="100"/>
                ware
            </a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <!-- Home -->
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="<spring:url value="/"/>">
                            <spring:message code="homeTitle"/>
                        </a>
                    </li>
                    <!-- Account -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" id="accountDropdown" role="button"
                           data-bs-toggle="dropdown" aria-expanded="false">
                            <spring:message code="accountTitle"/>
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="accountDropdown">
                            <sec:authorize access="!isAuthenticated()">
                                <!-- Log In -->
                                <li>
                                    <a class="dropdown-item" href="<spring:url value="/login"/>">
                                        <spring:message code="loginTitle"/>
                                    </a>
                                </li>
                                <!-- Sign In -->
                                <li>
                                    <a class="dropdown-item" href="<spring:url value="/signin"/>">
                                        <spring:message code="signinTitle"/>
                                    </a>
                                </li>
                            </sec:authorize>
                            <sec:authorize access="isAuthenticated()">
                                <!-- Log Out -->
                                <li>
                                    <a class="dropdown-item" href="<spring:url value="/logout"/>">
                                        <spring:message code="logoutTitle"/>
                                    </a>
                                </li>
                            </sec:authorize>
                        </ul>
                    </li>
                    <!-- Category -->
                    <li class="nav-item">
                        <a class="nav-link" href="<spring:url value="/category"/>">
                            <spring:message code="categoryTitle"/>
                        </a>
                    </li>
                    <!-- Item -->
                    <li class="nav-item">
                        <a class="nav-link" href="<spring:url value="/item"/>">
                            <spring:message code="itemTitle"/>
                        </a>
                    </li>
                    <!-- Language -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" id="languageDropdown" role="button"
                           data-bs-toggle="dropdown" aria-expanded="false">
                            <spring:message code="languageTitle"/>
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="languageDropdown">
                            <!-- English -->
                            <li>
                                <a class="dropdown-item" href="${localeEn}">
                                    <img alt="English" src='<spring:url value="/image/english.png"/>' height="40"
                                         width="50" style="padding-right: 10px"/>
                                    <spring:message code="englishTitle"/>
                                </a>
                            </li>
                            <!-- French -->
                            <li>
                                <a class="dropdown-item" href="${localeFr}">
                                    <img alt="French" src='<spring:url value="/image/french.png"/>' height="40"
                                         width="50" style="padding-right: 10px"/>
                                    <spring:message code="frenchTitle"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <sec:authorize access="isAuthenticated()">
                        <!-- Cart -->
                        <li class="nav-item">
                            <a class="nav-link" href="<spring:url value="/cart"/>">
                                <spring:message code="cartTitle"/>
                            </a>
                        </li>
                    </sec:authorize>

                </ul>
            </div>
        </div>
    </nav>
</div>
<div>
    <tiles:insertAttribute name="main-content"/>
</div>
<div>
    <footer class="text-center text-lg-start bg-light text-muted">
        <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
            Hénallux - Pauline Loréa & Jonathan Smith
        </div>
    </footer>
</div>
</body>
</html>
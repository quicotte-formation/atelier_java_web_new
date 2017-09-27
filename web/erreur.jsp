<%-- 
    Document   : films
    Created on : 25 sept. 2017, 12:29:39
    Author     : IB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>***TITRE PAGE***</title>
    </head>
    <body>

        <c:import url="_HEADER.jsp"></c:import>
        <c:import url="_MENU.jsp"></c:import>
        <div>
            <h1>
                Erreur
            </h1>
            <div>
                ${messageErreur}
            </div>
        </div>
    </body>
</html>
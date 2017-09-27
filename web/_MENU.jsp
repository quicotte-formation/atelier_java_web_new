<%-- 
    Document   : _MENU
    Created on : 25 sept. 2017, 15:33:54
    Author     : IB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
    <a href="lister_films">Films</a>
    <a href="series.jsp">Séries</a>
    <a href="preference?theme=jamaique">Theme Jamaïque</a>
    <a href="preference?theme=australie">Theme Australie</a>
    <c:choose>
        <c:when test="${ utilConnecte!=null }">
            Bienvenue: ${utilConnecte}
            <a href="lougout">Logout</a>
        </c:when>
        <c:otherwise>
            <a href="login.jsp">Login</a>
        </c:otherwise>
    </c:choose>
</div>
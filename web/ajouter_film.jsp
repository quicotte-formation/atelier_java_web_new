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
        <title>Nouveau film</title>
    </head>
    <body>

        <c:import url="_HEADER.jsp"></c:import>
        <c:import url="_MENU.jsp"></c:import>
        <div>
            <h1>
                Nouveau film
            </h1>
            <div>
                <form method="POST" action="add_film">
                    <label>Titre</label>
                    <input placeholder="Titre ici" type="text" name="titre"/>
                    <br>
                    <label>Durée</label>
                    <input type="number" name="duree" min="1" max="500" value="90"/>
                    <br>
                    <label>Année prod.</label>
                    <input type="number" min="1990" max="2050" placeholder="Année prod." name="anneeProd" />
                    <br>
                    <input type="submit" value="Enregistrer"/>
                </form>
            </div>
        </div>
    </body>
</html>

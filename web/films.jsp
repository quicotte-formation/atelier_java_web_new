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
        <title>Liste des films</title>
    </head>
    <body>

        <c:import url="_HEADER.jsp"></c:import>
        <c:import url="_MENU.jsp"></c:import>
        <div>
            <h1>
                Liste des films
            </h1>
            <div>
                <a href="ajouter_film.jsp">
                    <button>
                        Ajouter
                    </button>
                </a>
                <table>    
                    <thead>
                        <th>TITRE</th>
                        <th>DUREE</th>
                        <th>ANNEE DE PRODUCTION</th>
                        <th>ACTION</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${listeDeFilms}" var="filmActuel">
                            <tr>
                                <td>${filmActuel.titre}</td>
                                <td>${filmActuel.duree}</td>
                                <td>${filmActuel.anneeProd}</td>
                                <td>
                                    <a href="supprimer_film?filmId=${filmActuel.id}">
                                        <button>Suppression</button>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>

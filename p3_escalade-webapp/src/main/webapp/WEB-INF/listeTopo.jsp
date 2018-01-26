<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 24/01/2018
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Liste des topos repertoriés</title>
</head>
<body>
<h2>Liste des topos repertoriés </h2>

<div class="list">
    <s:iterator value="topos">
        <p>
            ID Topo : <s:property value = "id"/><br>
            ID Site : <s:property value = "siteId"/><br>
            ID Utilisateur : <s:property value = "utilisateurId"/><br>
            Nom : <s:property value = "nom"/><br>
            Disponibilité : <s:property value = "emprunt"/>
        </p>
    </s:iterator>
</div>
</body>
</html>

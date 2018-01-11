<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 31/12/2017
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Liste des voies repertoriées</title>
</head>
<body>
<h2>Liste des voies repertoriées </h2>

<div class="list">
    <s:iterator value="listeVoies">
        <p>
            ID Voie : <s:property value = "voie_id"/><br>
            ID secteur : <s:property value = "secteur_id"/><br>
            Nom : <s:property value = "nom"/><br>
            Etat : <s:property value = "etat"/>
        </p>
    </s:iterator>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 01/01/2018
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Liste des longueurs repertoriées</title>
</head>
<body>
<h2>Liste des longueurs repertoriées </h2>

<div class="list">
    <s:iterator value="listeLongueurs">
        <p>
            ID Longueur : <s:property value = "longueur_id"/><br>
            ID Voie : <s:property value = "voie_id"/><br>
            Nom : <s:property value = "nom"/><br>
            Cotation : <s:property value = "cotation"/>
        </p>
    </s:iterator>
</div>
</body>
</html>

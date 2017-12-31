<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 26/12/2017
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Liste des sites repertoriés</title>
</head>
<body>
<h2>Liste des secteurs repertoriés </h2>

<div class="list">
    <s:iterator value="secteurs">
        <p>
            ID Secteur : <s:property value = "secteur_id"/><br>
            ID Site : <s:property value = "site_id"/><br>
            Nom : <s:property value = "nom"/>
        </p>
    </s:iterator>
</div>
</body>
</html>

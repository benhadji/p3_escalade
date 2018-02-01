<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 30/01/2018
  Time: 02:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CliffHanger - Liste des emprunts</title>
</head>
<body>
<h2>Liste des emprunts de topo </h2>

<div class="list">
    <table>
        <thead>
        <tr>
            <th>Proprietaire topo</th>
            <th>Nom Topo</th>
            <th>Date debut</th>
            <th>Date fin</th>
        </tr>
        </thead>

        <s:iterator value="borrows">
            <tr>
                <td><s:property value = "utilisateur.nom"/></td>
                <td><s:property value = "topo.nom"/></td>
                <td><s:property value = "startDate"/></td>
                <td><s:property value = "endDate"/></td>
            </tr>
        </s:iterator>
</div>



</body>
</html>

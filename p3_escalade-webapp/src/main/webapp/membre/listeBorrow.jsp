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
    <s:iterator value="borrows">
        <p>
            ID Utilisateur : <s:property value = "utilisateur_id"/><br>
            ID Topo : <s:property value = "topo_id"/><br>
            Date debut : <s:property value = "startdate"/>
            Date fin : <s:property value = "enddate"/>
        </p>
    </s:iterator>
</div>



</body>
</html>

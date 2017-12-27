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
<h2>Liste des sites repertoriés </h2>

<div class="list">
    <s:iterator value="sites">
        <li><a href="<s:url action="site"><s:param name="site_id"><s:property value="site_id"/></s:param> </s:url>">
        <s:property value = "site_id"/>. <s:property value = "nom"/></a><br></li>
    </s:iterator>
</div>
</body>
</html>

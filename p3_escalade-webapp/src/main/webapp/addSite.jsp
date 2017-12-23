<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 15/12/2017
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>CliffHanger</title>
</head>
<body>
    <div class="area">
        <div class="area-header">
            <h2>Creation d'un nouveau site, avec ses secteurs, ses voies et longueurs ... !</h2>
            <p>
                <h2><s:property value="site.nom"/> </h2>
            </p>
        </div>
        <div class="area-content">
            <p>Nom: <s:property value="site.localisation"/></p>


        </div>
    </div>


</body>
</html>

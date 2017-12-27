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
        </div>
        <div class="area-content">
            <s:form action="addSite">
                <s:textfield label="Nom du nouveau site " name="site.nom"/>
                <s:textfield label="Localisation su site (ville) " name="site.localisation"/>
                <s:submit value="Valider" action="addSite"/>
                <s:submit value="Annuler" action="home"/>
            </s:form>

        </div>
    </div>


</body>
</html>

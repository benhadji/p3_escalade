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
        <h2>Details de chaque site, avec ses voies, ses longueurs ...</h2>
    </div>
    <div class="area-content">

        <p>
            <s:property value = "site_id"/>. <s:property value = "site.nom"/>,
            localisé à : <s:property value="site.localisation"/>
        </p>


        <p>
            <s:iterator value="site.secteurs">
        <li><s:param name="secteur_id"><s:property value="secteur_id"/> </s:param>
            secteur_id : <s:property value="secteur_id"/>.
            site_id : <s:property value="site_id"/>.
            nom : <s:property value = "nom"/><br></li>
        </s:iterator>
        </p>

        <p>
            <s:iterator value="secteur.voies">
        <li><s:param name="voie_id"><s:property value="voie_id"/> </s:param>
            voie_id : <s:property value="voie_id"/>.
            secteur_id : <s:property value="secteur_id"/>.
            nom : <s:property value = "nom"/>.
            etat : <s:property value="etat"/><br></li>
        </s:iterator>
        </p>

        <p>
            <s:iterator value="voie.longueurs">
        <li><s:param name="longueur_id"><s:property value="longueur_id"/> </s:param>
            longueur_id : <s:property value="longueur_id"/>.
            voie_id : <s:property value="voie_id"/>.
            nom : <s:property value = "nom"/>.
            cotation : <s:property value="cotation"/><br></li>
        </s:iterator>
        </p>




    </div>
</div>

</body>
</html>

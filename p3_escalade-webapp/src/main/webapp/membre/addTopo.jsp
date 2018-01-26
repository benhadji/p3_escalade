<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 24/01/2018
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="area">
    <div class="area-header">
        <h2>Creation d'un nouveau topo !</h2>
    </div>
    <div class="area-content">
        <s:form action="addTopo" method="post">
            <div>
                <label for="topoNom" >Nom du Topo : </label>
                <div>
                    <s:textfield type="text" name="topo.nom" id="topoNom" data-minlength="2"
                           data-error="Le nom du topo doit faire deux caractères au minimum" required="true"/>
                    <s:fielderror fieldName="topo.nom" cssClass="errorMessage"/>
                </div>
            </div>
            <div>
                <label for="topoSiteNom">Nom du site : </label>
                <s:select name="topo.siteId"
                          listValue="nom"
                          listKey="site_id"
                          id="topoSiteNom"
                          list="sitesList">
                </s:select>
            </div>
            <div>
                <label>
                    Autoriser le prêt de ce topo
                    <s:checkbox id="topoBorrowed" name="topo.emprunt" value="false"/>
                </label>
            </div>
            <div align="left">
                <s:submit value="Ajouter Topo" action="addTopo"/>
                <s:submit value="Retour" action="home"/>
            </div>
        </s:form>

    </div>
</div>


</body>
</html>

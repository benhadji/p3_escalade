<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 27/12/2017
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>CliffHanger - Ajouter un secteur</title>
</head>
<body>
<div class="container" >
    <h1>Ajouter un secteur</h1>
    <form action="addSecteur.action" method="post" class="form-horizontal" data-toggle="validator">
        <div class="form-group row">
            <label for="secteurNom" class="col-xs-offset-3 col-xs-2" >Nom Secteur : </label>
            <div class="col-xs-4">
                <input type="text" name="secteur.nom" class="form-control" id="secteurNom" data-minlength="2"
                       data-error="Le nom du secteur doit faire deux caractères au minimum" required/>
                <div class="help-block with-errors"></div>
                <s:fielderror fieldName="secteur.nom" cssClass="errorMessage"/>
            </div>
            <label for="secteurSiteNom" class="col-xs-offset-3 col-xs-2">Nom du site : </label>
            <s:select listValue="nom"
                      listKey="site_id"
                      id="secteurSiteNom"
                      list="listeDesSite"
                      name="secteur.site_id">
            </s:select>
        </div>
        <div class="row" align="left">
            <s:submit value="Ajouter Secteur" action="addSecteur"/>
            <s:submit value="Annuler" action="home"/>
        </div>
    </form>
</div>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 01/01/2018
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>CliffHanger - Ajouter une longueur a une voie</title>
</head>
<body>
<div class="container" >
    <h1>Ajouter une longueur</h1>
    <form action="addLongueur.action" method="post" class="form-horizontal" data-toggle="validator">
        <div class="form-group row">
            <label for="longueurNom" class="col-xs-offset-3 col-xs-2" >Nom Longueur : </label>
            <div class="col-xs-4">
                <input type="text" name="longueur.nom" class="form-control" id="longueurNom" data-minlength="2"
                       data-error="Le nom de la longueur doit faire deux caractères au minimum" required/>
                <div class="help-block with-errors"></div>
                <s:fielderror fieldName="longueur.nom" cssClass="errorMessage"/>
            </div>
            <label for="cotationLongueur" class="col-xs-offset-3 col-xs-2" >Cotation de la longueur : </label>
            <div class="col-xs-4">
                <input type="text" name="longueur.cotation" class="form-control" id="cotationLongueur" required/>
            </div>
            <label for="longueurVoieNom" class="col-xs-offset-3 col-xs-2">Nom de la voie : </label>
            <s:select listValue="nom"
                      listKey="voie_id"
                      id="longueurVoieNom"
                      list="listeDesVoies"
                      name="longueur.voie_id">
            </s:select>
        </div>
        <div class="row" align="left">
            <s:submit value="Ajouter longueur" action="addLongueur"/>
            <s:submit value="Annuler" action="home"/>
        </div>
    </form>
</div>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 31/12/2017
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>CliffHanger - Ajouter une voies a un secteur</title>
</head>
<body>
<div class="container" >
    <h1>Ajouter une voie</h1>
    <form action="addVoie.action" method="post" class="form-horizontal" data-toggle="validator">
        <div class="form-group row">
            <label for="voieNom" class="col-xs-offset-3 col-xs-2" >Nom Voie : </label>
            <div class="col-xs-4">
                <input type="text" name="voie.nom" class="form-control" id="voieNom" data-minlength="2"
                       data-error="Le nom de la voie doit faire deux caractères au minimum" required/>
                <div class="help-block with-errors"></div>
                <s:fielderror fieldName="voie.nom" cssClass="errorMessage"/>
            </div>
            <label for="etatVoie" class="col-xs-offset-3 col-xs-2" >Etat de la voie : </label>
            <div class="col-xs-4">
                <input type="radio" name="voie.etat" class="form-control" id="etatVoie"/>
            </div>
            <label for="voieSecteurNom" class="col-xs-offset-3 col-xs-2">Nom du site : </label>
            <s:select listValue="nom"
                      listKey="secteur_id"
                      id="voieSecteurNom"
                      list="listeDesSecteur"
                      name="voie.secteur_id">
            </s:select>
        </div>
        <div class="row" align="left">
            <s:submit value="Ajouter voie" action="addVoie"/>
            <s:submit value="Annuler" action="home"/>
        </div>
    </form>
</div>


</body>
</html>

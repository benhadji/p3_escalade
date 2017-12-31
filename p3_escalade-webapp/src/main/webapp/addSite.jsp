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
    <title>CliffHanger - Ajout d'un nouveau site </title>
</head>
<body>
    <div class="area">
        <div class="area-header">
            <h2>Creation d'un nouveau site !</h2>
        </div>
        <div class="area-content">
            <s:form action="addSite">
                <div class="form-group row">
                    <label for="siteNom" class="col-xs-offset-3 col-xs-2">Nom du Site : </label>
                    <div class="col-xs-4">
                        <input type="text" name="site.nom" class="form-control" id="siteNom" data-minlength="2"
                               data-error="Le nom du site doit faire deux caractères au minimum" required/>
                        <div class="help-block with-errors"></div>
                        <s:fielderror fieldName="site.nom" cssClass="errorMessage"/>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="siteLocalisation" class="col-xs-offset-3 col-xs-2">Localisation : </label>
                    <div class="col-xs-4">
                        <input type="text" name="site.localisation" class="form-control" id="siteLocalisation" data-minlength="2"
                               data-error="La localisation doit faire deux caractères au minimum" />
                        <div class="help-block with-errors"></div>
                        <s:fielderror fieldName="site.localisation" cssClass="errorMessage"/>
                    </div>
                </div>
                <div class="row">
                    <s:submit value="Ajouter Site" action="addSite"/>
                    <s:submit value="Annuler" action="home"/>
                </div>
            </s:form>

        </div>
    </div>


</body>
</html>

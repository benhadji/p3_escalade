<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>CliffHanger - Devenir membre de la communauté</title>
</head>
<body>
<div class="container">
    <h1>S'inscrire à Cliffhangout</h1>
    <s:form action="signUp">
        <div class="form-group row">
            <label for="nom" class="col-sm-offset-3 col-xs-offset-1 col-sm-2 col-xs-3">Nom</label>
                <input type="text" name="utilisateur.nom" id="nom" class="col-sm-4 form-control" required/>
                <div class="help-block with-errors"></div>
            <div class="row">
                <div class="col-xs-offset-3 col-xs-6">
                    <s:fielderror fieldName="utilisateur.nom" cssClass="errorMessage"/>
                </div>
            </div>

            <label for="prenom" class="col-sm-offset-3 col-xs-offset-1 col-sm-2 col-xs-3">Prenom</label>
                <input type="text" name="utilisateur.prenom" id="prenom" class="col-sm-4 form-control" required/>
                <div class="help-block with-errors"></div>
            <div class="row">
                <div class="col-xs-offset-3 col-xs-6">
                    <s:fielderror fieldName="utilisateur.prenom" cssClass="errorMessage"/>
                </div>
            </div>

            <label for="email" class="col-sm-offset-3 col-xs-offset-1 col-sm-2 col-xs-3">Email</label>
                <input type="email" name="utilisateur.email" id="email" class="col-sm-4 form-control" data-error="Cette adresse email est invalide" required/>
                <div class="help-block with-errors"></div>
            <div class="row">
                <div class="col-xs-offset-3 col-xs-6">
                    <s:fielderror fieldName="utilisateur.email" cssClass="errorMessage"/>
                </div>
            </div>

            <div class="form-group row">
                <label for="pwd" class="col-sm-offset-3 col-xs-offset-1 col-sm-2 col-xs-3">Mot de passe</label>
                <div class="col-sm-4 col-xs-6">
                    <input type="password" name="utilisateur.password" id="pwd" class="form-control" data-minlength="6" data-error="Le mot de passe doit faire au minimum 6 caractères" required/>
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-offset-3 col-xs-6">
                    <s:fielderror fieldName="utilisateur.password" cssClass="errorMessage"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="pwdConfirmation" class="col-sm-offset-3 col-xs-offset-1 col-sm-2 col-xs-3">Répéter mot de passe</label>
                <div class="col-sm-4 col-xs-6">
                    <input type="password" name="passwordConfirmation" id="pwdConfirmation" class="col-sm-4 form-control" data-match="#pwd" data-error="Les deux mots de passes sont différents" required/>
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-offset-3 col-xs-6">
                    <s:fielderror fieldName="passwordConfirmation" cssClass="errorMessage"/>
                </div>
            </div>
            <div class="row">
                <s:submit cssClass="btn btn-info col-xs-offset-5 col-xs-2 submitForm"  value="Valider"/>
            </div>
        </div>
    </s:form>
</div>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 15/12/2017
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CliffHanger</title>
</head>
<body>
    <h1>CliffHanger</h1>
    <p>Le premier site communautaire dédié à l'escalade</p>

    <div class="area">
        <s:property value="#session.sessionUtilisateur.prenom"/>
        <s:if test="%{#session.sessionUtilisateur!=null}">
            ${successmessage}
            <br/>
            Welcome, <s:property value="#session.sessionUtilisateur.prenom"/><br/>
            <a href="<s:url action='logout' />">Se déconnecter</a>
        </s:if>
        <s:else>
            <div>
                Deja membre ? <a href="login.action">Login</a><br>
                Nouvel utilisateur : <a href="signUp.action">Sign in</a>
            </div>
        </s:else>

        <div class="area-content">
            <div class="list">
                <h2>Liste des elements </h2>
                <a href="listeSite.action">Liste site</a><br>
            </div>

            <div class="list-view">
                <h3>Ajouter un nouveau site : </h3>
                <a href="addSite.action">Nouveau site</a>
                <h3>Ajouter nouveau secteur : </h3>
                <a href="addSecteur.action">Nouveau secteur</a>
                <h3>Ajouter nouvelle voie : </h3>
                <a href="addVoie.action">Nouvelle voie</a>
                <h3>Ajouter nouvelle longueur : </h3>
                <a href="addLongueur.action">Nouvelle longueur</a>
            </div>
        </div>
    </div>

</body>
</html>

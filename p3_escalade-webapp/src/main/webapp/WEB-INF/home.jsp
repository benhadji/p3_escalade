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
         <div>
            Deja membre ? <a href="login.action">Login</a><br>
            Nouvel utilisateur : <a href="signUp.action">Sign in</a>
        </div>

        <div class="area-content">
            <div class="list">
                <h4>Liste des site de la region ! </h4>
                <a href="listeSite.action">Liste site</a><br><br>
            </div>
            <div class="search">
                <s:form action="search" namespace="/">
                    <s:textfield name="nom" label="Nom "/>
                    <input type="radio" value="site" name="yourSearchItem" title="Site"/>Site
                    <input type="radio" value="secteur" name="yourSearchItem" title="Secteur"/>Secteur
                    <input type="radio" value="voie" name="yourSearchItem" title="Voie"/>Voie
                    <input type="radio" value="longueur" name="yourSearchItem" title="Longueur"/>Longueur
                    <input type="radio" value="topo" name="yourSearchItem" title="Topo"/>Topo

                    <s:submit value="Rechercher" name="submit"/>
                </s:form>
            </div>
        </div>
    </div>

</body>
</html>

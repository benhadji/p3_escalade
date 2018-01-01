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
    <link rel=stylesheet type="text/css" href="/css/stylesheet.css">
</head>
<body>
    <h1>CliffHanger</h1>
    <p>Le premier site communautaire dédié à l'escalade</p>

    <div class="area">
        <div class="area-content">
            <div class="list">
                <h2>Liste des sites </h2>
                <a href="listeSite.action">Liste site</a>
                <h2>Liste des secteurs </h2>
                <a href="listeSecteur.action">Liste secteurs</a>
                <h2>Liste des voies </h2>
                <a href="listeVoie.action">Liste voies</a>
                <h2>Liste des longueurs </h2>
                <a href="listeLongueur.action">Liste longueurs</a>
            </div>

            <div class="form-group">
                <p>
                    <h3>Ajouter un nouveau site : </h3>
                    <a href="addSite.action">Nouveau site</a>
                </p>
                <p>
                    <h3>Ajouter nouveau secteur : </h3>
                    <a href="addSecteur.action">Nouveau secteur</a>
                </p>
                <p>
                <h3>Ajouter nouvelle voie : </h3>
                <a href="addVoie.action">Nouvelle voie</a>
                </p>
                <p>
                <h3>Ajouter nouvelle longueur : </h3>
                <a href="addLongueur.action">Nouvelle longueur</a>
                </p>


            </div>
        </div>
    </div>

</body>
</html>

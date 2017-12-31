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


            </div>
        </div>
    </div>

</body>
</html>

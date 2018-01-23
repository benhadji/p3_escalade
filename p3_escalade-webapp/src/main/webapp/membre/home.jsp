<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 12/01/2018
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Bienvenue</title>
</head>
<body>
<s:property value="#session.sessionUtilisateur.prenom"/>
<s:if test="%{#session.sessionUtilisateur!=null}">
    ${successmessage}
    <br/>
    Welcome, <s:property value="#session.sessionUtilisateur.prenom"/><br/>
    <a href="<s:url action='logout' />">Se déconnecter</a>
</s:if>

<div class="list-view">
    <h3>Ajouter un nouveau site : </h3>
    <a href="<s:url namespace="/membre" action="addSite"/>">Nouveau site</a>
    <h3>Ajouter nouveau secteur : </h3>
    <a href="<s:url namespace="/membre" action="addSecteur"/>">Nouveau secteur</a>
    <h3>Ajouter nouvelle voie : </h3>
    <a href="<s:url namespace="/membre" action="addVoie"/>">Nouvelle voie</a>
    <h3>Ajouter nouvelle longueur : </h3>
    <a href="<s:url namespace="/membre" action="addLongueur"/>">Nouvelle longueur</a>
</div>

</body>
</html>

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
    <h3>Ajouter nouveau topo : </h3>
    <a href="<s:url namespace="/membre" action="addTopo"/>">Nouveau topo</a>
    <h3>Mes Topos </h3>
    <a href="<s:url namespace="/membre" action="mesTopos"/>">Mes Topos</a>
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

</body>
</html>

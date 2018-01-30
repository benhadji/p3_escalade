<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 29/01/2018
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Editer un topo</title>
</head>
<body>
<s:form action="editTopoForm" namespace="/membre">
    <div>
        <h2>Editer site du topo</h2>
        <s:label for="topoSiteNom">Nom du site : </s:label>
        <s:select name="topo.siteId"
                  listValue="nom"
                  listKey="site_id"
                  id="topoSiteNom"
                  list="sitesList">
        </s:select>

        <s:hidden name="id"><s:property value="#id"/></s:hidden>

        <s:label for="topoNom" >Nom du Topo : </s:label>
        <s:textfield type="text" name="topo.nom" id="topoNom" data-minlength="2"
                     data-error="Le nom du topo doit faire deux caractères au minimum" required="true"/>
        <s:fielderror fieldName="topo.nom" cssClass="errorMessage"/>
    </div>
    <div>
        <s:radio list="yourChoiceList" label="Disponibilité" name="yourChoice" value="topo.emprunt"/>
    </div>
    <div>
        <s:submit value="submit" name="submit" />
    </div>
</s:form>


</body>
</html>

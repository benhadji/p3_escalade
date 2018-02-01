<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 26/01/2018
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Mes topos</title>
</head>
<body>
<h2>Mes topos</h2>

<s:if test="%{mesTopos!=null && mesTopos.size()!=0}">
    <table>
    <thead>
    <tr>
        <th>Nom</th>
        <th>Disponibilité</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
        <s:iterator value="mesTopos">
            <tr>
                <td><s:property value="nom"/></td>
                <s:if test="%{emprunt==true}">
                    <td>Topo indisponible</td>
                </s:if>
                <s:else>
                    <td>Topo disponible pour pret</td>
                </s:else>
                <s:url var="url" action="editTopoForm">
                    <s:param name="id"><s:property value="id"/></s:param>
                </s:url>
                <td><a href="${url}">Editer Topo</a></td>
            </tr>
        </s:iterator>
</s:if>
<s:else>
        <h4>Vous ne possedez aucun topo !</h4>
        <h3>Ajouter nouveau topo :
            <a href="<s:url namespace="/membre" action="addTopo"/>">Nouveau topo</a></h3>
</s:else>
    </tbody>
</table>
</body>
</html>

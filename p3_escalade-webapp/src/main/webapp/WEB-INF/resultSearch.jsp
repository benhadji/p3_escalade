<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 14/01/2018
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Rechercher un spot pour grimper !!</title>
</head>
<body>

<s:if test='%{result != "" && result!=null}'>

    <p>${ result }</p>
    <s:if test="%{sites!=null && sites.size()!=0}">
        <table>
            <thead>
            <tr>
                <th>Nom</th>
                <th>Localisation</th>
                <th>Nombre de secteurs</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="sites">
                <tr>
                    <s:url var="siteUrl" action="site">
                        <s:param name="site_id"><s:property value="site_id"/></s:param>
                    </s:url>
                    <td><a href="${siteUrl}"><s:property value="nom"/></a></td>
                    <td><s:property value="localisation"/></td>
                    <td><s:property value="secteurs.size()"/> </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </s:if>


    <s:if test="%{secteurs!=null && secteurs.size()!=0}">
        <table>
            <thead>
            <tr>
                <th>Nom du Secteur</th>
                <th>Nom du Site correspondant</th>
                <th>Nombre de voies</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="secteurs">
                <tr>
                    <td><s:property value="nom"/></td>
                    <td><s:property value="site.nom"/></td>
                    <td><s:property value="voies.size()"/> </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </s:if>

    <s:if test="%{voies!=null && voies.size()!=0}">
        <table>
            <thead>
            <tr>
                <th>Nom de la Voie</th>
                <th>Nom du secteur correpondant</th>
                <th>Voie equipé</th>
                <th>Nombre de longueur</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="voies">
                <tr>
                    <td><s:property value="nom"/></td>
                    <td><s:property value="secteur.nom"/></td>
                    <td><s:property value="etat" /></td>
                    <td><s:property value="longueurs.size()"/> </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </s:if>

    <s:if test="%{longueurs!=null && longueurs.size()!=0}">
        <table>
            <thead>
            <tr>
                <th>Nom de la longueur</th>
                <th>Nom de la voie correpondante</th>
                <th>Cotation</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="longueurs">
                <tr>
                    <td><s:property value="nom"/></td>
                    <td><s:property value="voie.nom"/></td>
                    <td><s:property value="cotation" /></td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </s:if>

</s:if>



</body>
</html>

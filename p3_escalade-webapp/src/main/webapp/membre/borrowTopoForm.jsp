<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 30/01/2018
  Time: 01:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Formulaire de pret de Topo</title>
    <style type="text/css">
        .welcome {
            background-color:#DDFFDD;
            border:1px solid #009900;
            width:200px;
        }
        .welcome li{
            list-style: none;
        }
    </style>
</head>
<body>
<div class="container">
    <h1><s:property value="topo.nom"/></h1>
    <h2>Sites du topo</h2>
    <ul>
        <s:iterator value="sites">
            <li><s:property value="nom"/></li>
        </s:iterator>
    </ul>

    <s:form action="borrowTopo" method="post">
        <div>
            <s:hidden name="idTopo"><s:property value="#id"/></s:hidden>
            <label for="startDate">Date de début d'emprunt</label>
            <div>
                <input type="date" name="startdate" id="startdate" required/>
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div>
            <s:fielderror fieldName="startdate" cssClass="errorMessage"/>
        </div>
        <div>
            <label for="endDate">Date de fin d'emprunt</label>
            <div>
                <input type="date" name="enddate" id="enddate" required/>
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div>
            <s:fielderror fieldName="enddate" cssClass="errorMessage"/>
        </div>
        <div>
            <s:submit value="Valider"/>
        </div>
    </s:form>

    <s:if test="hasActionMessages()">
    <div class="welcome">
        <s:actionmessage/>
    </div>
    </s:if>

</body>
</html>

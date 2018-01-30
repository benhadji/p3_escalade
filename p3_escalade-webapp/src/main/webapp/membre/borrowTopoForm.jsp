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
</head>
<body>
<div class="container">
    <h1><s:property value="topo.name"/></h1>
    <h2>Sites du topo</h2>
    <ul>
        <s:iterator value="topo.sites">
            <li><s:property value="nom"/></li>
        </s:iterator>
    </ul>

    <s:form>
        <div>
            <label for="startDate">Date de début d'emprunt</label>
            <div>
                <input type="date" name="startDate" id="startDate" required/>
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div>
            <div>
                <s:fielderror fieldName="startDate" cssClass="errorMessage"/>
            </div>
        </div>
        <div>
            <label for="endDate">Date de fin d'emprunt</label>
            <div>
                <input type="date" name="endDate" id="endDate" required/>
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div>
            <div>
                <s:fielderror fieldName="endDate" cssClass="errorMessage"/>
            </div>
        </div>
        <div>
            <s:submit value="Valider"/>
        </div>
    </s:form>

</body>
</html>

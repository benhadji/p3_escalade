<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 15/12/2017
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>CliffHanger</title>
</head>
<body>

<div class="area">
    <div class="area-header">
        <h2>Site : <s:property value="%{site.nom}"/>  , avec ses secteurs, ses voies et ses longueurs ...</h2>
    </div>
    <div class="area-content">

        <p>
            <s:iterator value="site.secteurs">
                <h2>Nom du secteur : <s:property value="nom"/></h2>
                <s:iterator value="voies">
                    <h3>Nom de la voie : <s:property value="nom"/></h3>
                    <ul>
                        <s:iterator value="longueurs">
                            <li>Nom de la longueur : <s:property value="nom"/></li>
                        </s:iterator>
                    </ul>
                    </p>
                </s:iterator>

            </s:iterator>
        </p>

    </div>
</div>

</body>
</html>

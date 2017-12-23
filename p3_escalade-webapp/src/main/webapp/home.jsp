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
        <div class="area-header">
            <h2>Listes des sites:</h2>
        </div>
        <div class="area-content">
            <div class="list">
                <s:iterator value="sites">
                    </li><a href="<s:url namespace="/" action="site"><s:param name="site_id"><s:property value="site_id"/> </s:param> </s:url>">
                        <s:property value = "site_id"/>. <s:property value = "nom"/></a><br></li>
                </s:iterator>
            </div>
        </div>
    </div>

</body>
</html>

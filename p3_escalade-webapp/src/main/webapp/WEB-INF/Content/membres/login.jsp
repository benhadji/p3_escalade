<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 03/01/2018
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<body>
<h1>Connectez vous !!</h1>


<s:form name="loginForm" action="login" method="post">
    <s:textfield name="email" label="Email"/>
    <s:password name="password" label="Password"/>
    <s:submit value="Login"/>
</s:form>


</body>
</html>
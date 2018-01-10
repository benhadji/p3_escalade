<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Access Denied</title>
</head>
<body>
${errormessage}
<jsp:include page="login.jsp"/>
<a href="login.action">Back</a>
</body>
</html>
<%--

<%--
  Created by IntelliJ IDEA.
  User: arnaud
  Date: 15/02/19
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Ceci est un titre</title>
</head>
<body>

<s:form action="login">
    <s:textfield name="login"/>
    <s:password name="password"/>
    <s:submit/>
</s:form>
</body>
</html>
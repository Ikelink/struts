<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: arnaud
  Date: 27/02/19
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Vous avez parié sur
<s:property value="pari.vainqueur"/>
<s:property value="pari.montant"/>

<s:a action="goMenu">Retour au menu</s:a>
</body>
</html>
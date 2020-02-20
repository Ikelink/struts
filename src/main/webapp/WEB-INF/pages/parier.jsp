<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: arnaud
  Date: 27/02/19
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Parier sur le match de <s:property value="match.sport"/> :
<s:property value="match.equipe1"/>
/
<s:property value="match.equipe2"/>
le
<s:property value="match.quand"/>

<s:form action="parier">
    <s:hidden name="idMatch" value="%{match.idMatch}"/>
    <s:select list="resultatsPossibles" name="resultat"/>
    <s:textfield name="montant" label="montant"/>
    <s:submit/>
</s:form>

<s:a action="goMenu">Retour au menu</s:a>

</body>
</html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: arnaud
  Date: 15/02/19
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <s:iterator value="paris" var="pari">
        <tr>
            <td>
                <s:property value="#pari.match.sport"/>
            </td>
            <td>
                <s:property value="#pari.match.equipe1"/>
            </td>
            <td>
                <s:property value="#pari.match.equipe2"/>
            </td>
            <td>
                vous avez parié sur : <s:property value="#pari.match.vainqueur"/>
            </td>
            <td>
                pour  <s:property value="#pari.montant"/>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
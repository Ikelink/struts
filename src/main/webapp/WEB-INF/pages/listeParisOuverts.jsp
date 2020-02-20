<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: arnaud
  Date: 15/02/19
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <s:iterator value="matchs" var="match">
        <tr>
            <td>
                <s:property value="#match.match.sport"/>
            </td>
            <td>
                <s:property value="#match.match.equipe1"/>
            </td>
            <td>
                <s:property value="#match.match.equipe2"/>
            </td>
            <s:url action="goParier" var="parier">
                <s:param name="idMatch" value="#match.idMatch"/>

            </s:url>
            <s:a href="%{parier}">Parier</s:a>

        </tr>
    </s:iterator>

    <s:a action="goMenu">Retour au menu</s:a>
</table>

</body>
</html>
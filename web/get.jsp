<%--
  Created by IntelliJ IDEA.
  User: 贺俞凯
  Date: 2019/4/15
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bean" class="bb.MyBean">
    <jsp:setProperty name="bean" property="*"/>
</jsp:useBean>
<html>
<head>
    <title>处理并打印</title>
</head>
<body>
<table align="center" width="400">
    <tr>
        <td align="right">name:</td>
        <td>
            <jsp:getProperty name="bean" property="name"/>
        </td>
    </tr>

    <tr>
        <td align="right">passed:</td>
        <td>
            <jsp:getProperty name="bean" property="passwd"/>
        </td>
    </tr>

</table>


</body>
</html>

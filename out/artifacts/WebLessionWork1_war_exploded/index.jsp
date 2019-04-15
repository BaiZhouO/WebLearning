<%--
  Created by IntelliJ IDEA.
  User: 贺俞凯
  Date: 2019/4/15
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>随堂测验1</title>
  </head>
  <body>
  <form action="get.jsp" method="post">
    <table align="center" width="400" height="200" border="1">
      <tr>
        <td align="center" colspan="2" height="40">
            <b>添加name与passwd信息</b>
        </td>
      </tr>

      <tr>
        <td align="right">name:</td>
        <td>
          <input type="text" name="name">
        </td>
      </tr>

      <tr>
        <td align="right">passwd:</td>
        <td>
          <input type="text" name="passwd">
        </td>
      </tr>

      <tr>
        <td align="center" colspan="2">
          <input type="submit" value="submit">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>

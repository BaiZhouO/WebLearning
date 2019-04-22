下面是一段JSP代码，要求使用Servlet技术编程实现和它一样的客户端输出。


<!-- expression.jsp文件代码-->



\<%@page import="java.util.*"%>

\<%@page contentType="text/html; charset=GB2312"%>

\<html>

\<head><title>声明和表达式使用示例</title></head>

\<body>

\<div align="center">

<%! String str;%>

<% str="现在时间是：";%>

<%! Date MyDate= new Date();%>

\<font size=5 color=blue>

\<b>

<%=str%><%=MyDate.toLocaleString()%>

\</font>

\</b>

\</div>

\</body>

\</html>

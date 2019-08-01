<%--
  Created by IntelliJ IDEA.
  User: 王楠
  Date: 2019/7/31
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h2>登陆成功</h2>
        <a href="Countservlet">获取登陆成功总数</a>
        <%--  让tomcat的默认servlet去提供下载--%>
<%--        <a href="download/1.jpg">默认图片</a>--%>
        <%--  手动编码提供下载--%>
        <a href="Downloadservlet?filename=1.jpg">手动编码下载</a>
</body>
</html>

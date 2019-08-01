<%--
  Created by IntelliJ IDEA.
  User: 王楠
  Date: 2019/7/31
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>请输入以下内容，完成登录</h2>
    <form action="Loginservlet" method="get">
        账号：<input type="text" name="username"/><br/>
        密码：<input type="text" name="password"/><br/>
        <input type="submit" value="登录"/>
    </form>


</body>
</html>

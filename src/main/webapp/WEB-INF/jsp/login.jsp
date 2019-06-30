<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 2019/6/29
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${ctx}/css/div.css">
</head>
<body>
<form method="post" name="login" action="${pageContext.request.contextPath}/user/login">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="提交">
</form>
<div>
    asdasdad
</div>
</body>
</html>

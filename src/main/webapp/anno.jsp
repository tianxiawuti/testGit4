<%--
  Created by IntelliJ IDEA.
  User: 11930
  Date: 2021/10/4
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="uname">
        用户年龄：<input type="text" name="age">
        <input type="submit" value="提交">
    </form>

    <a href="/anno/testSessionAttribute">testSession</a>
</body>
</html>

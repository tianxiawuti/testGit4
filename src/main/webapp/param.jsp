<%--
  Created by IntelliJ IDEA.
  User: 11930
  Date: 2021/10/4
  Time: 7:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>param</title>
</head>
<body>
    <form action="/user/mytest" method="post">
        用户姓名：<input type="text" name="uname">
        用户年龄：<input type="text" name="age">
        日期：   <input type="text" name="date">
        <input type="submit" value="提交">
    </form>

</body>
</html>

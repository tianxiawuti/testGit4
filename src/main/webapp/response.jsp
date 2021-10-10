<%--
  Created by IntelliJ IDEA.
  User: 11930
  Date: 2021/10/4
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script type="text/JavaScript" src='<c:url value="/js/jquery.min.js"></c:url>'></script>

    <script>
        $(function (){
            $("#btn").click(function (){
                //alert("hello btn");
                $.ajax({
                        url:"user/testAjax",
                        contentType:"application/json;charset=UTF-8",
                        data:'{"username":"hehe","password":"123","age":30}',
                        dataType:"json",
                        type:"post",
                        success:function (data){
                            alert(data);
                            alert(data.username);
                            alert(data.password);
                            alert(data.age);
                        }
                    }
                );
            });
        });
    </script>
</head>
<body>
    <a href="/user/testString">testString</a>
    <button id="btn">发送AJAX请求</button>
    <a href="/user/testVoid">testVoid</a>
</body>
</html>

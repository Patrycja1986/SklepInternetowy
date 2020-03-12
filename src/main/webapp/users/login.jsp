<%--
  Created by IntelliJ IDEA.
  User: uder
  Date: 24.02.2020
  Time: 08:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
</head>
<body>
<div border="1">

    <form method="post" action="/login">
        <input type="text" name="login" placeholder="enter your login">
        <input type="password" name="password" placeholder="enter your valid password">
        <input type="submit" value="Login">
    </form>
    <div>
        <label><a href="addUser.jsp">Create a new account</a></label>
    </div>

</div>

</body>
</html>

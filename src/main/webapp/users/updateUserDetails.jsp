<%--
  Created by IntelliJ IDEA.
  User: uder
  Date: 24.02.2020
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h3>Enter your new details:</h3>
<hr>
<form method="post" action="/update">
    First Name:     <input type="text" name="name"> <br><br>
    Second Name: <input type="text" name="surname"> <br><br>
    Email:    <input type="email" name="email"> <br><br>
    Login:    <input type="text" name="login"> <br><br>

    <input type="submit" name="Update">
</form>
</body>
</html>

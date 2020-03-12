<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: uder
  Date: 23.02.2020
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h3>Enter your details:</h3>
<hr>
<form method="post" action="/addUser">
    First Name:     <input type="text" name="name"> <br><br>
    Second Name: <input type="text" name="surname"> <br><br>
    Email:    <input type="email" name="email"> <br><br>
    Login:    <input type="text" name="login"> <br><br>
    Password: <input type="password" name="password"> <br><br>

                                  <input type="submit" name="Add">
</form>


</body>
</html>

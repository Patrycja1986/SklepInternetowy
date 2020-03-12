<%--
  Created by IntelliJ IDEA.
  User: uder
  Date: 24.02.2020
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update confirmation</title>
</head>
<body>
<h1> your details have been successfully updated </h1>
<table border="1">
    <thead>
   <tr>
       <th>Name</th>
       <th>Surname</th>
       <th>Email</th>
       <th>Login</th>
   </tr>
    </thead>
    <tbody>
    <tr>
        <td>${user.name}</td>
        <td>${user.surname}</td>
        <td>${user.email}</td>
        <td>${user.login}</td>
    </tr>
    </tbody>
</table>
</body>
</html>

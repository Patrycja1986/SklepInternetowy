<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<a href="users/addUser.jsp" style="margin: 10px"> Create your account </a>
<a href="users/login.jsp" style="margin: 10px"> Login </a>

<c:if test="${not empty sessionScope.user}">
    <form method="post" action="/logout">
        <input style="margin: 10px"  type="submit" value="logout">
    </form>
    <form method="post" action="/users/updateUserDetails.jsp">
        <input style="margin: 10px" type="submit" value="update your details">
    </form>
</c:if>
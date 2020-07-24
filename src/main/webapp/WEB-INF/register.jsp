<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 7/23/20
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Register page"/>
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp"/>
    <h1>To register an account please fill out the form</h1>
        <form action="/register" method="post">
            <label for="username">Username</label>
            <input id="username" name="username" type="text">
            <br>
            <label for="email">Email</label>
            <input id="email" name="email" type="text">
            <br>
            <label for="password">Password</label>
            <input id="password" name="password" type="password">
            <br>
            <label for="confirm_password">Confirm Password</label>
            <input id="confirm_password" name="confirm_password" type="password">

            <input type="submit" class="btn-primary">
        </form>

</body>
</html>

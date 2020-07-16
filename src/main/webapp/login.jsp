<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 7/15/20
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        }
    }
%>
<html>
<head>

    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
<%--    <% request.setAttribute("title", "Login"); %> --%>
<%--    <%@ include file="partials/head.jsp" %>--%>

</head>
<body>
<%--    <%@ include file="partials/navbar.jsp"%>--%>
    <jsp:include page="partials/navbar.jsp" />



    <h1>Log in</h1>
    <form action="login.jsp" method="post" >
        <h3>Username:</h3>
        <input type="text" id="username" name="username">
        <br>
        <h3>Password:</h3>
        <input type="text" id="password" name="password">
        <button type="submit">Submit</button>
    </form>

</body>
</html>

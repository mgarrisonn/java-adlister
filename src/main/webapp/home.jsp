<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 7/14/20
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String firstName = request.getParameter("firstName"); %>
<%! String lastName = "Garrison"; %>
<%! int myNumber = 1; %>
<% request.setAttribute("number", myNumber);%>
<% request.setAttribute("title", "Home page");%>

<%-- How to redirect a page --%>
<%--<%response.sendRedirect("/index.jsp"); %>--%>

<%--<%--%>
<%--    if(firstName != null ){--%>
<%--        if(firstName.equals("michael")){--%>
<%--            response.sendRedirect("/index.jsp");--%>
<%--        }--%>
<%--}--%>
<%--%>--%>

<html>
<head>
    <title>Home Page</title>
    <title>${title}</title>
</head>
<body>
    <h1>Welcome</h1>
    <h3>${number}</h3>

    <%-- including navbar --%>
    <%@ include file="partials/navbar.jsp"%>

<%--    <h1>Hello, <%= firstName%> <%= lastName%></h1>--%>
<%--    <%@ include file="partials/aboutme.jsp"%>--%>
    <h3>What would you like to do?</h3>

    <h3>View Your Profile</h3>
    <form
        action="/userprofile.jsp" method ="get"  >
        <input type="hidden" id="username" name="username" value="Michael">
        <button type="submit">Go There</button>
    </form>

    <h3>Add a To Do</h3>
    <form action="/todo.jsp" method="post">
        <input type="text" id="item" name="item">
        <button type="submit">Add to list</button>
    </form>

    <%-- including footer --%>
    <%@ include file="partials/footer.jsp"%>

</body>
</html>

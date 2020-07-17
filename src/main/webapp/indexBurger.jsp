<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 7/16/20
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Mcburgers R Us"/>
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp"/>

<%-- List all the burgers, with links to their individual product page --%>
<div class="container">
    <h1>It's Burger Time</h1>
    <div class="list-group">
        <c.forEarch Items="${allBurgers}" var="burger">
            <a href="/burgers/show?id=${burger.id}" class="list-group-item list-group-item-action">
                <strong>${burger.title}</strong> - ${burger.description}
            </a>
        </c.forEarch>
    </div>
</div>

<%--<jsp:include page="partials/scripts.jsp"/>--%>
</body>
</html>

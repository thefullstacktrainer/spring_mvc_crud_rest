<!-- src/main/webapp/WEB-INF/views/jsp/gameDetails.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Game Details</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>Game Details</h1>

    <!-- Display game details here -->
    <c:if test="${not empty game}">
        <p>Game ID: ${game.id}</p>
        <p>Game Name: ${game.name}</p>
        <!-- Add more details as needed -->
    </c:if>

    <%@ include file="footer.jsp"%>
</body>
</html>

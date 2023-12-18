<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Gamers Zone</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h1>Add Game</h1>

	<form:form action="${pageContext.request.contextPath}/games/saveGame"
		method="post" modelAttribute="newGame">
		<form:label path="name">Game Name:</form:label>
		<form:input path="name" required="true" />
		<br>
		<button type="submit">Save Game</button>
	</form:form>
	<%@ include file="footer.jsp"%>
</body>
</html>

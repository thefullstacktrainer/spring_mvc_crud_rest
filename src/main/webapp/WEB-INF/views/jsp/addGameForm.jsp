<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/styles.css' />">
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

		<form:label path="genre">Genre:</form:label>
		<form:select path="genre">
			<form:option value="ACTION" label="Action" />
			<form:option value="ADVENTURE" label="Adventure" />
			<form:option value="RPG" label="Role-playing Game" />
		</form:select>
		<br>

		<form:label path="platforms">Platforms:</form:label>
		<form:checkbox path="platforms" value="PC" label="PC" />
		<form:checkbox path="platforms" value="XBOX" label="Xbox" />
		<form:checkbox path="platforms" value="PLAYSTATION"
			label="PlayStation" />
		<br>

		<form:label path="multiplayer">Multiplayer:</form:label>
		<form:radiobutton path="multiplayer" value="true" label="Yes" />
		<form:radiobutton path="multiplayer" value="false" label="No" />
		<br>

		<button type="submit">Save Game</button>
	</form:form>
	<%@ include file="footer.jsp"%>
</body>
</html>

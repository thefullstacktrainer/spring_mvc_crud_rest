<!-- src/main/webapp/WEB-INF/views/jsp/addGameForm.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
	<title>Gamers Zone</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h1>Add Game</h1>

	<form action="saveGame" method="post">
		<label for="gameName">Game Name:</label> <input type="text"
			id="gameName" name="gameName" required> <br>
		<button type="submit">Save Game</button>
	</form>
	<%@ include file="footer.jsp"%>
</body>
</html>

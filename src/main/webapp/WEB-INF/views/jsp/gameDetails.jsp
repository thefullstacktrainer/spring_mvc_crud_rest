<!-- src/main/webapp/WEB-INF/views/jsp/gameDetails.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/styles.css' />">

<title>Game Details</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<h1>Game Details</h1>

	<c:if test="${not empty game}">
		<table>
			<tr>
				<th>ID:</th>
				<td>${game.id}</td>
			</tr>
			<tr>
				<th>Name:</th>
				<td>${game.name}</td>
			</tr>
			<tr>
				<th>Genre:</th>
				<td>${game.genre}</td>
			</tr>
			<tr>
				<th>Platforms:</th>
				<td>${game.platforms}</td>
			</tr>
			<tr>
				<th>Multiplayer:</th>
				<td>${game.multiplayer ? 'Yes' : 'No'}</td>
			</tr>
		</table>
	</c:if>

	<%@ include file="footer.jsp"%>
</body>
</html>




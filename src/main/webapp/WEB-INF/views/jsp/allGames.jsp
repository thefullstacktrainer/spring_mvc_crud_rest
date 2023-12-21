<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/styles.css' />">
<title>All Games</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h1>All Games</h1>

	<!-- Display games in a table -->
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Genre</th>
				<th>Platforms</th>
				<th>Multiplayer</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="game" items="${games}">
				<tr>
					<td>${game.id}</td>
					<td><a href="<%=request.getContextPath()%>/games/${game.id}">${game.name}</a></td>
					<td>${game.genre}</td>
					<td>${game.platforms}</td>
					<td>${game.multiplayer}</td>
					<td><a
						href="<%=request.getContextPath()%>/games/edit/${game.id}"
						class="edit-link">Edit</a></td>
					<td>
						<!-- Confirmation prompt before deleting --> <a
						href="<%=request.getContextPath()%>/games/delete/${game.id}"
						onclick="return confirm('Are you sure you want to delete this game?')"
						class="delete-link">Delete</a>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%@ include file="footer.jsp"%>
</body>
</html>

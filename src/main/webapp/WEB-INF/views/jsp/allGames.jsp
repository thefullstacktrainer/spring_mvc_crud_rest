<!-- src/main/webapp/WEB-INF/views/jsp/allGames.jsp -->

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

	<!-- Display all games with links to their details -->
	<c:forEach var="game" items="${games}">
		<div>

			<a href="<%=request.getContextPath()%>/games/${game.id}">
				${game.name} </a> <a
				href="<%=request.getContextPath()%>/games/edit/${game.id}"> Edit
			</a>
			<form action="<%=request.getContextPath()%>/games/delete/${game.id}"
				method="post" style="display: inline;">
				<input type="hidden" name="_method" value="delete">
				<button type="submit">Delete</button>
			</form>

		</div>
	</c:forEach>

	<%@ include file="footer.jsp"%>
</body>
</html>

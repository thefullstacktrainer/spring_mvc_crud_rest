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
		<p>
			<a href="<%=request.getContextPath()%>/games/${game.id}">
				${game.name} </a>
		</p>
	</c:forEach>

	<%@ include file="footer.jsp"%>
</body>
</html>

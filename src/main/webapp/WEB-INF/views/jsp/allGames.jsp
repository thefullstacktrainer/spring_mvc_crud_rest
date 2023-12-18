<!-- src/main/webapp/WEB-INF/views/jsp/gamerszone.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<title>Gamers Zone</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<h2>All Games</h2>

	<ul>
		<c:forEach var="game" items="${games}">
			<li>${game}</li>
		</c:forEach>
	</ul>

	<%@ include file="footer.jsp"%>
</body>
</html>

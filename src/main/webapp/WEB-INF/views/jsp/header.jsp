<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/styles.css' />">

<nav>
	<ul>
		<li><a href="${pageContext.request.contextPath}/">Home</a></li>
		<li><a href="${pageContext.request.contextPath}/games">All
				Games</a></li>
		<li><a href="${pageContext.request.contextPath}/games/addGame">Add
				a New Game</a></li>
	</ul>
</nav>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Game</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/addgame" method="post">
        Game Name: <input type="text" name="name" /><br/><br/>
        Game Genre: <input type="text" name="genre" /><br/><br/>
        <input type="submit" value="Add Game" />
    </form>
</body>
</html>

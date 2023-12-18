<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        Username: <input type="text" name="username" /><br/><br/>
        Password: <input type="password" name="password" /><br/><br/>
        <input type="submit" value="Login" />
    </form>
</body>
</html>

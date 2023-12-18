<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
    <h2>Welcome to the Game Portal</h2>
    
    <!-- Your existing content goes here -->

    <!-- Add links to the login and signup forms -->
    <p>If you have an account, <a href="${pageContext.request.contextPath}/login">login here</a>.</p>
    <p>If you don't have an account, <a href="${pageContext.request.contextPath}/signup">signup here</a>.</p>
</body>
</html>

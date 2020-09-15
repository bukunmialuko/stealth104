<%--
  Created by IntelliJ IDEA.
  User: USLUSER
  Date: 9/15/2020
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello world - Input Form</title>
</head>
<body>
<form action="processForm" method="GET">
    Hello User
    <br/>
    Student Name: ${param.studentName}
</form>
</body>
</html>

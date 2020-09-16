<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USLUSER
  Date: 9/15/2020
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<h2>The student is confirmed: ${student.firstName} ${student.lastName}</h2>
<br/>
Country: ${student.country}
<br/>
Favorite Language:
<br/>
${student.favoriteLanguage}
<br/>
Operating Systems
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>

</ul>
</body>
</html>

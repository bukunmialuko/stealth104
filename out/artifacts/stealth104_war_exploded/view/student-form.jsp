<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br/>
    Last name: <form:input path="lastName"/>
    <br/>
    Country
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br/>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>

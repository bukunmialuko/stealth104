<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: USLUSER
  Date: 9/16/2020
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {color: red}
    </style>
</head>
<body>

Fill out the form. Asterisk (*) means required
<br/>

<form:form action="processForm" modelAttribute="customer">
    First Name: <form:input path="firstName"/>
    <br/>
    Last Name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br/>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>

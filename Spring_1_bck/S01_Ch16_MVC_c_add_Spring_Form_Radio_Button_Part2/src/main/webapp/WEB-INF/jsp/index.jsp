<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<h4>Submit your information</h4>
	<hr />

	<form:form action="hello" modelAttribute="info">
	
	First Name : <form:input path="firstName" />
		<p />
	Last Name : <form:input path="lastName" />
		<p />
	Gender : <form:radiobuttons path="gender" items="${genderList}"/>
		<p />
		<input type="submit" value="Submit">


	</form:form>




</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css"/>
</head>
<body>
	<h4>Submit your information</h4>
	<hr />

	<form:form action="hello" modelAttribute="info">
	
	First Name : <form:input path="firstName" />
		<p />
	Last Name : <form:input path="lastName" />
		<p />
	Gender : <form:radiobuttons path="gender" items="${genderList}" />
		<p />
  
	Country : 
			<form:select path="country" items="${countryList}">
		</form:select>

		<p />
		
	Visited Countries :
		<form:checkboxes path="visitedCountries" items="${visitedCountryList}" />

		<p />
	Message : 
				<form:textarea path="message" />

		<p />
		<input type="submit" value="Submit">


	</form:form>

</body>
</html>
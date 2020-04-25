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
	Gender : <form:radiobuttons path="gender" items="${genderList}" />
		<p />
		
<%-- 	Country : 
			<form:select path="country">
			<form:options items="${countryList}" />
		</form:select> --%>
		
		
		Country : 
			<form:select path="country" items="${countryList}">
		</form:select>

		<p />
		
		Visited Countries :
		<p />
			<form:checkbox path="visitedCountries" value="China"/> China
			<form:checkbox path="visitedCountries" value="Thailand"/> Thailand
			<form:checkbox path="visitedCountries" value="Swedan"/> Swedan
			<form:checkbox path="visitedCountries" value="Japan"/> Japan
			<form:checkbox path="visitedCountries" value="India"/> India
		
		<p />
		
		Message : 
				<form:textarea path="message"/>

		<p />
		<input type="submit" value="Submit">


	</form:form>
 
</body>
</html>
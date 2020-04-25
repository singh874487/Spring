<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>

	<h4>Hello : ${myName}, as per date : ${todaysDate}</h4>

	<p />
	List of available courses
	<hr />

	<ul>
		<c:forEach var="tempCourse" items="${courses}">
			<li>${tempCourse}</li>
		</c:forEach>
	</ul>



</body>
</html>
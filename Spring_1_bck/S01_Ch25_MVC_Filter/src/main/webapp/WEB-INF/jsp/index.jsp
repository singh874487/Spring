<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>

	<h1>Home Page : List of users in the projects</h1>
	<hr />
	<br/>
	<a href="${pageContext.request.contextPath}/addUser" >Add User</a>
	<br/>
		<hr />
	<table border="1" alignment="left">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="temp" items="${usersList}">
			<tr>
				<td>${temp.user_id}</td>
				<td>${temp.name}</td>
				<td>${temp.email}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>
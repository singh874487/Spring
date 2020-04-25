<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Please enter the information</h1>

	<table>

		<form:form modelAttribute="user" action="saveUser">

			<tr>
				<td>Name : <form:input path="name" /> <form:errors path="name"
						cssStyle="color:red"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Email : <form:input path="email" /> <form:errors
						path="email" cssStyle="color:red"></form:errors>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</form:form>

	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>

<link type="text/css" rel="stylesheet" href=" ${pageContext.request.contextPath}/style/css/style.css" />
</head>
<body>

	<h2>List of available products</h2>
<div class="datagrid">
	<table>
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Cost</th>

		</tr>

		<c:forEach var="temp" items="${productList}">
			<tr>
				<td>${temp.productID }</td>
				<td>${temp.productName }</td>
				<td>${temp.cost }</td>
			</tr>

		</c:forEach>

	</table>
</div>
</body>
</html>
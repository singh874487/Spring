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
			<th>Cost($)</th>
			<th>Operation</th>

		</tr>

			<c:forEach var="product" items="${productList}">
				<tr>
					<td>${product.productID }</td>
					<td>${product.productName }</td>
					<td>${product.cost }</td>

					<td><a
						href="${pageContext.request.contextPath}/updateProductForm/?id=${product.productID}">
							Update</a></td>
				</tr>

			</c:forEach>

		</table>
	</p>
	
	<!-- Adding the Add Product button -->
		<input type="button" value="Add Product"
			onclick="window.location.href='addProductForm'; return false;" />
	</div>
</body>
</html>
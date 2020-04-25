<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>

<link type="text/css" rel="stylesheet"
	href=" ${pageContext.request.contextPath}/style/css/style.css" />
</head>
<body>
	<h2>Enter the product details</h2>
	
	<form:form action="addProduct" method="post" modelAttribute="product">
	<p/> Product Name :  
	<form:input path="productName"/>
	
	<p/> Product Cost   :
	<form:input path="cost"/>
	<p/><p/>
	<input type="submit" value="Add Product"> 
	
	</form:form>

</body>
</html>
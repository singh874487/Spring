<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add/Update Product</title>

<link type="text/css" rel="stylesheet"
	href=" ${pageContext.request.contextPath}/style/css/style.css" />
</head>
<body>
	<h2>Add/Update the product details</h2>
	<hr/>
	
	<form:form action="${pageContext.request.contextPath}/addProduct" method="post" modelAttribute="product">
	<form:hidden path="productID" />
	<p/> Product Name :  
	<form:input path="productName"/>
	
	<p/> Product Cost   :
	<form:input path="cost"/>
	<p/><p/>
	<input type="submit" value="Add/Update Product"> 
	
	</form:form>
	
	<hr/>
	 <a href="${pageContext.request.contextPath}/">HomePage</a> 
	

</body>
</html>
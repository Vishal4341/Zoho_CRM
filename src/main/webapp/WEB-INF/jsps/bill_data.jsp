<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>

<h2>All Bill</h2>
<hr>
<body>
<table>
	<tr>
	<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Mobile</th>
	<th>Product</th>
	<th>Price</th>
	
	</tr>	
	
	<c:forEach items="${bill}" var="bill">
	<tr>
	<td>${bill.id }</td>
	<td>${bill.firstName }</td>
	<td>${bill.lastName }</td>
	<td>${bill.mobile }</td>
	<td>${bill.product }</td>
	<td>${bill.price }</td>
	</tr>
	
	</c:forEach>
	
</table>

</body>
</html>
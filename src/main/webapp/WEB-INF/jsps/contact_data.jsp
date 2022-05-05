<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>

<h2>contact Result</h2>
<hr>
<body>
<table>
	<tr>
	<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Lead Source</th>
	<th>Mobile</th>
	<th>Billing</th>
	
	</tr>	
	
	<c:forEach items="${contact}" var="con">
	<tr>
	<td>${con.id }</td>
	<td><a href="getContactBYid?id=${con.id }">${con.firstName }</a></td>
	
	<td>${con.lastName }</td>
	<td>${con.email }</td>
	<td>${con.leadsource }</td>
	<td>${con.mobile }</td>
	<td><a href="billingById?id=${con.id }">Generate billing</a></td>
	</tr>
	
	</c:forEach>
	
</table>

</body>
</html>
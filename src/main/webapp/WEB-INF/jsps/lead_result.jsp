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
<a href="view">create Lead</a>
<h2>Lead Result</h2>
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
	
	</tr>	
	
	<c:forEach items="${lead}" var="leads">
	<tr>
	<td>${leads.id }</td>
	<td><a href="getLeadBYid?id=${leads.id }">${leads.firstName }</a></td>
	<td>${leads.lastName }</td>
	<td>${leads.email }</td>
	<td>${leads.leadsource }</td>
	<td>${leads.mobile }</td>
	</tr>
	
	</c:forEach>
	
</table>

</body>
</html>
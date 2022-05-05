<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Data</title>
</head>
<hr>
<body>
Id : ${lead.id }<br>
FirstName: ${lead.firstName }<br>
LastName: ${lead.lastName }<br>
Email: ${lead.email }<br>
LeadSource: ${lead.leadsource }<br>
Mobile: ${lead.mobile }<br>

<form action="compose" method="post">
	<input type="hidden" name="emailid" value="${lead.email }">
	<input type="submit" value="Email">
	</form>
<form action="convertLead" method="post">
	<input type="hidden" name="id" value="${lead.id }">
	<input type="submit" value="Convert">


</form>
</body>
</html>
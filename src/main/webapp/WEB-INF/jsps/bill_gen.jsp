<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<h2>create | Lead</h2>
<hr>
<body>
<form action="saveBill" method="post">
<pre>
	FirstName<input type="text" name="firstName" value="${contact.firstName }">
	LastName<input type="text" name="lastName" value="${contact.lastName }">
	Email<input type="text" name="email" value="${contact.email }">
	
	Mobile<input type="text" name="mobile" value="${contact.mobile }">
	Product<input type="text" name="product">
	Price<input type="text" name="price">
	
	<input type="submit" value="generate bill">



</pre>



</form>

</body>
</html>
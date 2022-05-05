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
<form action="saveall" method="post">
<pre>
	FirstName<input type="text" name="firstName">
	LastName<input type="text" name="lastName">
	Email<input type="text" name="email">
	
	LeadSource:
	<select name="leadsource">
	  <option value="Tv television">Tv television</option>
	  <option value="News Pepar">News pepar</option>
	  <option value="Online Research">Online Research</option>
	  <option value="Radio">Radio</option>
	</select>
	
	Mobile<input type="text" name="mobile">
	<input type="submit" value="save">



</pre>



</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>.:Success:.</title>
</head>
<body>
	<table>
		<tr>
			<td>Username :: </td>
			<td>${msg.email}</td>
		</tr>
		
		<tr>
			<td>Password :: </td>
			<td>${msg.password}</td>
		</tr>
	</table>
</body>
</html>
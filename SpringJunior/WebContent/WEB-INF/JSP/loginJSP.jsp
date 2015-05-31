<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#d3d3d3" topmargin="200px">
	<spring:form commandName="loginObj" action="/SpringJunior/validateLogin">
	
	
	<table align="center" border="0px" bordercolor="#FFFFFF" width="40%" background="#d3d3d3" >
		<thead>
			<tr>
				<th>Welcome To <b><i>NELITO</i></b></th>
			</tr>
			
		</thead>
		<tbody>
			<tr>
				<td>
					<tr align="center">
						<td>Username :: </td>
						<td><spring:input path="email"/></td>
					</tr>
					<tr align="center">
						<td>Password :: </td>
						<td><spring:input path="password"/></td>
					</tr>
				</td>
				<td>
					<tr>
						<td>
							<a href="/SpringJunior/register">Register</a> 
						</td>
					<td>
						<input type="submit" value="login">
					</td>
					
			</tr>	
		</tbody>
	</table>
	
	</spring:form>
</body>
</html>
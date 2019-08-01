<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
<title>update</title>
</head>
<body style="color:lightblue;">
	<h3>trainee Info</h3>
	<form action="save" method="post">
		<table border="1">
			<tbody>
				<tr>
					<td>Id</td>
					<td><input type="text" name="id" value="${CUSTOMER.id}" readonly="readonly"></td>
				</tr>
				
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="${CUSTOMER.name}"></td>
				</tr>
				
				<tr>
					<td>Location</td>
					<td><input type="text" name="location" value="${CUSTOMER.location}"></td>
				</tr>
				
				<tr>
					<td>Domain</td>
					<td><input type="text" name="domain" value="${CUSTOMER.domain}"></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="update">
	</form>
</body>
</html>
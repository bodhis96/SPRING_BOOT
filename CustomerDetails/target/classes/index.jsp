<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
	<h3>Login</h3>
	<form action="Customers/checkuser" method="post">
		<table>
			<tr>
				<th>Name</th>
				<td><input type="text" name="user" value="user"></td> 
			</tr>
			
			<tr>
				<th>pass</th>
				<td><input type="password" name="password" value="password"></td>
			</tr>
			<tr>
				<td></td>
				<td> <input type="submit" value="SUBMIT"></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>
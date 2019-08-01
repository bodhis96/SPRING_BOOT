<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Index</title>
</head>
<body style="backgroung-color:lightblue;">
	<table border=1>


		<h2>Customer Management System</h2>


		<table border=1>
			<tr>
				<th>Pick your operation</th>
			</tr>

			<tr>
				<th><a href="/Customers/addcustomer.jsp">Add a Customer</a></th>
			</tr>
			
			<tr>
				<th><a href="/Customers/delete.jsp">Delete a Customer</a></th>
			</tr>

			<tr>
				<th><a href="/Customers/modify.jsp">Modify a Customer</a></th>
			</tr>
			
			<tr>
				<th><a href="/Customers/retrieve.jsp">Retrieve a Customer</a></th>
			</tr>

			<tr>
				<th><a href="/Customers/listcustomers.jsp">Retrieve all Customers</a></th>
			</tr>
			
			<tr>
				<th><a href="updatecustomers.jsp">Update a Customer info</a></th>
			</tr>

		</table>
	</table>

</body>
</html>
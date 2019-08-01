<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Customer</title>
</head>
<body>
	<h3>Enter Customer details</h3>

	<form action="Customers/save" method="post">
		<table border=2>
			<tr>
				<th>Customer Id<input style="align: left;" type="text" name="id"
					required autofocus /></th>
			</tr>
			
			<tr>
				<th>Customer Name<input type="text" name="name" required
					autofocus /></th>
			<tr>

			<tr>
				<th>Customer Location 
					<input type="radio" name="location" value="Chennai"> Chennai 
					<input type="radio" name="location" value="Bangalore"> Bangalore 
					<input type="radio" name="location" value="Pune"> Pune 
					<input type="radio" name="location" value="Mumbai"> Mumbai
				</th>
			</tr>

			<!--  Customer Domain<input type="text" name="domain" required autofocus/> -->
			<tr>
				<th>Customer Domain<select name="domain">
						<option value="Please Select">Please Select</option>
						<option value="java">java</option>
						<option value=".net">.net</option>
						<option value="html">html</option>
						<option value="css">css</option>
				</select></th>
			</tr>

			<tr>
				<th><input type="submit" value="Add Customer"></th>
			</tr>

		</table>
	</form>
</body>
</html>
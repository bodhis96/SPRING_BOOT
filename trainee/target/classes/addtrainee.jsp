<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add trainee</title>
</head>
<body>
	<h3>Enter Trainee details</h3>

	<form action="trainees/save" method="post">
		<table border=2>


			<tr>
				<th>Trainee Id<input style="align: left;" type="text" name="id"
					required autofocus /></th>
			</tr>
			<br>
			<tr>
				<th>Trainee Name<input type="text" name="name" required
					autofocus /></th>
			<tr>
				<br>
			<tr>
				<th>Trainee Location <input type="radio" name="location"
					value="Chennai"> Chennai <input type="radio"
					name="location" value="Bangalore">Bangalore <input
					type="radio" name="location" value="Pune"> Pune <input
					type="radio" name="location" value="Mumbai"> Mumbai
				</th>
			</tr>
			<br>
			<!--  Trainee Domain<input type="text" name="domain" required autofocus/> -->
			<tr>
				<th>Trainee Domain<select name="domain">
						<option value="Please Select">Please Select</option>
						<option value="java">java</option>
						<option value=".net">.net</option>
						<option value="html">html</option>
						<option value="css">css</option>
				</select></th>
			</tr>
			<br>
			<tr>
				<th><input type="submit" value="Add trainee"></th>
			</tr>

		</table>
	</form>
</body>
</html>
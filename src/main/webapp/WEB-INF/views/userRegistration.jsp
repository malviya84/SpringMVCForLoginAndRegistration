<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>

	<h3>WelCome to enter the user details</h3>
	
<form action="register" method="post">
	<table align="center">
		<tr>
			<td >User First Name:</td>
			<td><input type="text" name="userFname" /></td>
		</tr>
		<tr>
			<td>User Last Name:</td>
			<td><input type="text" name="userLname" /></td>
		</tr>
		<tr>
			<td>User Email:</td>
			<td><input type="text" name="userEmail" /></td>
		</tr>
		<tr>
			<td>User Mobile Number:</td>
			<td><input type="text" name="userMobileNumber" /></td>
		</tr>
		<tr>
			<td>User Age:</td>
			<td><input type="text" name="userAge" /></td>
		</tr>
		<tr>
			<td>User Address:</td>
			<td><input type="text" name="userAddress" /></td>
		</tr>
		<tr>
			
			<td><input type="submit" name="submit" value="Submit Form" title="Submit"></input></td>
		</tr>

	</table>
	
	</form>

</body>
</html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tutor</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Add Tutor</h2>
	<%--H2 FOR HEADING --%>
	<form action="addtutors" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>Cell Number</td>
				<td><input type="text" name="cell_number"></td>
			</tr>
			<tr>
				<td>Location</td>
				<td><input type="text" name="location"></td>
			</tr>
			<input type="hidden" name="requestType" value="addtutorsnew" />
			<tr>
				<div>
					<h6 style="color: red">${msg}</h6>
				</div>
				<td><input type="submit">
				<td>
			<tr>
		</table>
	</form>
	<br>
	<br>
	<a href="tutor?requestType=tutor">Tutors List</a>
</body>
</html>
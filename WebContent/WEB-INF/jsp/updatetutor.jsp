<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.finalproject.domain.*"%>
	<%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Tutor Details</h2>
	<form action="updatetutor" method="post">
		<table>
			<tr>
				<td>Tutor Id:</td>
				<td><input type="text" name="id" value=${t.getId}></td>
			</tr>
			<tr>
				<td>Tutor Name:</td>
				<td><input type="text" name="name" value=${t.getName}>
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value=${t.getEmail}>
				</td>
			</tr>
			<tr>
				<td>Cell Number:</td>
				<td><input type="text" name="cell_number" value=${t.getCell_number}>
				</td>
			</tr>
			<input type="hidden" name="requestType" value="updatetutor" />
			<tr>
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
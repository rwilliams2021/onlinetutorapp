<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Tutors</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body background=https://www.kclu.org/sites/kclu2/files/styles/x_large/public/202009/BOOKS_0.JPEG>

	<jsp:include page="tutormenu.jsp"></jsp:include>
	<br><br>
	<h2>Tutor Profile</h2>

	<table class="clist">
		<tr>
			<td class="col">Id</td>
			<td class="col">Name</td>
			<td class="col">Email</td>
			<td class="col">Cell Number</td>
			<td class="col">Location</td>

			<c:forEach items="${tutor}" var="t">

				<tr>
					<td class="col">${t.getId()}<input type="hidden" name="id"
						value="${t.getId()}"></td>
					<td class="col">${t.getName()}</td>
					<td class="col">${t.getEmail()}</td>
					<td class="col">${t.getCell_number()}</td>
					<td class="col">${t.getLocation()}</td>
				</tr>
			</c:forEach>
	</table>

</body>
</html>
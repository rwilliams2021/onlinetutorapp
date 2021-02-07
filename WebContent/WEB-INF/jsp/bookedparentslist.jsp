<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Parents</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<jsp:include page="tutormenu.jsp"></jsp:include>
	<h2>Booked Parent List</h2>
	<div>
		<h6 style="color: red">${msg}</h6>
	</div>
	<form action="parentsbooked" method="get">

		<table class="clist">
			<tr>
				<td class="col">Id</td>
				<td class="col">Name</td>
				<td class="col">Email</td>
				<td class="col">Cell Number</td>
	
				<c:forEach items="${parents}" var="p">
					<tr>
						<td class="col">${p.getId()}<input type="hidden" name="id"
							value="${p.getId()}"></td>
						<td class="col">${p.getName()}</td>
						<td class="col">${p.getEmail()}</td>
						<td class="col">${p.getCellno()}</td>

					</tr>
				</c:forEach>
		</table>
	</form>

</body>
</html>
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
<body>

	<jsp:include page="adminmenu.jsp"></jsp:include>
	<h2>Tutor List</h2>

	<table class="clist">
		<tr>
			<td class="col">Id</td>
			<td class="col">Name</td>
			<td class="col">Email</td>
			<td class="col">Cell Number</td>
			<td class="col">Location</td>
		</tr>
		<c:forEach items="${tutor}" var="t">
			<form>
				<tr>
					<td class="col">${t.getId()}<input type="hidden"
						name="tid" value="${t.getId()}"></td>
					<td class="col">${t.getName()}<input type="hidden"
						name="name" value="${t.getName()}"></td>

					<td class="col">${t.getEmail()}<input type="hidden"
						name="email" value="${t.getEmail()}"></td>
						
					<td class="col">${t.getCell_number()}<input type="hidden"
						name="cell_number" value="${t.getCell_number()}"></td>
						
						<td class="col">${t.getLocation()}<input type="hidden"
						name="location" value="${t.getLocation()}"></td>
						
					<td class="col"><button formaction="updatetutor" formmethod="get">Update</button></td>
					<td class="col"><button formaction="deletetutor" formmethod="post">Delete</button></td>

				</tr>
				<div>
					<h6 style="color: red">${msg}</h6>
				</div>
			</form>

		</c:forEach>
	</table>
	<form action="addtutors" method="get">
		<button>Add New Tutor</button>
	</form>

</body>
</html>
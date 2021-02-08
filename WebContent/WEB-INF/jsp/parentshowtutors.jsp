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

	<jsp:include page="parentmenu.jsp"></jsp:include>
	<h2>Tutor List</h2>

	<table class="clist">
		<tr>
			<td class="col">Id</td>
			<td class="col">Name</td>
			<td class="col">Email</td>
			<td class="col">Cell Number</td>
			<td class="col">Location</td>
			<td class="col">Rating</td>
			<td class="col">My Rating</td>


		</tr>
		<c:forEach items="${tutor}" var="t">
			<form method="post">
				<tr>
					<td class="col">${t.getId()}<input type="hidden"
						name="tutorid" value="${t.getId()}"></td>
					<td class="col">${t.getName()}<input type="hidden"
						name="tname" value="${t.getName()}"></td>
					<td class="col">${t.getEmail()}<input type="hidden"
						name="temail" value="${t.getEmail()}"></td>
					<td class="col">${t.getCell_number()}<input type="hidden"
						name="tcellno" value="${t.getCell_number()}"></td>
					<td class="col">${t.getLocation()}<input type="hidden"
						name="tlocation" value="${t.getLocation()}"></td>
					<td class="col">${t.getRating()}</td>
					<td class="col"><input type='number' value=0 name='myrating' min="0"
						max="5" required></td>
					<td class="col"><button formaction="addrating">Submit
							Rating</button></td>
					<td class="col"><button formaction="addbooking">Book</button></td>
					<td class="col"><button formaction="addrequest">Request
							Demo</button></td>
					<td class="col"><input type="hidden"
						name="tpassword" value="${t.getPassword()}"></td>


				</tr>
				<div>
					<h6 style="color: red">${msg}</h6>
				</div>
			</form>
		</c:forEach>
	</table>
</body>
</html>
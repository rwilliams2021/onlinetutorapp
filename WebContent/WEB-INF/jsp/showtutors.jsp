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

	<jsp:include page="/parentmenu.jsp"></jsp:include>
	<h2>Tutor List</h2>
	<form action="addtutors" method="get">
		<table class="clist">
			<tr>
				<td class="col">Id</td>
				<td class="col">Name</td>
				<td class="col">Email</td>
				<td class="col">Cell Number</td>

				<c:forEach items="${tutor}" var="t">

					<tr>
						<td class="col">${t.getId()}<input type="hidden" name="id"
							value="${t.getId()}"></td>
						<td class="col">${t.getName()}</td>
						<td class="col">${t.getEmail()}</td>
						<td class="col">${t.getCell_number()}</td>
						<td class="col"><button>
								<a href="updatetutor?requestType=updatetutor">Update</a>
							</button></td>

						<form action="deleteparent" method="post">

							<td class="col"><button>
									<a href="deletetutor?action=delete&id=${t.getId()}">Delete</a>
								</button></td>
					</tr>
					<div>
						<h6 style="color: red">${msg}</h6>
					</div>
					</form>
				</c:forEach>
				<button>Add New Tutor</button>
		</table>
	</form>

</body>
</html>
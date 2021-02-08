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
<body background=https://www.kclu.org/sites/kclu2/files/styles/x_large/public/202009/BOOKS_0.JPEG>

	<jsp:include page="adminmenu.jsp"></jsp:include>
	<br><br>
	<h2>Admin List</h2>

	<table class="clist">
		<tr>
			<td class="col">Id</td>
			<td class="col">Username</td>
			<td class="col">Password</td>
			<c:forEach items="${admins}" var="a">
				<form action="deleteadmin" method="post">

					<tr>
						<td class="col">${a.getId()}<input type="hidden" name="pid"
							value="${a.getId()}"></td>

						<td class="col">${a.getUsername()}</td>
						<td class="col">${a.getPassword()}</td>
						<td class="col"><button>Delete</button></td>
					</tr>
					<div>
						<h6 style="color: red">${msg}</h6>
					</div>
				</form>

			</c:forEach>
	</table>
	<form action="addadmin" method="get">
		<button>Add New Admin</button>
	</form>

</body>
</html>
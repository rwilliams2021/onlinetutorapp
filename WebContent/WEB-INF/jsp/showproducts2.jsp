<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Products</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<jsp:include page="/menu.jsp"></jsp:include>
	<h2>Product List</h2>


	<c:forEach items="${products}" var="p">
		<form action="addtocart" method="post">
			<table class="clist">
				<tr>
					<td class="col">${p.getId()}</td>
					<input type="hidden" name="pid" value="${p.getId()}">
				</tr>
				<tr>
					<td class="col">${p.getName()}</td>
				</tr>
				<tr>
					<td class="col"><img src="${p.getPic()}" width="50px"></td>
				</tr>
				<tr>
					<td class="col">${p.getPrice()}</td>
				</tr>

				<tr>
					<td class="col"><button>Add</button></td>
				</tr>
			</table>
		</form>

	</c:forEach>

</body>
</html>
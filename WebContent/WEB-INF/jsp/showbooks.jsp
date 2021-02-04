<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Books</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<jsp:include page="/menu.jsp"></jsp:include>
	<h2>Book List</h2>
<form action="addbooks" method="get">
<table class="clist">
<tr><td class="col">Id</td><td class="col">Name</td><td class="col">Subject</td><td class="col">Price</td>
	<c:forEach items="${book}" var="b">
		
			
				<tr>
					<td class="col">${b.getId()}<input type="hidden" name="id" value="${b.getId()}"></td>
					<td class="col">${b.getName()}</td>
					<td class="col">${b.getSubject()}</td>
					<td class="col">${b.getPrice()}</td>
					
				
				
	</c:forEach>
	<button>Add New Book</button>
	</table>
		</form>
		
</body>
</html>
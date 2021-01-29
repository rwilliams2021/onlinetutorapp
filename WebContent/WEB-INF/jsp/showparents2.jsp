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

	<jsp:include page="/menu.jsp"></jsp:include>

<%-- 	<h2>
		Welcome to your shopping cart
		<c:if test="${login == null}">Guest</c:if>
		<c:if test="${login != null}">${login}</c:if>
		
	</h2> --%>

	<table class="clist">
		<tr>
			<td class="col">Id</td>
			<td class="col">name</td>
			<td class="col">Email</td>
			<td class="col">Cellno</td>

			<c:forEach items="${parents}" var="p">

				<tr>
					<td class="col">${p.getId()}</td>
					<td class="col">${p.getName()}</td>
					<td class="col">${p.getEmail()}</td>
					<td class="col">${p.getCellno()}</td>
				</tr>
			</c:forEach>
	</table>
	<button>Place Order</button>
</body>
</html>
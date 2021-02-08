<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body background=https://www.kclu.org/sites/kclu2/files/styles/x_large/public/202009/BOOKS_0.JPEG>
	<jsp:include page="indexmenu.jsp"></jsp:include>
	<h1>
	<br>
		<h2 style="color:black;">Welcome to  MathWIZE</h2>
		<c:if test="${id == null}">Guest</c:if>
		<c:if test="${id != null}">${id}</c:if>
	</h1>
</body>
</html>

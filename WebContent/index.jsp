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
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<h2>
		Welcome to Online Tutor App
		<c:if test="${login == null}">Guest</c:if>
		<c:if test="${login != null}">${login}</c:if>
	</h2>
</body>
</html>

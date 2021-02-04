<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.finalproject.domain.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Insertion Successful</h2>
	The Following Book is inserted in Database:
	<br>
	
	<form action="addbooks" method="post">
	<br>
<div>${msg}</div>
		<br>
		<a href="book?requestType=book">Book List</a>
</body>
</html>
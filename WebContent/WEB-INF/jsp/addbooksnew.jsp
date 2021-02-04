<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Books</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h2>Add Book</h2>         <%--H2 FOR HEADING --%>
<form action="addbooks" method="post">
<table>
<tr>
<td>Id:</td>
<td> <input type="text" name="id"> </td>
</tr>
<tr>
<td>Name:</td>
<td> <input type="text" name="name"> </td>
</tr>
<tr>
<td>Subject:</td>
<td> <input type="text" name="subject"> </td>
</tr>
<tr>
<td>Price:</td>
<td> <input type="text" name="price"> </td>
</tr>
<input type="hidden" name="requestType" value="addbooksnew"/>
<tr>
<td> <input type="submit"> <td>
<tr>
</table>
</form>
<br><br>
<a href="book?requestType=book">Book List</a>
</body>
</html>
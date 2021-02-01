<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.finalproject.domain.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Insertion Successful </h2>
<!--  <h3 align="right" style="color:green">You are logged-in as <%=session.getAttribute("userId") %></h3>-->
Following Tutor is inserted in Database: <br>
<% Tutor t = (Tutor)request.getAttribute("tutor"); %> <br>
ID: <%=t.getId() %> <br>
Name: <%=t.getName() %> <br>
Email: <%=t.getEmail() %> <br>
Cell Number: <%=t.getCell_number()%> <br>
<br><br>
<a href="tutors?requestType=tutors">Click here to View All Tutors</a>
</body>
</html>
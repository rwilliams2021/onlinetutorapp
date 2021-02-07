<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
* {
	margin: 10px;
}
</style>
</head>
<body>
	<jsp:include page="adminmenu.jsp"></jsp:include>

	<h2>Add admin</h2>
	<form action="addadmin" method="post">
		<div>
			<div>
				<label>Username</label> <input type='text' name='username'>
			</div>
			<div>
				<label>Password</label> <input type='text' name='password'>
			</div>
			<div>
				<h6 style="color: red">${msg}</h6>
			</div>
			<div>
				<button>Next>></button>
			</div>
		</div>
	</form>
</body>
</html>
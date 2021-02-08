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
<body background=https://www.kclu.org/sites/kclu2/files/styles/x_large/public/202009/BOOKS_0.JPEG>
	<jsp:include page="indexmenu.jsp"></jsp:include>
<br><br>
	<h2>Register Parent</h2>
	<form action="register" method="post">
		<div>
			<div>
				<label>Name</label> <input type='text' name='name'>
			</div>
			<div>
				<label>Email</label> <input type='text' name='email'>
			</div>
			<div>
				<label>Password</label> <input type='text' name='password'>
			</div>
			<div>
				<label>Cellno</label> <input type='text' name='cellno'>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script>
	function validate(frm) {
		if (frm.login.value == "") {
			alert("Login is required...");
			return false;
		}
		if (frm.password.value == "") {
			alert("Password is required...");
			return false;
		}
		return true;
	}
</script>
<style>
* {
	margin: 10px;
}
</style>
</head>
<body>
	<jsp:include page="/mainmenu.jsp"></jsp:include>

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
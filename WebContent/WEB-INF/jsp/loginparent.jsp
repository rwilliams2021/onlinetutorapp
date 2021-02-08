<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<script>
	function validate(frm) {
		if (frm.email.value == "") {
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


<link rel="stylesheet" href="css/style.css">

</head>

<jsp:include page="indexmenu.jsp"></jsp:include>
<body background=https://www.kclu.org/sites/kclu2/files/styles/x_large/public/202009/BOOKS_0.JPEG>
<br><br>
	<h2>Login Parent</h2>

	<form action="loginparents" method="post">

		<div>
			<div>
				<label>Email</label> <input type="text" name="email">
			</div>
			<div>
				<label>Password</label> <input type="password" name="password">
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



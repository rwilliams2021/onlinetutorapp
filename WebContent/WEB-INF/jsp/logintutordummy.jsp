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

<jsp:include page="/mainmenu.jsp"></jsp:include>
<body>
	<h2>Login Tutor</h2>

</body>
</html>



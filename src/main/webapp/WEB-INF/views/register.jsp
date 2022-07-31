<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">회원가입</h2>
		<hr>
		<form class="text-center" action="registerOk" method="post">
			<div class="form-group">
				<label>id : </label>
				<input name="name" required="required"/> 
			</div>
			
			<div class="form-group">
				<label>pw: </label>
				<input name="password" required="required" type="password"/>
			</div>
			
			<div class="btn-group">
				<input type="submit" value="register">
			</div>
		</form>
	</div>
</body>
</html>
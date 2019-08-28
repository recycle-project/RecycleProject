<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Dashboard</title>

    <!-- Fontfaces CSS-->
    <link href="/resources/bootstrap/css/font-face.css" rel="stylesheet" media="all">
    <link href="/resources/bootstrap/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="/resources/bootstrap/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="/resources/bootstrap/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="/resources/bootstrap/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">
    
    <!-- login CSS -->
    <link href="/resources/css/loginForm.css" rel="stylesheet" media="all">
</head>
</head>
<body>
	<div class="container">
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
				<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
				<div class="login-form">
					<div class="sign-in-htm">
						<form action="login" method="post">
							<div class="group">
								<label for="user" class="label">Username</label>
								<input id="user" name="employee_name" type="text" class="input" required>
							</div>
							<div class="group">
								<label for="pass" class="label">Password</label>
								<input id="pass" name="pwd" type="password" class="input" data-type="password" required>
							</div>
							<div class="group">
								<input id="check" type="checkbox" class="check" checked>
								<label for="check"><span class="icon"></span> Keep me Signed in</label>
							</div>
							<div class="group">
								<input type="submit" class="button" value="Sign In">
							</div>
							<div class="hr"></div>
							<div class="foot-lnk">
								<a href="#forgot">Forgot Password?</a>
							</div>
						</form>
					</div>
					<div class="sign-up-htm">
						<div class="group">
							<label for="user" class="label">Username</label>
							<input id="user" type="text" class="input">
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label>
							<input id="pass" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="pass" class="label">Repeat Password</label>
							<input id="pass" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="pass" class="label">Email Address</label>
							<input id="pass" type="text" class="input">
						</div>
						<div class="group">
							<input type="submit" class="button" value="Sign Up">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<label for="tab-1">Already Member?</a>
						</div>
					</div>
				</div><!-- login-form end -->
			</div>
		</div>
	</div> 
	<!--container end.//-->

    <!-- Jquery JS-->
    <script src="/resources/bootstrap/vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="/resources/bootstrap/vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="/resources/bootstrap/vendor/bootstrap-4.1/bootstrap.min.js"></script>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">
    
     <!-- Fontfaces CSS-->
    <link href="resources/bootstrap/css/font-face.css" rel="stylesheet" media="all">
    <link href="resources/bootstrap/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="resources/bootstrap/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="resources/bootstrap/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    

    <!-- Bootstrap CSS-->
    <link href="resources/bootstrap/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">
    
    <!-- login CSS -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
    <link href="resources/css/login.css" rel="stylesheet" media="all">
    
	<title>SSG Bin</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 logo">
				<div class="logo-div"><img src="resources/bootstrap/images/logo_01.png" id="mainLogo"/></div>
				<div class="logo-div">안녕하세요. SSG Bin입니다.</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 logo">
				<div class="logo-div intro-div">회원 서비스를 로그인 해주세요.</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-xl-3 col-lg-3 col-md-2 col-sm-1"></div>
			<div class="col-xl-6 col-lg-6 col-md-8 col-sm-10 col-12">
				<div class="card">
					<article class="card-body">
						<form method="post" action="user/login">
						<div class="form-group">
							<div class="input-group">
								<input name="employee_name" class="form-control" placeholder="Username" type="text">
							</div> <!-- input-group.// -->
						</div> <!-- form-group// -->
						<div class="form-group">
							<div class="input-group">
							    <input name="pwd" class="form-control" placeholder="Password" type="password">
							</div> <!-- input-group.// -->
						</div> <!-- form-group// -->
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-block login-btn">Login</button>
						</div> <!-- form-group// -->
						</form>
					</article>
				</div> <!-- card.// -->
			</div>
			<div class="col-xl-3 col-lg-3 col-md-2 col-sm-1"></div>
		</div>
	</div>
	<!--container end.//-->

    <!-- Jquery JS-->
    <script src="resources/bootstrap/vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="resources/bootstrap/vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="resources/bootstrap/vendor/bootstrap-4.1/bootstrap.min.js"></script>
</body>
</html>
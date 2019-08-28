<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Dashboard</title>

<!-- Fontfaces CSS-->
<link href="../resources/bootstrap/css/font-face.css" rel="stylesheet"
	media="all">
<link
	href="../resources/bootstrap/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link
	href="../resources/bootstrap/vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link
	href="../resources/bootstrap/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link
	href="../resources/bootstrap/vendor/bootstrap-4.1/bootstrap.min.css"
	rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link href="../resources/bootstrap/vendor/animsition/animsition.min.css"
	rel="stylesheet" media="all">
<link
	href="../resources/bootstrap/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="../resources/bootstrap/vendor/wow/animate.css"
	rel="stylesheet" media="all">
<link
	href="../resources/bootstrap/vendor/css-hamburgers/hamburgers.min.css"
	rel="stylesheet" media="all">
<link href="../resources/bootstrap/vendor/slick/slick.css"
	rel="stylesheet" media="all">
<link href="../resources/bootstrap/vendor/select2/select2.min.css"
	rel="stylesheet" media="all">
<link
	href="../resources/bootstrap/vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="../resources/bootstrap/css/theme.css" rel="stylesheet"
	media="all">
<link href="../resources/css/dashboard.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
	<div class="page-wrapper">
		<!-- HEADER MOBILE-->
		<header class="header-mobile d-block d-lg-none">
			<div class="header-mobile__bar">
				<div class="container-fluid">
					<div class="header-mobile-inner">
						<button class="hamburger hamburger--slider" type="button">
							<span class="hamburger-box"> <span class="hamburger-inner"></span>
							</span>
						</button>
						<div class="navbar-brand">
							<a class="logo" href="/ssgBin/dashboard/analysis"> <img
								src="../resources/bootstrap/images/logo_01.png" />
							</a>
						</div>
						<div class="account-wrap">
							<div class="account-item clearfix js-item-menu">
								<div class="content">
									<a class="js-acc-btn" href="#">${user.employee_name}
										${user.position } 님 </a>
								</div>
								<div class="account-dropdown js-dropdown">
									<div class="account-dropdown__footer">
										<a href="/ssgBin/user/logout"> <i class="zmdi zmdi-power"></i>Logout
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<nav class="navbar-mobile">
				<div class="container-fluid">
					<ul class="navbar-mobile__list list-unstyled">
						<li><a href="/ssgBin/dashboard/analysis">ANALYSIS</a></li>
						<li class="has-sub"><a class="js-arrow" href="#">STORE</a>
							<ul class="navbar-mobile-sub__list list-unstyled js-sub-list"
								id="navbar-mobile-list">

							</ul></li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- END HEADER MOBILE-->

		<!-- MENU SIDEBAR-->
		<aside class="menu-sidebar d-none d-lg-block">
			<div class="logo">
				<a href="/ssgBin/dashboard/main"> SSG Bin </a>
			</div>
			<div class="menu-sidebar__content js-scrollbar1">
				<nav class="navbar-sidebar">
					<ul class="list-unstyled navbar__list">
						<li class="sidebar-title"><img
							src="../resources/bootstrap/images/store-icon.png" /> 매장</li>
					</ul>
					<ul class="list-unstyled navbar__list" id="navbar-sidebar">

					</ul>
				</nav>
			</div>
		</aside>
		<!-- END MENU SIDEBAR-->

		<!-- PAGE CONTAINER-->
		<div class="page-container">
			<hr class="devide-line" />
			<!-- MAIN CONTENT-->
			<div class="main-content">
				<div class="section__content section__content--p30">
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">
								<div class="overview-wrap">
									<h2 class="title-1">STATUS</h2>
								</div>
							</div>
						</div>
						<div class="row m-t-25" id="bin-1">
							<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
								<div class="overview-item">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<span class="bin-name"></span>
											</div>
										</div>
									</div>
									<div class="set-size charts-container">
										<div class="pie-wrapper progress-45 style-2">
											<span class="label">45%</span>
											<div class="pie">
												<div class="left-side half-circle"></div>
												<div class="right-side half-circle"></div>
											</div>
											<div class="shadow"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
								<div class="overview-item">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<span class="bin-name"></span>
											</div>
										</div>
									</div>
									<div class="set-size charts-container">
										<div class="pie-wrapper progress-22 style-2">
											<span class="label">22%</span>
											<div class="pie">
												<div class="left-side half-circle"></div>
												<div class="right-side half-circle"></div>
											</div>
											<div class="shadow"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
								<div class="overview-item">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<span class="bin-name"></span>
											</div>
										</div>
									</div>
									<div class="set-size charts-container">
											<div class="pie-wrapper progress-75 style-2">
												<span class="label">75%</span>
												<div class="pie">
													<div class="left-side half-circle"></div>
													<div class="right-side half-circle"></div>
												</div>
												<div class="shadow"></div>
											</div>
										</div>
								</div>
							</div>
							<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
								<div class="overview-item">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<span class="bin-name"></span>
											</div>
										</div>
									</div>
									<div class="set-size charts-container">
											<div class="pie-wrapper progress-95 style-2">
												<span class="label">95%</span>
												<div class="pie">
													<div class="left-side half-circle"></div>
													<div class="right-side half-circle"></div>
												</div>
												<div class="shadow"></div>
											</div>
										</div>
								</div>
							</div>
						</div>
						<div class="row m-t-25">
							<div class="col-8 col-sm-8 col-md-4 col-lg-4 col-xl-4" id="ice">
								<div class="overview-item overview-item--c1">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<h2>제빙기</h2>
											</div>
											<div class="icon">
												<i><img src="../resources/bootstrap/images/ice.png" /></i>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-8 col-sm-8 col-md-4 col-lg-4 col-xl-4"
								id="refrigerator">
								<div class="overview-item overview-item--c1">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<h2>냉장고</h2>
											</div>
											<div class="icon">
												<i><img src="../resources/bootstrap/images/re.png" /></i>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-8 col-sm-8 col-md-4 col-lg-4 col-xl-4" id="light">
								<div class="overview-item overview-item--c4">
									<div class="overview__inner">
										<div class="overview-box clearfix">
											<div class="text">
												<h2>전등</h2>
											</div>
											<div class="icon">
												<i><img src="../resources/bootstrap/images/light.png" /></i>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="copyright">
									<p>
										Copyright © 2018 Colorlib. All rights reserved. Template by <a
											href="https://colorlib.com">Colorlib</a>.
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- END MAIN CONTENT-->
			<!-- END PAGE CONTAINER-->
		</div>

	</div>

	<!-- Jquery JS-->
	<script src="../resources/bootstrap/vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="../resources/bootstrap/vendor/bootstrap-4.1/popper.min.js"></script>
	<script
		src="../resources/bootstrap/vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="../resources/bootstrap/vendor/slick/slick.min.js">
    </script>
	<script src="../resources/bootstrap/vendor/wow/wow.min.js"></script>
	<script
		src="../resources/bootstrap/vendor/animsition/animsition.min.js"></script>
	<script
		src="../resources/bootstrap/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
	<script
		src="../resources/bootstrap/vendor/counter-up/jquery.waypoints.min.js"></script>
	<script
		src="../resources/bootstrap/vendor/counter-up/jquery.counterup.min.js">
    </script>
	<script
		src="../resources/bootstrap/vendor/circle-progress/circle-progress.min.js"></script>
	<script
		src="../resources/bootstrap/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="../resources/bootstrap/vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="../resources/bootstrap/vendor/select2/select2.min.js">
    </script>

	<!-- Main JS-->
	<script src="../resources/bootstrap/js/main.js"></script>
	<script>
		var storeID;
		$(document).ready(function() {
			$("#navbar-sidebar").empty();
			$("#navbar-mobile-list").empty();
			$.ajax({
				url : "/ssgBin/dashboard/list",
				data : {employee_id : ${user.employee_id}},
				method : "GET",
				dataType : "json"
			})
			.done(function(result) {
				$.each(result, function(idx, item) {
					$("#navbar-sidebar").append("<li><a href='main?id="+item.store_id+"' id='"+item.store_id+"'>"+item.store_name+"</a></li>");
					$("#navbar-mobile-list").append("<li><a href='main?id="+item.store_id+"' id=m'"+item.store_id+"'>"+item.store_name+"</a></li>");
				});
				
				
				var queryString = new URLSearchParams(window.location.search);
				
				if (queryString.has("id")) {
					$("#navbar-sidebar li").removeClass("active");
					$("#navbar-sidebar li").each(function(idx, item) {
						if ($(item).children().attr("id") == queryString.get("id")) {
							storeID = queryString.get("id");
							$(item).addClass("active");
						}
					});
				} else {
					storeID = $("#navbar-sidebar li:first-child").children().attr("id");
					$("#navbar-sidebar li:first-child").addClass("active");
				}
				$.ajax({
					url : "/ssgBin/dashboard/status",
					data : {store_id : storeID},
					method : "POST",
					dataType : "json"
				})
				.done(function(result) {	
					console.log(result);
					if (result.length > 4) {
						floor2 = $("#bin-1").clone();
						$("#bin-1").after(floor2.attr("id", "bin-2"));
					} else  {
						
					}
					$.each(result, function(idx, item) {
						$(".overview-item").each(function(idx2, item2) {
							if (idx == idx2) {
								$(item2).find(".bin-name").text(item.equipment_name);
							}
						});
					});
				});
			});
		});
		
		
		
	</script>
</body>

</html>
<!-- end document-->

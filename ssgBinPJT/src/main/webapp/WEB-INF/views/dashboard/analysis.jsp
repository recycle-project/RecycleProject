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
<link href="../resources/css/detail.css" rel="stylesheet" media="all">
<!-- analysis CSS -->
<link href="../resources/css/analysis.css" rel="stylesheet" media="all">
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

					<!-- 
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">
								<div class="overview-wrap">
									<h2 class="title-1">ANALYSIS</h2>
								</div>
							</div>
						</div>
					
					 -->


					<div class="container">
						<div>
							<div class="col-xs-12 ">
								<nav>
									<div class="nav nav-tabs nav-fill" id="nav-tab" role="tablist">
										<a class="nav-item nav-link active" id="nav-home-tab"
											data-toggle="tab" href="#nav-home" role="tab"
											aria-controls="nav-home" aria-selected="true">매장</a> <a
											class="nav-item nav-link" id="nav-profile-tab"
											data-toggle="tab" href="#nav-profile" role="tab"
											aria-controls="nav-profile" aria-selected="false">REPORT</a>
									</div>
								</nav>
								<div class="tab-content py-3 px-3 px-sm-0" id="nav-tabContent">
									<div class="tab-pane fade show active" id="nav-home"
										role="tabpanel" aria-labelledby="nav-home-tab">

										<!-- 첫번째 내용 -->
										<!-- Nav pills -->
										<ul class="nav nav-pills">
											<li class="nav-item"><a class="nav-link active"
												data-toggle="pill" href="#home">전체</a></li>
											<li class="nav-item"><a class="nav-link"
												data-toggle="pill" href="#ssg1">매장1</a></li>
											<li class="nav-item"><a class="nav-link"
												data-toggle="pill" href="#ssg2">매장2</a></li>
											<li class="nav-item"><a class="nav-link"
												data-toggle="pill" href="#ssg3">매장3</a></li>

										</ul>

										<!-- Tab panes -->
										<div class="tab-content">
											<div class="tab-pane container active" id="home">

												<!-- 여기 그래프 -->
												<div class="graph-box">
													<canvas id="garbage-store-bar-1"></canvas>
												</div>
												<div class="row m-t-25"
													style="padding-left: 15px; padding-right: 15px;">
													<div class="row">
														<div
															class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6 testsize2">
															<div class="overview-item overview-item--c1 nomargin">
																<div class="overview__inner">
																	<div class="overview-box clearfix">
																		<div>
																			<div class="text_style2">
																				<span></span> <i><img
																					src="../resources/bootstrap/images/can.png"
																					id="can-icon" /></i>
																			</div>
																			<div id="volume">
																				<p>5L</p>
																			</div>
																			<div>
																				last week 10% <i><img
																					src="../resources/bootstrap/images/reddown.png"
																					id="arrow" /></i>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<div
															class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6 testsize2">
															<div class="overview-item overview-item--c1 nomargin">
																<div class="overview__inner">
																	<div class="overview-box clearfix">
																		<div>
																			<div class="text_style2">
																				<span></span> <i><img
																					src="../resources/bootstrap/images/coffee.png"
																					id="coffee-icon" /></i>
																			</div>
																			<div id="volume">5L</div>
																			<div>
																				last week 20% <i><img
																					src="../resources/bootstrap/images/greenup.png"
																					id="arrow" /></i>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</div>
													<div class="row">
														<div
															class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6 testsize2">
															<div class="overview-item overview-item--c1 topmargin">
																<div class="overview__inner">
																	<div class="overview-box clearfix">
																		<div>
																			<div class="text_style2">
																				<span></span> <i><img
																					src="../resources/bootstrap/images/bottle.png"
																					id="bottle-icon" /></i>
																			</div>
																			<div id="volume">5L</div>
																			<div>
																				last week 30% <i><img
																					src="../resources/bootstrap/images/reddown.png"
																					id="arrow" /></i>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<div
															class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6 testsize2">
															<div class="overview-item overview-item--c1 topmargin">
																<div class="overview__inner">
																	<div class="overview-box clearfix">
																		<div>
																			<div class="text_style2">
																				<span></span> <i><img
																					src="../resources/bootstrap/images/ball.jpg"
																					id="ball-icon" /></i>
																			</div>
																			<div id="volume">5L</div>
																			<div>
																				last week 40% <i><img
																					src="../resources/bootstrap/images/greenup.png"
																					id="arrow" /></i>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
												<!-- 그래프 끝... -->


											</div>
											<div class="tab-pane container fade" id="ssg1">.22.</div>
											<div class="tab-pane container fade" id="ssg2">.33.</div>
											<div class="tab-pane container fade" id="ssg3">.44.</div>

										</div>

									</div>


									<!-- REPORT PANE START -->
									<div class="tab-pane fade" id="nav-profile" role="tabpanel"
										aria-labelledby="nav-profile-tab">


										<!-- Report-card -->
										<div class="report-card" style="margin-top: 0;">
											<div class="report-card-header">[분석] 8월 4주차 주간 리포트</div>
											<div class="row report-card-body">
												<div
													class="col-8 col-sm-8 col-md-8 col-lg-8 col-xl-8 report-card-content">
													이번 주는 캔 배출이 조금 많은 편이네요!</div>
												<div
													class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4 report-card-icon">
													<i><img src="../resources/bootstrap/images/can.png" /></i>
												</div>
											</div>
										</div>

										<div class="report-card">
											<div class="report-card-header">[분석] 배출량 감소 목표치</div>
											<div class="row report-card-body">
												<div
													class="col-8 col-sm-8 col-md-8 col-lg-8 col-xl-8 report-card-content">
													목표치에 맞추려면 하루에 20L씩 배출 필요<br> 이 추세라면 이번 달 배출량 423L 예상
												</div>
												<div
													class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4 report-card-icon">
													<i><img
														src="../resources/bootstrap/images/report_bar.png" /></i>
												</div>
											</div>
										</div>

										<div class="report-card">
											<div class="report-card-header">[분석] SSG BIN 비움 주기</div>
											<div class="row report-card-body">
												<div
													class="col-8 col-sm-8 col-md-8 col-lg-8 col-xl-8 report-card-content">
													아주 좋습니다!<br> 담당 구역 매장들의 일 평균 SSG BIN 비움 횟수는 2.4회 입니다.
												</div>
												<div
													class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4 report-card-icon">
													<i><img
														src="../resources/bootstrap/images/report_trash.png" /></i>
												</div>
											</div>
										</div>

										<div class="report-card" style="margin-top: 0;">
											<div class="report-card-header">[정보] 스타벅스 친환경 경영 선언</div>
											<div class="row report-card-body">
												<div
													class="col-8 col-sm-8 col-md-8 col-lg-8 col-xl-8 report-card-content">
													"열심히 일한 플라스틱 빨대, 떠나라!"</div>
												<div
													class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4 report-card-icon">
													<i><img
														src="../resources/bootstrap/images/report_paper.png" /></i>
												</div>
											</div>
										</div>


									</div>
									<!-- REPORT PANE END -->
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

	<!-- Chart JS -->
	<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/chartjs-plugin-datalabels@0.5.0"></script>
	<script src="../resources/bootstrap/js/analysis.js"></script>


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
								$(item2).find("span").text(item.equipment_name);
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

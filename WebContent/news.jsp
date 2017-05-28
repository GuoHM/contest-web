<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>比赛新闻</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body onload="today()">
	<jsp:include page="header.jsp" />
	<div class="background-color">
		<div class="container">
			<div class="carousel slide carousel-size" id="carousel-871299">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-871299"></li>
					<li data-slide-to="1" data-target="#carousel-871299"></li>
					<li data-slide-to="2" data-target="#carousel-871299"></li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="img/img_bg_1.jpg" class="img-responsive center-block" />
						<div class="carousel-caption">
							<h2>
								第九届<BR />上海市计算机应用能力大赛
							</h2>
							<p>2016.10-2017.5</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="img/mainPage.jpg" class="img-responsive center-block" />
						<div class="carousel-caption">
							<h4>获奖同学接收颁奖</h4>
						</div>
					</div>
					<div class="item">
						<img alt="" src="img/mainPage-2.jpg" class="img-responsive center-block" />
						<div class="carousel-caption">
							<h4>获奖同学接收颁奖</h4>
						</div>
					</div>
				</div>
				<a class="left carousel-control" href="#carousel-871299" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left"></span>
				</a>
				<a class="right carousel-control" href="#carousel-871299" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>
	</div>

	<footer id="fh5co-footer" role="contentinfo">
	<div class="row copyright">
		<div class="col-md-12 text-center">
			<p>
				<small class="block">Copyright © 2017 Guo Haoming.All rights reserved.</small>
			</p>
		</div>
	</div>
	</footer>

	<script src="js/main.js"></script>

</body>
</html>
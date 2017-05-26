<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>上海市计算机应用能力大赛</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body onload="today()">
	<div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#" name="date"></a>
		</div>
		<div class="collapse navbar-collapse menubar-left">
			<ul class="nav navbar-nav">
				<li class="active">
					<a href="index.jsp">
						<span class="glyphicon glyphicon-home">首页</span>
					</a>
				</li>
				<li>
					<a href="news.jsp">
						<span class="glyphicon glyphicon glyphicon-lock">比赛新闻</span>
					</a>
				</li>
				<li>
					<a href="info.jsp">
						<span class="glyphicon glyphicon-book">比赛信息</span>
					</a>
				</li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
		<div class="btn-group menubar-right">
			<button type="button" class="btn btn-default">
				<a href="regist.jsp">
					<span class="glyphicon glyphicon-th-large">注册</span>
				</a>
			</button>
			<button type="button" class="btn btn-default">
				<a href="login.jsp">
					<span class="glyphicon glyphicon-user">登录</span>
				</a>
			</button>
		</div>
	</div>

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

	<div class="container">
		<hr style="border-top: 1px ridge rgba(6, 3, 9, 0.47)">
		<div class="row clearfix">
			<div class="col-md-4 column" style="text-align: center">
				<h2>
					<span class="glyphicon glyphicon-comment">比赛新闻</span>
				</h2>
				<p>欢迎关注并了解比赛新闻</p>
				<p>
					<a class="btn" href="news.jsp">更多 »</a>
				</p>
			</div>
			<div class="col-md-4 column" style="text-align: center">
				<h2>
					<span class="glyphicon glyphicon-star">参赛报名</span>
				</h2>
				<p>加入计算机应用能力大赛</p>
				<p>
					<a class="btn" href="#">更多 »</a>
				</p>
			</div>
			<div class="col-md-4 column" style="text-align: center">
				<h2>
					<span class="glyphicon glyphicon-inbox">关于我们</span>
				</h2>
				<p>了解更多计算机应用能力大赛的相关信息</p>
				<p>
					<a class="btn" href="info.jsp">更多 »</a>
				</p>
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

	


	<!-- jQuery (Bootstrap 插件需要引入) -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<!-- 包含了所有编译插件 -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>
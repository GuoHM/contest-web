<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script type="text/javascript">
    
</script>
<div class="container">
	<div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
		<div class="navbar-header ">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#" name="date"></a>
		</div>
		<div class="collapse navbar-collapse menubar-left">
			<ul class="nav navbar-nav">
				<li class="active">
					<a href="<%=basePath%>/index.jsp">
						<span class="glyphicon glyphicon-home">首页</span>
					</a>
				</li>
				<li>
					<a href="<%=basePath%>/news.jsp">
						<span class="glyphicon glyphicon glyphicon-lock">比赛新闻</span>
					</a>
				</li>
				<li>
					<a href="<%=basePath%>/info.jsp">
						<span class="glyphicon glyphicon-book">比赛信息</span>
					</a>
				</li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
		<div class="btn-group menubar-right">
			<button id="login" type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
				注册/登录 <span class="caret"></span>
			</button>
			<ul class="dropdown-menu" role="menu">
				<li>
					<a href="<%=basePath%>/regist.jsp" id="item1">注册</a>
				</li>
				<li>
					<a href="<%=basePath%>/login.jsp" id="item2">登录</a>
				</li>
			</ul>
		</div>
	</div>
</div>
<script src="<%=basePath%>/js/jquery.min.js"></script>
<!-- 包含了所有编译插件 -->
<script src="<%=basePath%>/js/bootstrap.min.js"></script>
<script src="<%=basePath%>/js/main.js"></script>

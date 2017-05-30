<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta charset="UTF-8">
<title>普通用户管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="<%=basePath%>/css/style.css">
<link rel="stylesheet" href="<%=basePath%>/css/bootstrap.css">
</head>

<body onload="today()">
	<jsp:include page="../header.jsp" />
	<div class="maincontent">
		<div class="container">
			<div class="row clearfix">
				<div class="col-xs-2 column">
					<nav class="bs-docs-sidebar hidden-print hidden-xs hidden-sm affix">
					<ul class="nav bs-docs-sidenav">
						<li>
							<a href="<%=basePath%>/NormalUserPages/FillInfo.jsp" class="editor">个人信息填写/修改</a>
						</li>
						<li>
							<a href="<%=basePath%>/NormalUserPages/EnrollComp.jsp" class="widgets">报名参加比赛</a>
						</li>
						<li>
							<a href="<%=basePath%>/NormalUserPages/UploadWork.jsp" class="calendar">参赛作品上传</a>
						</li>
						<li>
							<a href="<%=basePath%>/NormalUserPages/ModifyPassword.jsp" class="calendar">修改密码</a>
						</li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>

	<div>
		<s:actionmessage />
	</div>


	<script src="<%=basePath%>/js/main.js"></script>
</body>
</html>
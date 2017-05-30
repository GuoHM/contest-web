<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>普通用户管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/bootstrap.css">
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
							<a href="FillInfo.jsp" class="editor">个人信息填写/修改</a>
						</li>
						<li>
							<a href="EnrollComp.jsp" class="widgets">报名比赛/修改报名信息</a>
						</li>
						<li>
							<a href="UploadWork.jsp" class="calendar">参赛作品上传</a>
						</li>
						<li>
							<a href="ModifyPassword.jsp" class="calendar">修改密码</a>
						</li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>

	<script src="../js/main.js"></script>
</body>
</html>
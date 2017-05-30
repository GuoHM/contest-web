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
							<a href="EnrollComp.jsp" class="widgets">报名参加比赛</a>
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
				<div class="col-xs-5 column">
					<form class="form-horizontal" role="form" method="post">
						<div class="form-group">
							<label class="col-sm-4 control-label">请输入旧密码</label>
							<div class="col-sm-7">
								<input type="password" class="form-control" name="name" placeholder="请输入旧密码"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">请输入新密码</label>
							<div class="col-sm-7">
								<input type="password" class="form-control" name="name" placeholder="请输入新密码"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">请重复新密码</label>
							<div class="col-sm-7">
								<input type="password" class="form-control" name="name" placeholder="请重复新密码"
									required="required">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<label class="checkbox-inline">
									<input type="submit" value="提交">
								</label>
								<label class="checkbox-inline">
									<input type="reset" value="重置">
								</label>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script src="../js/main.js"></script>
</body>
</html>
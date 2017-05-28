<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>学校负责人</title>
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
							<a href="WorksInfo.jsp" class="editor">删查改报名信息</a>
						</li>
						<li>
							<a href="ListStudent.jsp" class="elements">查看报名学生信息</a>
						</li>
						<li>
							<a href="ModifyPassword.jsp" class="elements">修改密码</a>
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
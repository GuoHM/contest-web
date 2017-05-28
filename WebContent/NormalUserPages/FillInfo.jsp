<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
							<a href="FillInfo.jsp" class="editor">个人信息填写</a>
						</li>
						<li>
							<a href="ModifyInfo.jsp" class="elements">个人信息修改</a>
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
							<label class="col-sm-4 control-label">姓名</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入名字" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">性别</label>
							<div>
								<label class="checkbox-inline">
									<input type="radio" name="man" value="man" checked>
									男
								</label>
								<label class="checkbox-inline">
									<input type="radio" name="women" value="woman">
									女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">学校</label>
							<div>
								<label class="checkbox-inline">
									<select class="form-control">

									</select>
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">年级</label>
							<div>
								<label class="checkbox-inline">
									<select class="form-control">
										<option>大一</option>
										<option>大二</option>
										<option>大三</option>
										<option>大四</option>
									</select>
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">专业</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="major" placeholder="请输入专业" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">学院</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" placeholder="请输入所属学院" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">身份证号</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" placeholder="请输入身份证" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">学号</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" placeholder="请输入学号" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">联系电话</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" placeholder="请输入电话" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">EMAIL</label>
							<div class="col-sm-7">
								<input type="email" class="form-control" placeholder="请输入email" required="required">
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
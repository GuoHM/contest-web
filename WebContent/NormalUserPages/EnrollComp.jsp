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
					<div class="alert alert-success">
						<h4>报名须知</h4>
						<p>
							1.参赛队员必须属于<strong>同一学校</strong>，且为全日制<strong>本科或专科学校</strong>在读学生
						</p>
						<p>
							2.每一位参赛队员必须先<strong>注册成为普通用户且填写好个人信息</strong>后，方可报名参赛
						</p>
					</div>
					<form class="form-horizontal" role="form" method="post">
						<div class="form-group">
							<label class="col-sm-4 control-label">队名</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入队名" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">作品名称</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入作品名" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">作品类别</label>
							<div>
								<label>
									<input type="radio" name="man" value="1" checked>
									多媒体
								</label>
								<label>
									<input type="radio" name="women" value="2">
									数据库
								</label>
								<label>
									<input type="radio" name="women" value="2">
									web网站
								</label>
								<label>
									<input type="radio" name="women" value="2">
									程序设计
								</label>
								<label>
									<input type="radio" name="women" value="2">
									企业合作和外包
								</label>
								<label>
									<input type="radio" name="women" value="2">
									智慧城市
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
							<label class="col-sm-4 control-label">队员1身份证</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入身份证" required="required">
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-4 control-label">队员2身份证</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入身份证" required="required">
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-4 control-label">队员3身份证</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入身份证" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">指导老师姓名</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入名字" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">指导老师电话</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" placeholder="请输入电话" required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">作品描述</label>
							<div class="col-sm-7">
								<textarea class="form-control col-sm-4" rows="4"></textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<label class="checkbox-inline">
									<input type="submit" value="生成报名表预览">
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
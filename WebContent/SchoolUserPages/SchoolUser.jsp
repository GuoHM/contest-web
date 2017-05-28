<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<head>
<meta charset="UTF-8">
<title>学校负责人</title>
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
							<a href="<%=basePath%>/SchoolUserPages/WorksInfo.jsp" class="editor">删查改报名信息</a>
						</li>
						<li>
							<a href="<%=basePath%>/SchoolUserPages/ListStudent.jsp" class="elements">查看报名学生信息</a>
						</li>
						<li>
							<a href="<%=basePath%>/SchoolUserPages/ModifyPassword.jsp" class="elements">修改密码</a>
						</li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>

	<script src="<%=basePath%>/js/main.js"></script>
</body>
</html>
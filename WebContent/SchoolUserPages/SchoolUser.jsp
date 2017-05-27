<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<head>
    <meta charset="UTF-8">
    <title>学校负责人</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="<%=basePath%>/css/style.css">
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap.css">
</head>
<body onload="today()">

<div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
    <div class="navbar-header ">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#" name="date"></a>
    </div>
    <div class="collapse navbar-collapse menubar-left">
        <ul class="nav navbar-nav">
            <li class="active"><a href="<%=basePath%>/index.jsp"><span class="glyphicon glyphicon-home">首页</span></a></li>
            <li><a href="<%=basePath%>/news.jsp"><span class="glyphicon glyphicon glyphicon-lock">比赛新闻</span></a></li>
            <li><a href="<%=basePath%>/info.jsp"><span class="glyphicon glyphicon-book">比赛信息</span></a></li>
        </ul>
    </div><!-- /.nav-collapse -->


</div>

<div class="maincontent">
    <div class="container">
        <div class="row clearfix">
            <div class="col-xs-2 column">
                <nav class="bs-docs-sidebar hidden-print hidden-xs hidden-sm affix">
                    <ul class="nav bs-docs-sidenav">
                        <li><a href="<%=basePath%>/SchoolUserPages/WorksInfo.jsp" class="editor">删查改报名信息</a></li>
                        <li><a href="<%=basePath%>/SchoolUserPages/ListStudent.jsp" class="elements">查看报名学生信息</a></li>
                        <li><a href="<%=basePath%>/SchoolUserPages/ModifyPassword.jsp" class="elements">修改密码</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>

<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 包含了所有编译插件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<%=basePath%>/js/main.js"></script>
</body>
</html>
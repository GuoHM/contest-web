<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="bean.*"%>
<%@page import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<script src="<%=basePath%>/js/bootstrap-table.js"></script>
<script src="<%=basePath%>/js/bootstrap-table-zh-CN.js"></script>
<link href="<%=basePath%>/css/bootstrap-table.css" rel="stylesheet" />

<div class="panel-body" style="padding-bottom: 0px;">

	<table class="table table-hover" id="showWorksTable">
		<thead>
			<tr>
				<th data-field="teamNo" data-sortable="true">队伍号</th>
				<th data-field="teamName">队名</th>
				<th data-field="worksName">作品名</th>
				<th data-field="types">类型</th>
				<th data-field="school">学校</th>
				<th data-field="teacher">指导老师</th>
				<th data-field="teacherPhone">指导老师电话</th>
				<!-- 在此省略表格列的代码，代码和上面差不多 -->
				<th class="col-xs-2" data-field="action">查看</th>
			</tr>
		</thead>
		<tbody>
			<%
				ResourceBundle res = ResourceBundle.getBundle("school");
				ResourceBundle type = ResourceBundle.getBundle("type");
				List<Teaminfo> teamslist = (List) session.getAttribute("teamslist");
				int i=1;
				if (teamslist != null) {
					for (Teaminfo n : teamslist) {
						out.print("<tr>");
						out.print("<td>" + n.getId().getTeamNo() + "</td>");
						out.print("<td>" + n.getId().getTeamName() + "</td>");
						out.print("<td>" + n.getId().getWorksName() + "</td>");
						out.print("<td>" + type.getString(n.getId().getTypes()) + "</td>");
						out.print("<td>" + res.getString(n.getId().getSchool()) + "</td>");
						out.print("<td>" + n.getId().getTeacher() + "</td>");
						out.print("<td>" + n.getId().getTeacherPhone() + "</td>");
						out.print("<td><a  data-toggle=\"modal\" data-target=\"#modify\" onclick=\"modifyEnroll("+i+")\">修改</a></td>");
						out.print("</tr>");
						i++;
					}
				}
			%>
		</tbody>
	</table>


	<script type="text/javascript">
	   function onclick(n) {
	       
	   }
	</script>


	<div class="modal fade" id="modify" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">队伍信息</h4>
				</div>
				<div class="alert alert-success">
					<h4>报名须知</h4>
					<p>
						1.参赛队员必须属于<strong>同一学校</strong>，且为全日制<strong>本科或专科学校</strong>在读学生
					</p>
					<p>
						2.每一位参赛队员必须先<strong>注册成为普通用户且填写好个人信息</strong>后，方可报名参赛
					</p>
				</div>
				<s:actionerror />
				<s:actionmessage />
				<form class="form-horizontal" role="form" method="post" id="enroll" action="enroll">
					<div class="form-group">
						<label class="col-sm-4 control-label">队名</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="teamname" placeholder="请输入队名"
								required="required" value="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">作品名称</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="worksname" placeholder="请输入作品名"
								required="required" value="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">作品类别</label>
						<div>
							<label>
								<input type="radio" name="type" id="type" value="1">
								多媒体
							</label>
							<label>
								<input type="radio" name="type" id="type" value="2">
								数据库
							</label>
							<label>
								<input type="radio" name="type" id="type" value="3">
								web网站
							</label>
							<label>
								<input type="radio" name="type" id="type" value="4">
								程序设计
							</label>
							<label>
								<input type="radio" name="type" id="type" value="5">
								企业合作和外包
							</label>
							<label>
								<input type="radio" name="type" id="type" value="6">
								智慧城市
							</label>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">学校</label>
						<div>
							<label class="checkbox-inline">
								<select class="form-control" id="school" name="school">
									<jsp:include page="../UtilPages/getAllSchool.jsp"></jsp:include>
								</select>
							</label>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-4 control-label">队员1身份证</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="id" placeholder="请输入身份证" required="required"
								value="">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-4 control-label">队员2身份证</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="id1" placeholder="请输入身份证" required="required"
								value="">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-4 control-label">队员3身份证</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="id2" placeholder="请输入身份证" required="required"
								value="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">指导老师姓名</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="teacher" placeholder="请输入名字"
								required="required" value="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">指导老师电话</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="teacherphone" placeholder="请输入电话"
								required="required" value="">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">作品描述</label>
						<div class="col-sm-7">
							<textarea class="form-control col-sm-4" rows="4" name="description"></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<label class="checkbox-inline">
								<input type="submit" value="提交" class="btn btn-default">
							</label>
							<label class="checkbox-inline">
								<input type="reset" value="重置" class="btn btn-default">
							</label>
						</div>
					</div>
				</form>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal -->
</div>



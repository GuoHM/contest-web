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

	<table class="table table-hover" id="showWorksTable" data-pagination="true"
		data-show-refresh="true" data-show-toggle="true" data-showColumns="true">
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
						out.print("<td><a  data-toggle=\"modal\" data-target=\"#myModal\">编辑</a></td>");
						out.print("</tr>");
					}
				}
			%>
		</tbody>
	</table>


	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
				</div>
				<div class="modal-body">在这里添加一些文本</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">提交更改</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

</div>

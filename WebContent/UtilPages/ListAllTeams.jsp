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
				<jsp:include page="../UtilPages/EnrollPages.jsp"></jsp:include>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal -->
</div>



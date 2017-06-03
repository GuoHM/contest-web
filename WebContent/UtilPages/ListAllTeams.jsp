<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="bean.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<table class="table table-condensed table-bordered table-hover">
	<thead>
		<tr>
			<th>队伍号</th>
			<th>队名</th>
			<th>作品名</th>
			<th>作品类型</th>
			<th>学校</th>
			<th>指导老师</th>
			<th>指导老师联系电话</th>
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
					out.print("<td>" + n.getId().getSchool() + "</td>");
					out.print("<td>" + n.getId().getTeacher() + "</td>");
					out.print("<td>" + n.getId().getTeacherPhone() + "</td>");
					out.print("</td>");
				}
			}
		%>
	</tbody>
</table>
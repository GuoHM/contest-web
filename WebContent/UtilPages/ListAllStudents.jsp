<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="bean.Normaluser"%>
<!DOCTYPE html>
<table class="table table-condensed table-bordered table-hover">
	<thead>
		<tr>
			<th>用户名</th>
			<th>姓名</th>
			<th>性别</th>
			<th>电话</th>
			<th>Email</th>
			<th>学校</th>
			<th>年级</th>
			<th>专业</th>
			<th>学院</th>
			<th>学号</th>
			<th>参赛队号</th>
		</tr>
	</thead>
	<tbody>
		<%
			ResourceBundle res = ResourceBundle.getBundle("school");
			List<Normaluser> userlist = (List) session.getAttribute("userlist");
			if (userlist != null) {
				String sex = null;
				for (Normaluser n : userlist) {
					out.print("<tr>");
					out.print("<td>" + n.getUserId() + "</td>");
					out.print("<td>" + n.getName() + "</td>");
					switch (n.getSex()) {
					case 1:
						sex = "男";
						break;
					case 2:
						sex = "女";
						break;
					}
					out.print("<td>" + sex + "</td>");
					out.print("<td>" + n.getPhone() + "</td>");
					out.print("<td>" + n.getEmail() + "</td>");
					out.print("<td>" + res.getString(n.getUniversityNo()) + "</td>");
					out.print("<td>" + res.getString(n.getGrade()) + "</td>");
					out.print("<td>" + n.getMajor() + "</td>");
					out.print("<td>" + n.getCollege() + "</td>");
					out.print("<td>" + n.getSno() + "</td>");
					out.print("<td>" + n.getTeamNo() + "</td>");
					out.print("</tr>");
				}
			}
			session.removeAttribute("userlist");
			session.removeAttribute("schoolname");
		%>
	</tbody>
</table>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="bean.Schooluser"%>
<!DOCTYPE html>
<table class="table table-condensed table-bordered table-hover">
	<thead>
		<tr>
			<th>学校</th>
			<th>姓名</th>
			<th>电话</th>
			<th>Email</th>
		</tr>
	</thead>
	<tbody>
		<%
			ResourceBundle res = ResourceBundle.getBundle("school");
			List<Schooluser> schooluserlist = (List<Schooluser>) session.getAttribute("schooluserlist");
			if (schooluserlist != null) {
				for (Schooluser i : schooluserlist) {
					out.print("<tr>");
					out.print("<td>" + res.getString(i.getSchooluserId()) + "</td>");
					out.print("<td>" + i.getName() + "</td>");
					out.print("<td>" + i.getPhone() + "</td>");
					out.print("<td>" + i.getEmail() + "</td>");
					out.print("</tr>");
				}
			}
		%>
	</tbody>
</table>
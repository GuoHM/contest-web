<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="alert alert-success">
<%@ taglib prefix="s" uri="/struts-tags"%>
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
			<input type="text" class="form-control" name="teamname" placeholder="请输入队名" required="required">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">作品名称</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" name="worksname" placeholder="请输入作品名" required="required">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">作品类别</label>
		<div>
			<label>
				<input type="radio" name="type" id="type" value="1" checked>
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
			<input type="text" class="form-control" name="id" placeholder="请输入身份证" required="required">
		</div>
	</div>

	<div class="form-group">
		<label class="col-sm-4 control-label">队员2身份证</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" name="id1" placeholder="请输入身份证" required="required">
		</div>
	</div>

	<div class="form-group">
		<label class="col-sm-4 control-label">队员3身份证</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" name="id2" placeholder="请输入身份证" required="required">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">指导老师姓名</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" name="teacher" placeholder="请输入名字" required="required">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">指导老师电话</label>
		<div class="col-sm-7">
			<input type="text" class="form-control" name="teacherphone" placeholder="请输入电话"
				required="required">
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
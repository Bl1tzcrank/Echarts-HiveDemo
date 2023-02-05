<%@ page language="java" contentType="text/html; charset=utf-8"
		 isELIgnored="false"
		 pageEncoding="utf-8"%>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<article class="page-container">
		<div style="width:100%;text-align:center">
			<form action="/alter" method="post" class="horizontal-form" >

				<div class="row-fluid">
					<label class="control-label">编号</label>
					<div class="controls" >
						<input type="text" name="id" value="${bikes.id }" >
					</div>
				</div>

				<div class="row-fluid">
					<label class="control-label">状态</label>
					<div class="controls">
						<input type="text"  name="status" value="${bikes.status }">
					</div>
				</div>

				<div class="row-fluid">
					<label class="control-label">纬度</label>
					<div class="controls">
						<input type="text"  name="latitude" value="${bikes.latitude }">
					</div>
				</div>

				<div class="row-fluid">
					<label class="control-label">经度</label>
					<div class="controls">
						<input type="text"  name="longitude" value="${bikes.longitude }">
					</div>
				</div>


				<div class="row-fluid">
					<label class="control-label">省</label>
					<div class="controls">
						<input type="text"  name="province" value="${bikes.province }">
					</div>
				</div>


				<div class="row-fluid">
					<label class="control-label">市</label>
					<div class="controls">
						<input type="text"  name="city" value="${bikes.city }">
					</div>
				</div>


				<div class="row-fluid">
					<label class="control-label">区</label>
					<div class="controls">
						<input type="text"  name="country" value="${bikes.country }">
					</div>
				</div>

				<div class="form-actions">
					<button type="submit" class="btn blue">
						<i class="icon-ok"></i> 提交
					</button>
					<button type="button" class="btn" ><a href="/bike_list" style="text-decoration: none;color: #1F1F1F">取消</a></button>
				</div>


			</form>
		</div>


</article>

</body>
</html>
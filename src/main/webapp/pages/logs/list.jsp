<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
	<meta charset="UTF-8" />
	<meta name="renderer" content="webkit|ie-comp|ie-stand" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,bike-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="Bookmark" href="/favicon.ico"/>
	<link rel="Shortcut Icon" href="/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="/static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/H-ui.admin.css"/>
	<link rel="stylesheet" type="text/css" href="/static/lib/Hui-iconfont/1.0.8/iconfont.css"/>
	<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/skin/default/skin.css" id="skin"/>
	<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/style.css"/>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 单车管理 <span class="c-gray en">&gt;</span> 单车信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">

	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l">
			<a href="javascript:;" onclick="bike_dels()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
			<a class="btn btn-primary radius" data-title="添加资讯" data-href="article-add.html" onclick="bike_add('添加单车','/bike_add','','510')" href="/AddServlet"><i class="Hui-iconfont">&#xe600;</i> 添加单车</a>
		</span>
	</div>
	<div class="mt-20">
		<form id="table-form">
			<table class="table table-border table-bordered table-bg table-hover table-sort" width="100%">
				<thead>
					<tr class="text-c">
						<th width="100">编号</th>
						<th>状态</th>
						<th>纬度</th>
						<th>经度</th>
						<th>省</th>
						<th>市</th>
						<th>区</th>
						<th width="80">操作</th>
					</tr>
				</thead>
				<tbody>
				<!-- ulist是servlet放到serssion中的，这里循环把他们取出来 -->
				<c:forEach items="${bike_list}" var="list">
					<tr>
						<td>${list.id }</td>
						<td>${list.status }</td>
						<td>${list.latitude }</td>
						<td>${list.longitude }</td>
						<td>${list.province }</td>
						<td>${list.city }</td>
						<td>${list.country }</td>
						<td>
							<a href="EditServlet?id=${list.id }">修改</a>
							<a href="DeleteServlet?id=${list.id}" onclick="javascript:return confirm('确认删除编号为${list.id}的单车吗？');">删除</a>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</form>
	</div>
</div>

<script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="/static/lib/laypage/1.2/laypage.js"></script>

</body>
</html>
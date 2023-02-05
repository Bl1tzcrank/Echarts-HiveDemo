<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="renderer" content="webkit|ie-comp|ie-stand" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
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
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"><a class="logo navbar-logo f-l mr-10 hidden-xs" href="/">Data Analysis</a>
                <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/"></a>
                <span class="logo navbar-slogan f-l mr-10 hidden-xs"></span>
                <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
                <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li id="user_name"></li>
                    <li class="dropDown dropDown_hover"><a href="#" class="dropDown_A"> <font id="account"></font> <i
                            class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <!--
                            <li><a href="#">个人信息</a></li>
                             -->
                            <li><a href="/logout">切换账户</a></li>
                            <li><a href="/logout">退出</a></li>
                        </ul>
                    </li>

                    <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">0</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>

                    <li id="Hui-skin" class="dropDown right dropDown_hover">
                        <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（蓝色）">默认（蓝色）</a></li>
                            <li><a href="javascript:;" data-val="black" title="黑色">黑色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<aside class="Hui-aside">
    <input runat="server" id="divScrollValue" type="hidden" value=""/>
    <div class="menu_dropdown bk_2">

        <%--<dl id="menu-comments">--%>
            <%--<dt><i class="Hui-iconfont">&#xe627;</i>数据管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>--%>
            <%--<dd>--%>
                <%--<ul>--%>
                    <%--<li><a data-href="/score_list" data-title="用户消费数据" href="javascript:;">用户消费数据</a></li>--%>
                <%--</ul>--%>
                <%--<ul>--%>
                    <%--<li><a data-href="/score_list" data-title="区域分布数据" href="javascript:;">区域分布数据</a></li>--%>
                <%--</ul>--%>
                <%--<ul>--%>
                    <%--<li><a data-href="/score_list" data-title="每日销量数据" href="javascript:;">每日销量数据</a></li>--%>
                <%--</ul>--%>
            <%--</dd>--%>
        <%--</dl>--%>
        <dl id="menu-charts">
            <dt><i class="Hui-iconfont">&#xe61e;</i>Charts<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="/charts/visit" data-title="Visit" >Visit</a></li>
                </ul>
                <%--<ul>--%>
                    <%--<li><a data-href="/charts/charge" data-title="Example" >Example</a></li>--%>
                <%--</ul>--%>
                <ul>
                    <li><a data-href="/charts/funnel" data-title="Funnel" >Funnel</a></li>
                </ul>
                <ul>
                    <li><a data-href="/charts/category" data-title="Category" >Category</a></li>
                </ul>
                <ul>
                    <li><a data-href="/charts/time" data-title="Time" >TimeVisit</a></li>
                </ul>
                <ul>
                    <li><a data-href="/charts/week" data-title="Time" >WeekdayVisit</a></li>
                </ul>
                <ul>
                    <li><a data-href="/charts/buy" data-title="Time" >Buy</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a>
</div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active"><span title="我的桌面" data-href="/welcome">我的桌面</span><em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a>
            <a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a>
        </div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="/welcome"></iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前</li>
        <li id="closeall">关闭全部</li>
    </ul>
</div>

<script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="/static/lib/laypage/1.2/laypage.js"></script>

<script type="text/javascript">
    $(function(){
        $.ajax({
            url : "/user_info",
            type : "get",
            dataType : "json",
            success: function(user){
                $("#user_name").text(user.name)
                $("#account").text(user.account)
            }
        });
    });
</script>

</body>
</html>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <title></title>
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/插件css/animate/animate.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/style.min.css" rel="stylesheet">
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">

        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <span><img alt="image" class="img-circle" src="${domainUrl}/assets/images/profile_small.jpg" /></span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold">Beaut-zihan</strong></span>
                                <span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                                </span>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a class="J_menuItem" href="">修改头像</a>
                            </li>
                            <li><a class="J_menuItem" href="">个人资料</a>
                            </li>
                            <li><a class="J_menuItem" href="">联系我们</a>
                            </li>
                            <li><a class="J_menuItem" href="">信箱</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="">安全退出</a>
                            </li>
                        </ul>
                    </div>
                    <div class="logo-element">H+
                    </div>
                </li>
                <li>
                    <a href="#">
                        <span class="nav-label">服务模块</span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a  href="">服务项目</a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a class="J_menuItem" href="">服务列表</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${domainUrl}/rest/serve/services/serveServices">添加服务</a>
                                    </li>
                                </ul>
                        </li>
                        <li>
                            <a  href="">服务类别</a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a class="J_menuItem" href="">服务类别列表</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${domainUrl}/rest/serve/classify/serveClassify">添加服务类别</a>
                                    </li>
                                </ul>
                        </li>
                        <li>
                            <a  href="">计费模板</a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a class="J_menuItem" href="${domainUrl}/rest/serve/cost/serveCostFindAll">计费模板列表</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${domainUrl}/rest/serve/cost/serveCost">添加计费模板</a>
                                    </li>
                                </ul>
                        </li>
                        <li>
                            <a href="">服务人员</a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a class="J_menuItem" href="${domainUrl}/rest/serve/staff/serveStaffFindAll">服务人员列表</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${domainUrl}/rest/serve/staff/serveSta">添加服务人员</a>
                                    </li>
                                </ul>
                        </li>
                    </ul>

                </li>
                <#--<li>-->
                    <#--<a href="#"><span class="nav-label">表单</span></a>-->
                    <#--<ul class="nav nav-second-level">-->
                        <#--<li>-->
                            <#--<a href="#">文件上传 </a>-->
                            <#--<ul class="nav nav-third-level">-->
                                <#--<li><a class="J_menuItem" href="form_webuploader.html">百度WebUploader</a>-->
                                <#--</li>-->
                                <#--<li><a class="J_menuItem" href="form_file_upload.html">DropzoneJS</a>-->
                                <#--</li>-->
                                <#--<li><a class="J_menuItem" href="form_avatar.html">头像裁剪上传</a>-->
                                <#--</li>-->
                            <#--</ul>-->
                        <#--</li>-->
                    <#--</ul>-->
                <#--</li>-->
            </ul>
        </div>
    </nav>
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" method="post" action="search_results.html">
                        <div class="form-group">
                            <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                        </div>
                    </form>
                </div>

            </nav>
        </div>
        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"><<</i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content">
                    <a href="javascript:;" class="active J_menuTab" data-id="index_v1.html">首页</a>
                </div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward">>></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabShowActive"><a>定位当前选项卡</a>
                    </li>
                    <li class="divider"></li>
                    <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="login.html" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
        </div>
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="" frameborder="0" data-id="" seamless></iframe>
        </div>

    </div>
    <!--右侧部分结束-->
</div>
<script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
<script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
<script src="${domainUrl}/assets/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${domainUrl}/assets/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="${domainUrl}/assets/js/plugins/layer/layer.min.js"></script>
<script src="${domainUrl}/assets/js/hplus.min.js"></script>
<script type="text/javascript" src="${domainUrl}/assets/js/contabs.min.js"></script>
</body>

</html>
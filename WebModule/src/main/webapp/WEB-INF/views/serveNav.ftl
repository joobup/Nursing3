<html>
<head>
    <link href="${domainUrl}/assets/css/serve/servePublic.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/OutCss/page/page.css" rel="stylesheet" >
    <link href="${domainUrl}/assets/css/OutCss/date/jquery.data_input.pack.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/OutCss/upload/diyUpload.css" rel="stylesheet" >
    <link href="${domainUrl}/assets/css/OutCss/upload/webuploader.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script src="${domainUrl}/assets/js/serve/sideUrl.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
    <meta charset="utf-8"/>
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}' + "/rest";
    var domainImg = '${domainUrl}';
    var domainFile = '${domainUrl}';
</script>
<body>
<div class="main">
<#include "/common/serveHead.ftl"/>
    <div class="main-body">
        <#--侧边栏-->

        <div id="main-side">
            <ul id="sideList" class="accordion">
                <li>
                    <div class="link"><i class="glyphicon glyphicon-plus-sign"></i>服务模块<i class="glyphicon glyphicon-chevron-up"></i></div>
                    <ul class="submenu">
                        <li><a onclick="sideUrl('/serve/services/servicesB')">服务</a></li>
                        <li><a onclick="sideUrl('/serve/classify/classify')">类别</a></li>
                        <li><a onclick="sideUrl('/serve/cost/cost')">计费</a></li>
                        <li><a onclick="sideUrl('/serve/staff/staffB')">员工</a></li>
                        <li><a onclick="sideUrl('/serve/pack/packB')">打包</a></li>
                    </ul>
                </li>
                <li>
                    <div class="link"><i class="glyphicon glyphicon-plus-sign"></i>老人模块<i class="glyphicon glyphicon-chevron-up"></i></div>
                    <ul class="submenu">
                        <li><a onclick="sideUrl('/oldMan/oldMan')">老人信息登记表</a></li>
                        <li><a onclick="sideUrl('/oldMan/oldManType')">服务对象类型</a></li>
                        <li><a onclick="sideUrl('/oldMan/oldManRegister')">老人信息</a></li>
                        <li><a onclick="sideUrl('/oldMan/oldManState')">老人状态</a></li>
                    </ul>
                </li>
                <li>
                    <div class="link"><i class="glyphicon glyphicon-plus-sign"></i>饮食模块<i class="glyphicon glyphicon-chevron-up"></i></div>
                    <ul class="submenu">
                        <li><a onclick="sideUrl('/food/foodList')">饮食列表</a></li>
                        <li><a onclick="sideUrl('/food/foodClassify')">饮食分类</a></li>
                        <li><a onclick="sideUrl('/food/foodMaterial')">食材配料</a></li>
                    </ul>
                </li>
            </ul>
        </div>

        <#--主要内容显示-->
            <div id="main-show">
        </div>
        <#include "/common/foot.ftl"/>
</body>
</html>
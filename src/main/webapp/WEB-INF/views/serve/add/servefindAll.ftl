<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serve.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/serve.js"></script>
    <meta charset="utf-8"/>
    <title>查询服务</title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body>
<#include "/common/head.ftl"/>
<div id="main">
    <div class="w" style="height: 50px;">
        <div class="left-nav">
            <ul>
                <li onclick="zhedie()">
                    <a href="">服务项目<img src="${domainUrl}/assets/images/servenavxiala.png" alt=""></a>
                    <ul class="left-nav2" style="display: none;">
                        <li><a href="">所有服务</a></li>
                        <li><a href="">添加服务</a></li>
                    </ul>
                </li>
                <li><a href="">服务类别<img src="${domainUrl}/assets/images/servenavxiala.png" alt=""></a></li>
                <li><a href="">服务人员<img src="${domainUrl}/assets/images/servenavxiala.png" alt=""></a></li>
                <li><a href="">打包服务<img src="${domainUrl}/assets/images/servenavxiala.png" alt=""></a></li>
            </ul>
        </div>
        <div class="right-main"></div>
    </div>
</div>
</body>
</html>
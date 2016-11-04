<html>
<head>
    <link href="${domainUrl}/assets/css/serve/servePublic.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/OutCss/page/page.css" rel="stylesheet" >
    <link href="${domainUrl}/assets/css/OutCss/date/jquery.data_input.pack.css" rel="stylesheet">
    <link  href="${domainUrl}/assets/css/OutCss/upload/zyUpload.css" rel="stylesheet" type="text/css">
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script src="${domainUrl}/assets/js/serve/sideUrl.js"></script>
    <meta charset="utf-8"/>
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}' + "/rest";
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
                    <div class="link"><i class="fa fa-paint-brush"></i>服务模块<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a onclick="sideUrl('/serve/services/servicesP')">服务</a></li>
                        <li><a onclick="sideUrl('/serve/staff/staff')">员工</a></li>
                        <li><a onclick="sideUrl('/serve/classify/classify')">类别</a></li>
                        <li><a onclick="sideUrl('/serve/cost/cost')">计费</a></li>
                        <li><a onclick="sideUrl('/serve/pack/pack')">打包</a></li>
                    </ul>
                </li>
            </ul>
        </div>
            <style>
                .accordion {
                    width: 100%;
                    max-width: 360px;
                    margin: 30px auto 20px;
                    -webkit-border-radius: 4px;
                    -moz-border-radius: 4px;
                    border-radius: 4px;
                }
                .accordion .link {
                    cursor: pointer;
                    display: block;
                    padding: 15px 15px 15px 42px;
                    color: #fff;
                    font-size: 14px;
                    font-weight: 700;
                    border-bottom: 1px solid #CCC;
                    position: relative;
                    -webkit-transition: all 0.4s ease;
                    -o-transition: all 0.4s ease;
                    transition: all 0.4s ease;
                }

                .accordion li:last-child .link {
                    border-bottom: 0;
                }

                .accordion li i {
                    position: absolute;
                    top: 16px;
                    left: 12px;
                    font-size: 18px;
                    color: #595959;
                    -webkit-transition: all 0.4s ease;
                    -o-transition: all 0.4s ease;
                    transition: all 0.4s ease;
                }

                .accordion li i.fa-chevron-down {
                    right: 12px;
                    left: auto;
                    font-size: 16px;
                }

                .accordion li.open .link {
                    color: #fff;
                }

                .accordion li.open i {
                    color: #fff;
                }
                .accordion li.open i.fa-chevron-down {
                    -webkit-transform: rotate(180deg);
                    -ms-transform: rotate(180deg);
                    -o-transform: rotate(180deg);
                    transform: rotate(180deg);
                }
                .submenu {
                    display: none;
                    background: #444359;
                    font-size: 14px;
                }

                .submenu li {
                    border-bottom: 1px solid #4b4a5e;
                }

                .submenu a {
                    display: block;
                    text-decoration: none;
                    color: #d9d9d9;
                    padding: 12px;
                    padding-left: 42px;
                    -webkit-transition: all 0.25s ease;
                    -o-transition: all 0.25s ease;
                    transition: all 0.25s ease;
                }

                .submenu a:hover {
                    background: #b63b4d;
                    color: #FFF;
                }
            </style>
        <#--主要内容显示-->
            <div id="main-show">
        </div>
        <#include "/common/foot.ftl"/>
</body>
</html>
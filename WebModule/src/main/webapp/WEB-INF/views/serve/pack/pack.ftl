<html>
<head>
    <link href="${domainUrl}/assets/css/serve/serve.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/serve/servePublic.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/OutCss/animate/animate.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script src="${domainUrl}/assets/js/serve/pack.js"></script>
    <meta charset="utf-8"/>
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}' + "/rest";
</script>
<body>
<div class="main">
<#include "/common/serveHead.ftl"/>
    <div class="main-body">
        <div id="main-side">
            <ul>
                <a href="${domainUrl}">
                    <li class="side-list" id="serve">服务模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/classify/classif">
                    <li class="side-list" id="ify">类别模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/cost/cost">
                    <li class="side-list" id="cost">计费模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/staff/staff">
                    <li class="side-list" id="staff">员工模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/pack/pack">
                    <li class="side-list  b" id="pack">打包模块</li>
                </a>

            </ul>
        </div>
        <div id="main-show">
            <div id="now-position">
                您当前所在的位置：<span>打包模块</span>
            </div>
            <div class="serve-banner">
                <an><input type="button" id="cao" value="打包服务" data-toggle="modal" data-target="#myModal"> <input
                        type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no"><input
                        type="button" value="删除服务包" " id="shanchu-yes">
                </an>
            </div>
            <div class="serve-module">
            <div class="serve-module-s">
                    <i class="glyphicon glyphicon-pencil bianji"></i>
                    <i class=" shanchu"><img src="${domainUrl}/assets/images/serve/shanchu.png" xalt=""></i>
                    <ul id="zuo-font">
                        <li>服务标题<span>XXXXX</span></li>
                        <li>服务类别<span>XXXXX</span></li>
                        <li>限制条件<span>XXXXX</span></li>
                        <li>服务人数<span>XXXXX</span></li>
                    </ul>
                   <ul id="you-font1">
                       <li>服务简介</li>
                   </ul>
                    <ul id="you-font2">
                        <li>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
<#include "/common/foot.ftl"/>
<#--模态框-->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title  text-center" id="myModalLabel">
                        添加服务
                    </h3>
                </div>
                <div class="modal-body">
                    <table id="add">
                        <tr>
                            <td>服务名称</td>
                            <td><input type="text" id="name"></td>
                        </tr>
                        <tr>
                            <td>注意事项</td>
                            <td><input type="text" id="care"></td>
                        </tr>
                        <tr>
                            <td>费用折扣</td>
                            <td><input type="text" id="rebate"></td>
                        </tr>
                        <tr>
                            <td>有效时间</td>
                            <td><input type="text" id="enddate"></td>
                        </tr>
                        <tr>
                            <td>护理级别</td>
                            <td><input type="text" id="nurseify"></td>
                        </tr>
                        <tr>
                            <td>服务项</td>
                            <td><input type="text" id="serves"></td>
                        </tr>
                        <tr>
                            <td style="position: absolute; margin-top: 5px;">服务简介</td>
                            <td><textarea id="brief"></textarea><input type="text" id="xid" style="display: none;">
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" id="add-btn" onclick="add()">添加</button>
                    <button type="button" class="btn btn-primary" id="update-btn" onclick="update()"
                            style="display: none;">修改
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</div>
</body>
</html>
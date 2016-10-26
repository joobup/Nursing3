<html>
<head>
    <link href="${domainUrl}/assets/css/index2.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/插件css/animate/animate.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
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
<#include "/common/headss.ftl"/>
    <div class="main-body">
        <div id="main-side">
            <ul>
                <a href="${domainUrl}">
                    <li class="side-list" id="serve">服务模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/classify/classify2">
                    <li class="side-list b" id="ify">类别模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/cost/cost2">
                    <li class="side-list" id="cost">计费模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/staff/staff2">
                    <li class="side-list" id="staff">员工模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/pack/pack">
                    <li class="side-list" id="pack">打包模块</li>
                </a>
            </ul>
        </div>
        <div id="main-show">
            <div class="serve-banner">
                <span>您当前所在的位置：类别模块</span>
                <an><input type="button" id="cao" value="添加服务" data-toggle="modal" data-target="#myModal"> <input
                        type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no"><input
                        type="button" value="删除服务" " id="shanchu-yes">
                </an>
            </div>
            <div class="serve-module">

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
                            <td>服务类别</td>
                            <td><input type="text" id="leibie"></td>
                        </tr>
                        <tr>
                            <td>服务标题</td>
                            <td><input type="text" id="mingcheng"></td>
                        </tr>
                        <tr>
                            <td>限制条件</td>
                            <td><input type="text" id="tiaojian"></td>
                        </tr>
                        <tr>
                            <td>服务人数</td>
                            <td><input type="text" id="renshu"></td>
                        </tr>
                        <tr>
                            <td style="position: absolute; margin-top: 5px;">服务简介</td>
                            <td><textarea id="jianjie"></textarea><input type="text" id="xid" style="display: none;">
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
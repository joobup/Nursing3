<html>
<head>
    <link href="${domainUrl}/assets/css/serve/staff.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/serve/servePublic.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/OutCss/page/page.css" rel="stylesheet" >
    <!-- 引用控制层插件样式 -->
    <link rel="stylesheet" href="${domainUrl}/assets/css/OutCss/upload/zyUpload.css" type="text/css">
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script src="${domainUrl}/assets/js/OutJs/page/page.js"></script>
    <script src="${domainUrl}/assets/js/serve/staff.js"></script>
    <!-- 引用初始化JS -->
    <script src="${domainUrl}/assets/js/OutJs/upload/initial.js"></script>
    <!-- 引用核心层插件 -->
    <script src="${domainUrl}/assets/js/OutJs/upload/zyFile.js"></script>
    <!-- 引用控制层插件 -->
    <script src="${domainUrl}/assets/js/OutJs/upload/zyUpload.js"></script>
    <meta charset="utf-8" />
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
    var domainFile = '${domainUrl}';
</script>
<body onload="findAllb(1)">
<div class="main">
<#include "/common/serveHead.ftl"/>
    <div class="main-body">
        <div id="main-side">
            <ul>
                <a href="${domainUrl}">
                    <li class="side-list" id="serve">服务模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/classify/classify">
                    <li class="side-list" id="ify">类别模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/cost/cost">
                    <li class="side-list" id="cost">计费模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/staff/staff">
                    <li class="side-list b" id="staff">员工模块</li>
                </a>
                <a href="${domainUrl}/rest/serve/pack/pack">
                    <li class="side-list" id="pack">打包模块</li>
                </a>
            </ul>
        </div>
        <div id="main-show">
            <div id="now-position">
                您当前所在的位置：<span>员工模块</span>
            </div>
            <div class="serve-banner">
                <an><input type="button" value="添加员工" id="cao" data-toggle="modal" data-target="#myModal">
                    <input type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no"><input type="button" value="删除员工" " id="shanchu-yes">
                    <a href="${domainUrl}/rest/serve/staff/staff"><input type="button" value="平铺显示"></a>
                </an>
            </div>
            <div class="serve-module">
                <table id="aaa">

                </table>
            </div>
        <#--分页-->
            <div class="tcdPageCode">
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
                        添加员工
                    </h3>
                </div>
                <div class="modal-body">
                    <table class="add">
                        <tr>
                            <td>员工姓名</td>
                            <td><input type="text" id="staffname"></td>
                        </tr>
                        <tr>
                            <td>员工性别</td>
                            <td><input type="text" id="staffsex"></td>
                        </tr>
                        <tr>
                            <td>员工职务</td>
                            <td><input type="text" id="staffpost"></td>
                        </tr>
                        <tr>
                            <td>技能等级</td>
                            <td><input type="text" id="staffskilllevel"></td>
                        </tr>
                        <tr>
                            <td>员工照片</td>
                            <td style="text-align: left;"><input type="button" value="添加员工主图" id="xxxx" class="btn btn-info"> </td>
                            <script>
                                $("#xxxx").click(function () {
                                    $("#demo").show(500);
                                })
                            </script>
                            <div id="demo" class="demo" style="display: none;position: absolute;z-index: 9999;"></div>
                        </tr>
                        <tr>
                            <td>员工部门</td>
                            <td><input type="text" id="staffdepartment"></td>
                        </tr>
                        <tr>
                            <td>身份证号</td>
                            <td><input type="text" id="staffcard"></td>
                        </tr>
                        <tr>
                            <td>联系方式1</td>
                            <td><input type="text" id="staffcall1"></td>
                        </tr>
                        <tr>
                            <td>联系方式2</td>
                            <td><input type="text" id="staffcall2"></td>
                        </tr>
                        <tr>
                            <td>员工权限</td>
                            <td><input type="text" id="staffrank"></td>
                        </tr>
                        <tr>
                            <td>工作状态</td>
                            <td><input type="text" id="staffstatus"><input type="text" id="xid"  style="display: none"></td>
                        </tr>
                    </table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" id="add-btn" onclick="add()">添加</button>
                    <button type="button" class="btn btn-primary" id="update-btn" onclick="update()" style="display: none;">修改</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</div>
</body>
</html>
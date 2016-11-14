<link href="${domainUrl}/assets/css/serve/serve.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/OutJs/date/jquery.date_input.pack.js"></script>
<script src="${domainUrl}/assets/js/serve/services.js"></script>
<script src="${domainUrl}/assets/js/serve/serveClassFindAll.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/diyUpload.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/webuploader.html5only.min.js"></script>
<script>
    findAllp(1);
</script>
<div id="now-position">
    您当前所在的位置：<span>服务模块</span>
</div>
<div style="position: absolute; top: 0; left: 0; right: 0; bottom: 0; background-color: #DDD; opacity: .5; z-index:999; display: none;" id="aaaa">
</div>
<div id="box">
    <div id="test" ></div>
</div>
<div class="serve-banner">
<#--时间控件-->
    <#--<div id="date-input">-->
        <#--<date>时间范围</date>-->
        <#--<input type="text" class="date_picker" value="2015-01-01" style="text-align: center">-->
        <#--<date>—</date>-->
        <#--<input type="text" class="date_picker" value="2016-01-01" style="text-align: center">-->
        <#--<date><input type="button" id="cao" value="搜索"></date>-->
    <#--</div>-->
    <an><input type="button" id="cao" value="添加服务" data-toggle="modal" data-target="#myModal" onclick="findAll()"> <input
            type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no"><input
            type="button" value="删除服务" " id="shanchu-yes">
        <input type="button" value="表格显示" onclick="sideUrl('/serve/services/servicesB')">
    </an>
</div>

<div class="serve-module">

</div>
<#--分页-->
<script src="${domainUrl}/assets/js/OutJs/page/page.js"></script>
<div class="tcdPageCode">
</div>
<#--添加服务模态框-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title  text-center" id="myModalLabel">
                    添加服务
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>服务类别</td>
                        <td><select id="sel1"></select></td>
                    </tr>
                    <tr style="display: none;" id="tr2">
                        <td></td>
                        <td><select id="sel2"></select></td>
                    </tr>
                    <tr style="display: none;" id="tr3">
                        <td></td>
                        <td><select id="sel3"></select></td>
                    </tr>
                    <tr>
                        <td>服务标题</td>
                        <td><input type="text" id="mingcheng" class="null"></td>
                    </tr>
                    <#--<tr>-->
                        <#--<td>服务图片</td>-->
                        <#--<td style="text-align: left;"><input type="button" value="添加服务主图" id="xxxx" class="btn btn-info"></td>-->
                        <#--<script>-->
                            <#--$("#xxxx").click(function () {-->
                                <#--$("#demo").show(500);-->
                            <#--})-->
                        <#--</script>-->
                        <#--<div id="demo" class="demo" style="position: absolute;z-index: 9999;display: none;"></div>-->
                    <#--</tr>-->
                    <tr>
                        <td>计费方式</td>
                        <td><select id="serveCost"></select></td>
                    </tr>
                    <tr>
                        <td>价格</td>
                        <td><input type="text" id="costPirce" onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="8"></td>
                    </tr>
                    <tr>
                        <td>限制条件</td>
                        <td><input type="text" id="tiaojian" class="null"></td>
                    </tr>
                    <tr>
                        <td>服务人数</td>
                        <td><input type="text" id="renshu" class="null" onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="8"></td>
                    </tr>
                    <tr>
                        <td style="position: absolute; margin-top: 5px;">服务简介</td>
                        <td><textarea id="jianjie" class="null"></textarea><input type="text" id="xid" style="display: none;">
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
<#--添加计费模态框-->
<div class="modal fade" id="myModalCost" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title  text-center" id="myModalLabel">
                    添加计费模板
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>计费方式</td>
                        <td><select class="serveCost" id="serveCost2"></select></td>
                    </tr>
                    <tr>
                        <td>价格</td>
                        <td><input type="text" id="costPirce2"></td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="add-cost"
                ">添加</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
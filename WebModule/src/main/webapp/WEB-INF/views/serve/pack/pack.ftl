<link href="${domainUrl}/assets/css/serve/pack.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
<script src="${domainUrl}/assets/js/OutJs/date/jquery.date_input.pack.js"></script>
<script src="${domainUrl}/assets/js/serve/pack.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/diyUpload.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/webuploader.html5only.min.js"></script>
<script>
    findAll(1);
</script>
<div id="now-position">
    您当前所在的位置：<span>打包模块</span>
</div>
<div class="serve-banner">
    <an><input type="button" id="cao" value="打包服务" data-toggle="modal" data-target="#myModal">
        <input type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no">
        <input type="button" value="删除服务包" " id="shanchu-yes">
        <input type="button" value="平铺显示" onclick="sideUrl('/serve/pack/packB')">
    </an>
</div>
<div style="position: absolute; top: 0; left: 0; right: 0; bottom: 0; background-color: #DDD; opacity: .5; z-index:999; display: none;" id="aaaa">

</div>
<div id="box">
    <div id="test" ></div>
</div>
<div class="serve-module">

</div>
<#--分页-->
<script src="${domainUrl}/assets/js/OutJs/page/page.js"></script>
<div class="tcdPageCode">
</div>
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
                <table class="add">
                    <tr>
                        <td>服务名称</td>
                        <td><input type="text" id="name"></td>
                        <td id="xid" style="display: none;"></td>
                    </tr>
                    <tr>
                        <td>服务项</td>
                        <td style="text-align: left;"><input type="button" value="选择服务项" class="btn btn-info" id="serveAdd"></td>
                        <div id="servePro"></div>
                    </tr>
                    <tr>
                        <td>注意事项</td>
                        <td><input type="text" id="care"></td>
                    </tr>
                    <tr>
                        <td>费用折扣</td>
                        <td><input type="text" id="rebate"></td>
                    </tr>
                <#--时间控件-->
                    <script type="text/javascript">
                        $(function () {
                            $('.date_picker').date_input();
                        })
                    </script>
                    <tr>
                        <td>有效时间</td>
                        <td><input type="text" id="sdate" class="date_picker" placeholder="开始时间" style="text-align: center"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="text" id="edate" class="date_picker" placeholder="结束时间" style="text-align: center"></td>
                    </tr>
                    <tr>
                        <td>护理级别</td>
                        <td><input type="text" id="nurseify"></td>
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

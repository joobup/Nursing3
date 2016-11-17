<link href="${domainUrl}/assets/css/serve/pack.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/institution/inspection/jcInspectionInput.js"></script>
<div id="now-position">
    您当前所在的位置：<span>检查模块</span>
</div>
<div class="serve-banner">
    <an><input type="button" id="cao" value="添加检查表" data-toggle="modal" data-target="#myModal" onclick="clearModal()">
    </an>
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
                    添加检查表
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>检查表名称</td>
                        <td><input type="text" id="inspectionName"></td>
                        <td style="display: none;"><input type="text" id="pullid"></td>
                    </tr>
                    <tr>
                        <td>健康状况项目</td>
                        <td><input type="button" value="请选择项目"  class="btn" onclick="itemList()"></td>
                    </tr>
                </table>
                <div style="width:100%; height: 300px; display: none; overflow: auto;" id="servePro"></div>
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

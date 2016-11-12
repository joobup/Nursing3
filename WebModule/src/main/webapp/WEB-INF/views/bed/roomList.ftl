<link href="${domainUrl}/assets/css/serve/serve.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/institution/bed/roomList.js"></script>
<div id="now-position">
    您当前所在的位置：<span>房间模块</span>
</div>

<div class="serve-banner">
    <an><input type="button" id="cao" value="添加房间" data-toggle="modal" data-target="#myModal" onclick="clearModal()">
        <input type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no">
        <input type="button" value="删除房间" " id="shanchu-yes">
    </an>
</div>
<div class="serve-module">

</div>
<#--分页-->
<div class="tcdPageCode">
</div>
<#--模态框-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title  text-center" id="myModalLabel">
                    添加房间
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>楼门</td>
                        <td><select  id="entranceId"></select></td>
                        <#--<td><input type="text" id="entranceName" class="null"></td>-->
                    </tr>
                    <tr>
                        <td>楼层</td>
                        <td><input type="text" id="floorNum"></td>
                    </tr>
                    <tr>
                        <td>房间号</td>
                        <td><input type="text" id="roomNum"></td>
                    </tr>
                    <tr>
                        <td>床数</td>
                        <td><input type="text" id="bedToalNum" class="null"></td>
                    </tr>
                    <tr>
                        <td>房间类型</td>
                        <td><select name="" id="roomTypeId"></select></td>
                        <td style="display: none;"><input type="text"id="rid"></td>
                    </tr>
                    <tr id="tr2" style="display: none;">
                        <td></td>
                        <td><select name="" id="roomTypeId2"></select></td>
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
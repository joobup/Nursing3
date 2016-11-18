<link href="${domainUrl}/assets/css/serve/pack.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/institution/inspection/jcInspectionInput.js"></script>
<div id="now-position">
    您当前所在的位置：<span>检查模块</span>
</div>
<div class="serve-banner">
    <an><input type="button" id="cao" value="添加检查表" data-toggle="modal" data-target="#myModal">
    </an>
</div>
<div class="serve-module">
    <#--<div class="serve-module-s"> <i class=" glyphicon glyphicon-remove shanchu" style="display: block;" onclick="del(4)" title="删除"></i>-->
        <#--<b>一般检查表</b>-->
        <#--<input type="button" value="填写检查表" onclick="openInput()">-->
    <#--</div>-->
</div>
<style>
    .serve-module-s{
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .serve-module-s b{
        font-size: 25px;
    }
    .serve-module-s input[type="button"]{
        position: absolute;
        bottom: 10px;
        right: 10px;
    }
</style>
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
                        <td><select id="inspectionId" onclick="addName()"></select></td>
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
<#--填表模态框-->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title  text-center modalTitle" id="myModalLabel">
                    检查表
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>填表人</td>
                        <td><input type="text"></td>
                    </tr>
                    <tr>
                        <td>血压</td>
                        <td><input type="text"></td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td><input type="radio" name="sex">男<input type="radio" name="sex">女</td>
                    </tr>
                    <tr>
                        <td>身高</td>
                        <td><input type="text"></td>
                    </tr>
                    <tr>
                        <td>体重</td>
                        <td><input type="text"></td>
                    </tr>
                    <tr>
                        <td>爱好</td>
                        <td><input type="checkbox" name="hobby">运动<input type="checkbox" name="hobby">歌曲<input type="checkbox" name="hobby">广场舞</td>
                    </tr>
                    <tr>
                        <td>饮食习惯</td>
                        <td><input type="checkbox" name="food">海鲜<input type="checkbox" name="food">蔬菜<input type="checkbox" name="food">肉类</td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="add-btn"  data-dismiss="modal">添加</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<#--显示模态框-->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title  text-center modalTitle" id="myModalLabel">
                    检查表
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>填表人</td>
                        <td><span>林青霞</span></td>
                    </tr>
                    <tr>
                        <td>血压</td>
                        <td><span>80</span></td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td><span>男</span></td>
                    </tr>
                    <tr>
                        <td>身高</td>
                        <td><span>168CM</span></td>
                    </tr>
                    <tr>
                        <td>体重</td>
                        <td><span>52kg</span></td>
                    </tr>
                    <tr>
                        <td>爱好</td>
                        <td>运动 、 广场舞</td>
                    </tr>
                    <tr>
                        <td>饮食习惯</td>
                        <td>肉类</td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>


    <link href="${domainUrl}/assets/css/serve/cost.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/serve/cost.js"></script>
    <script>
        findAll();
    </script>
            <div id="now-position">
                您当前所在的位置：<span>计费模块</span>
            </div>
            <div class="serve-banner">
                <an><input type="button" id="cao" value="添加计费" data-toggle="modal" data-target="#myModal"> <input
                        type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no"><input
                        type="button" value="删除计费" " id="shanchu-yes">
                </an>
            </div>
            <div class="serve-module">
                <div id="cost-pack">
                </div>
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
                            <td>计费方式</td>
                            <td><input type="text" id="jijia"></td>
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
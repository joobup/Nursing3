<link href="${domainUrl}/assets/css/serve/upload.css" rel="stylesheet">
<link href="${domainUrl}/assets/css/publicStyle.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/serve/upload.js"></script>

<div id="now-position">
    您当前所在的位置：<span>上传服务</span>
</div>
<div class="serve-banner">
</div>

<div class="box">
    <button type="button" class="btn btn-primary btn-style1" data-toggle="modal" data-target="#myModal">
      <img  src="${domainUrl}/assets/images/serve/house1.png">
    </button>
</div>
    <!-- 模态框 -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">服务上传</h4>
                </div>
                <div class="modal-body">
                    <div class="one">
                        <div class="tu">
                            <img src="${domainUrl}/assets/images/serve/service.png" alt="">
                        </div>
                        <h4>健康 快捷 干净</h4>
                    </div>
                    <div class="one theme ">
                        <div class="tu">
                            <img src="${domainUrl}/assets/images/serve/service.png" alt="">
                        </div>
                        <h4>健康 快捷 干净</h4>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" onclick="add()">上传</button>
                </div>
            </div>
        </div>
    </div>


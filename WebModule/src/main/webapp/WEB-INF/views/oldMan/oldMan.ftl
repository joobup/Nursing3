
<link href="${domainUrl}/assets/css/oldMan/oldMan.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/institution/olderMan/servicePeople.js"></script>
<script src="${domainUrl}/assets/js/serve/serveClassFindAll.js"></script>
<script src="${domainUrl}/assets/js/OutJs/date/jquery.date_input.pack.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/diyUpload.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/webuploader.html5only.min.js"></script>

<script>
    findAllp(1);
</script>

<div id="now-position">
    您当前所在的位置：<span>老人信息</span>
</div>
<div style="position: absolute; top: 0; left: 0; right: 0; bottom: 0; background-color: #DDD; opacity: .5; z-index:999; display: none;" id="aaaa">
</div>
<div id="box">
    <div id="test" ></div>
</div>
<div class="serve-banner">

    <an><input type="button" id="cao" value="人员添加" data-toggle="modal" data-target="#myModal" onclick="findAll()"> <input
            type="button" value="取消删除" style="display: none;background-color: red" id="shanchu-no"><input
            type="button" value="删除人员" " id="shanchu-yes">
        <#--<input type="button" value="表格显示" onclick="sideUrl('/serve/services/servicesB')">-->
    </an>
</div>

<!--添加内容静态页-->
<#--<div class="serve-module">-->
<#--</div>-->
<div class="zong">
    <ul class="box">
        <li class="pull-left box-left"><img src="${domainUrl}/assets/images/serve/11.png" alt="" id="servicePeoplePicture"></li>
        <li class="pull-left box-con">
            <ul>
                <li>ID：<span id="userId"></span></li>
                <li>姓名：<span  id="servicePeopleName"></span></li>
                <li>年龄：<span  id="servicePeopleAge"></span></li>
                <li>性别：<span  id="servicePeopleSex"></span></li>
                <li>关系：<span  id="servicePeopleRelation"></span></li>
            </ul>
        </li>
        <li class="pull-left box-right">
            <ul>
                <li>人员状态：<span id="servicePeopleStateId"></span></li>
                <li>服务类型：<span id="servicePeopleTypeId"></span></li>
                <li>护理级别：<span id="nursingLeave"></span></li>
                <li>联系方式：<span id="servicePeopleTel"></span></li>
            </ul>
        </li>
        <div class="clearfix"></div>
        <button type="button" class="btn btn-primary btn1-style" data-toggle="modal" data-target="#myModal">
            了解更多
        </button>

        <!--老人信息登记表 -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="myModalLabel">老人信息登记表</h4>
                    </div>
                    <div class="modal-body">
                        <table class="table">
                            <thead>
                            <tr>
                                <th>服务对象id</th>
                                <th id="servicePeopleId"></th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>出生日期：</td>
                                <td id="birthday"></td>
                            </tr>
                            <tr>
                                <td>民族：</td>
                                <td id="nation"></td>
                            </tr>
                            <tr>
                                <td>身份证号：</td>
                                <td id="identityCard"></td>
                            </tr>
                            <tr>
                                <td>家庭住址：</td>
                                <td id="homeAddress"></td>
                            </tr>
                            <tr>
                                <td>居住情况：</td>
                                <td id="liveCondition"></td>
                            </tr>
                            <tr>
                                <td>自理能力：</td>
                                <td id="selfCareAbility"></td>
                            </tr>
                            <tr>
                                <td>人员类别：</td>
                                <td id="personalClassify"></td>
                            </tr>
                            <tr>
                                <td>政治面貌：</td>
                                <td id="politicsStatus"></td>
                            </tr>
                            <tr>
                                <td>文化程度：</td>
                                <td id="cultureLevel"></td>
                            </tr>
                            <tr>
                                <td>医疗方式：</td>
                                <td id="medicalWay"></td>
                            </tr>
                            <tr>
                                <td>月收入：</td>
                                <td id="monthIncome"></td>
                            </tr>
                            <tr>
                                <td>婚姻状况：</td>
                                <td id="marriageStatus"></td>
                            </tr>
                            <tr>
                                <td>宗教信仰：</td>
                                <td id="faith"></td>
                            </tr>
                            <tr>
                                <td>联系人1姓名：</td>
                                <td id="call1Name"></td>
                            </tr>
                            <tr>
                                <td>联系人1与老人的关系：</td>
                                <td id="call1Old"></td>
                            </tr>
                            <tr>
                                <td>联系人1电话：</td>
                                <td id="call1"></td>
                            </tr>
                            <tr>
                                <td>联系人2姓名：</td>
                                <td id="call2Name"></td>
                            </tr>
                            <tr>
                                <td>联系人2与老人的关系：</td>
                                <td id="call2Old"></td>
                            </tr>
                            <tr>
                                <td>联系人2电话：</td>
                                <td id="call2"></td>
                            </tr>
                            <tr>
                                <td>子女人数总</td>
                                <td id="childAll"></td>
                            </tr>
                            <tr>
                                <td>子女人数(子)</td>
                                <td id="childBoy"></td>
                            </tr>
                            <tr>
                                <td>子女人数(女)</td>
                                <td id="childGirl"></td>
                            </tr>
                            <tr>
                                <td>居家养老服务卡号</td>
                                <td id="homeOldCard"></td>
                            </tr>
                            <tr>
                                <td>业务名称（普通,支付护理费,入住养老机构)</td>
                                <td id="workName"></td>
                            </tr>
                            <tr>
                                <td>登记人</td>
                                <td id="checkPeoPle"></td>
                            </tr>
                            <tr>
                                <td>登记日期</td>
                                <td id="checkDate"></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default btn2-style" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>
        </div>
    </ul>
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
                    服务对象信息登记表
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>姓名</td>
                        <td><input tyle="text" id="servicePeopleName" ></td>
                    </tr>
                    <tr>
                        <td>年龄</td>
                        <td><input tyle="text" id="servicePeopleAge" ></td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td><input tyle="text" id="servicePeopleSex" ></td>
                    </tr>
                    <tr>
                        <td>关系</td>
                        <td><input tyle="text" id="servicePeopleRelation" ></td>
                    </tr>
                    <tr>
                        <td>注意事项</td>
                        <td><input tyle="text" id="servicePeopleAttention" ></td>
                    </tr>
                    <tr>
                        <td>客户ID</td>
                        <td><input tyle="text" id="userId"></td>
                    </tr>
                    <tr>
                        <td>联系方式</td>
                        <td><input tyle="text" id="servicePeopleTel" ></td>
                    </tr>
                    <tr>
                        <td>服务对象状态</td>
                        <td><select id="servicePeopleTypeId" ></select></td>
                    </tr>
                    <tr>
                        <td>护理级别</td>
                        <td><select id="nursingLeave"></select></td>
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





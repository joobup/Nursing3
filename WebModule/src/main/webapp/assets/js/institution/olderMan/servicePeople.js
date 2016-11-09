/**
 * Created by horo on 2016/11/7.
 */
/*服务对象模块*/
//添加
$(function () {
    findAll(1);
    typeSelect();
    stateSelect();
    $("#shanchu-yes").click(function () {
        $("#shanchu-yes").hide();
        $("#shanchu-no").show();
        $(".bianji").hide();
        $(".shanchu").show();
    })
    $("#shanchu-no").click(function () {
        $("#shanchu-no").hide();
        $("#shanchu-yes").show();
        $(".shanchu").hide();
        $(".bianji").show();
    })
})
function add() {
    var url = domainUrl + '/serve/service_people/add';
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeoplePicture = $("#servicePeoplePicture").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var nursingLeave = $("#nursingLeave").val();
    var postData = {
        servicePeopleName:servicePeopleName,
        servicePeopleAge:servicePeopleAge,
        servicePeopleSex:servicePeopleSex,
        servicePeopleRelation:servicePeopleRelation,
        servicePeopleAttention:servicePeopleAttention,
        userId:1,
        servicePeopleTel:servicePeopleTel,
        servicePeopleStateId:stateClassify,
        servicePeopleTypeId:typeClassify,
        nursingLeave:nursingLeave,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide")
    })
}
//查询
function findAll(currentPage) {
    var url  = domainUrl + '/serve/service_people/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit
    };
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        var html='';
        for(var i = 0 ; i < num ; i++){
            html+='<ul class="box"> <li class="pull-left box-left"><img src="${domainUrl}/assets/images/serve/old.png">' +
                '</li> <li class="pull-left box-con"> <ul> <i class="glyphicon glyphicon-remove shanchu" title="删除" style="display:none;" onclick="del('+data.aaData[i].id+')"></i> ' +
                '<i class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal" data-target="#myModal" ></i>' +
                ' <li>姓名：<span>'+data.aaData[i].servicePeopleName+'</span></li> ' +
                '<li>年龄：<span>'+data.aaData[i].servicePeopleAge+'</span></li> <li>性别：<span>'+data.aaData[i].servicePeopleSex+'</span></li>' +
                ' <li>关系：<span>'+data.aaData[i].servicePeopleRelation+'</span></li></ul> </li> ' +
                '<li class="pull-left box-right"> <ul> <li>人员状态：<span>'+data.aaData[i].servicePeopleStateId+'</span></li>' +
                ' <li>服务类型：<span>'+data.aaData[i].servicePeopleTypeId+'</span></li><li>护理级别：<span>'+data.aaData[i].nursingLeave+'</span></li>' +
                ' <li>联系方式：<span>'+data.aaData[i].servicePeopleTel+'</span></li> </ul> </li>' +
                ' <button type="button" class="btn btn-primary btn1-style" data-toggle="modal" data-target="#myModal"> 添加详情 </button> </ul>';
        }
        $(".zong").html(html)
    })
}
//删除
function del(id) {
    var url = domainUrl + '/serve/service_people/del';
    var postData = {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
        findAll(1);
    })
}
//修改
function make(id) {
    var url  = domainUrl + '/serve/service_people/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit
    };
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num = data.aaData.length;

    })
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeoplePicture = $("#servicePeoplePicture").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var nursingLeave = $("#nursingLeave").val();
}
function update(id) {
    var url = domainUrl + '/serve/service_people/update';
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeoplePicture = $("#servicePeoplePicture").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var servicePeopleStateId = $("#servicePeopleStateId").val();
    var servicePeopleTypeId = $("#servicePeopleTypeId").val();
    var nursingLeave = $("#nursingLeave").val();
    var postData = {
        id:id,
        servicePeopleName:servicePeopleName,
        servicePeopleAge:servicePeopleAge,
        servicePeopleSex:servicePeopleSex,
        servicePeopleRelation:servicePeopleRelation,
        servicePeoplePicture:servicePeoplePicture,
        servicePeopleAttention:servicePeopleAttention,
        userId:userId,
        servicePeopleTel:servicePeopleTel,
        servicePeopleStateId:servicePeopleStateId,
        servicePeopleTypeId:servicePeopleTypeId,
        nursingLeave:nursingLeave,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
    })
}
/*服务对象状态级别*/
var typeClassify;
function typeSelect() {
    var url = domainUrl + "/serve/service_people_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].serviceTypePeopleName + '</option>';
        }
        $("#servicePeopleTypeId").html(html);
        var type = document.getElementById('servicePeopleTypeId');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id !="请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr2").show();
                        typeSelect2();
                        typeClassify = null;
                    }else{
                        var selectIndex = document.getElementById("servicePeopleTypeId").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("servicePeopleTypeId").options[selectIndex].value //获得被选中的项目
                        typeClassify = selectText;
                        $("#tr2").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("servicePeopleTypeId").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("servicePeopleTypeId").options[selectIndex].value //获得被选中的项目
                typeClassify = selectText;
                $("#tr2").hide();
            }
        }
    })
}
function typeSelect2() {
    var url = domainUrl + "/serve/service_people_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].serviceTypePeopleName + '</option>';
        }
        $("#servicePeopleTypeId2").html(html);
        var type = document.getElementById('servicePeopleTypeId2');
        type.onchange = function () {
                var selectIndex = document.getElementById("servicePeopleTypeId2").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("servicePeopleTypeId2").options[selectIndex].value //获得被选中的项目
                typeClassify = selectText;
        }
    })
}
/*护理级别*/
var stateClassify;
function stateSelect() {
    var url = domainUrl + "/serve/service_people_state/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].servicePeopleStateName + '</option>';
        }
        $("#nursingLeave").html(html);
        var state = document.getElementById('nursingLeave');
        state.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id !="请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr22").show();
                        stateSelect2();
                        stateClassify = null;
                    }else{
                        var selectIndex = document.getElementById("nursingLeave").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("nursingLeave").options[selectIndex].value //获得被选中的项目
                        stateClassify = selectText;
                        $("#tr22").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("nursingLeave").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("nursingLeave").options[selectIndex].value //获得被选中的项目
                stateClassify = selectText;
                $("#tr22").hide();
            }
        }
    })
}
function stateSelect2() {
    var url = domainUrl + "/serve/service_people_state/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].servicePeopleStateName + '</option>';
        }
        $("#nursingLeave2").html(html);
        var state = document.getElementById('nursingLeave2');
        state.onchange = function () {
            var selectIndex = document.getElementById("nursingLeave2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("nursingLeave2").options[selectIndex].value //获得被选中的项目
            stateClassify = selectText;
        }
    })
}
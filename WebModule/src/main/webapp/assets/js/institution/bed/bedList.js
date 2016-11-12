/**
 * Created by horo on 2016/11/11.
 */
/*楼门表*/
//添加
$(function () {
    findAll(1);
    findAllRoom(1);
    bedType();
    $("#shanchu-yes").click(function () {
        $(".bianji").hide();
        $(".shanchu").show();
        $("#shanchu-yes").hide();
        $("#shanchu-no").show();
    })
    $("#shanchu-no").click(function () {
        $(".bianji").show();
        $(".shanchu").hide();
        $("#shanchu-yes").show();
        $("#shanchu-no").hide();
    })
})
function add() {
    var url = domainUrl +'/serve/bed/add';
    var postData = {
        roomId:roomId,
        bedTypeId:bedType,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
//查询
function findAll(currentPage) {
    var url = domainUrl +'/serve/bed/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            html += ' <div class="serve-module-s"><i   class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal"  onclick="make(' + data.aaData[i].id + ')"></i> ' +
                ' <i  class=" glyphicon glyphicon-remove shanchu"    onclick="del(' + data.aaData[i].id + ')" title="删除"></i>';
            html +='<ul><li class="servePicture"><img style="width: 100px; height: 100px;" src="'+domainImg+'/assets/images/serve/bed.png"/></li></ul>';
            html += '<ul id="zuo-font"><li>房间号<span>' + data.aaData[i].roomId + '</span></li><li>房间类型<span>' + data.aaData[i].bedTypeId + '</span></li></ul></div>';
        }
        $(".serve-module").html(html)
    })
}
function make(id) {
    $("#update-btn").show();
    $("#add-btn").hide();
    $("#lid").val(id);
    var url = domainUrl +'/serve/bed/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0; i< num ; i++){
            if(id == data.aaData[i].id){
                $("#entranceName").val(data.aaData[i].entranceName);
                $("#entranceToalNum").val(data.aaData[i].entranceToalNum);
                $("#floorToalNum").val(data.aaData[i].floorToalNum);
                $("#entranceNum").val(data.aaData[i].entranceNum);
            }
        }
    })
}
//修改
function update() {
    var url = domainUrl +'/serve/bed/update';
    var entranceName = $("#entranceName").val();
    var entranceToalNum = $("#entranceToalNum").val();
    var floorToalNum = $("#floorToalNum").val();
    var entranceNum = $("#entranceNum").val();
    var postData = {
        id:$("#lid").val(),
        entranceName:entranceName,
        entranceToalNum:entranceToalNum,
        floorToalNum:floorToalNum,
        entranceNum:entranceNum,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
//删除
function del(id) {
    var url = domainUrl +'/serve/bed/del';
    var postData = {
        id:id,
    };
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        $("#shanchu-yes").show();
        $("#shanchu-no").hide();
        findAll(1);
    })
}
var roomId;
//查询房间列表
function findAllRoom(currentPage) {
    var url = domainUrl+"/serve/room/findAll";
    var getData={currentPage:currentPage,limit:limit,};
    var html='<option value="请选择">请选择</option>';
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0; i <num ; i++){
            html+='<option>' + data.aaData[i].roomNum + '</option>';
        }
        $("#roomId").html(html)
        var type = document.getElementById('roomId');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                var selectIndex = document.getElementById("roomId").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("roomId").options[selectIndex].value //获得被选中的项目
                roomId = selectText;
            }
        }
    })
}
//树
//床位树
var bedType;
function bedType() {
    var url = domainUrl+"/serve/bed_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].bedTypeName + '</option>';
        }
        $("#bedTypeId").html(html);
        var type = document.getElementById('bedTypeId');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr2").show();
                        bedType2();
                        bedType = null;
                    } else {
                        var selectIndex = document.getElementById("bedTypeId").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("bedTypeId").options[selectIndex].value //获得被选中的项目
                        bedType = selectText;
                        $("#tr2").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("bedTypeId").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("bedTypeId").options[selectIndex].value //获得被选中的项目
                bedType = selectText;
                $("#tr2").hide();
            }
        }
    })
}
function bedType2() {
    var url = domainUrl+"/serve/bed_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].bedTypeName + '</option>';
        }
        $("#bedTypeId2").html(html);
        var type = document.getElementById('bedTypeId2');
        type.onchange = function () {
            var selectIndex = document.getElementById("bedTypeId2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("bedTypeId2").options[selectIndex].value //获得被选中的项目
            bedType = selectText;
        }
    })
}

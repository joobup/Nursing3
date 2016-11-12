/**
 * Created by horo on 2016/11/3.
 */
/*菜品列表*/
/*添加*/
$(function () {
    findAll(1);
    banClassify();
    roomClassify();
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
function clearModal() {
    $("#floorNum").val("");
    $("#roomNum").val("");
    $("#bedToalNum").val("");
}
function add() {
    var url = domainUrl+"/serve/room/add";
    var entranceId = $("#entranceId").val();
    var floorNum = $("#floorNum").val();
    var roomNum = $("#roomNum").val();
    var bedToalNum = $("#bedToalNum").val();
    var roomTypeId = $("#roomTypeId").val();
    var postData = {
        entranceId:entranceId,
        floorNum:floorNum,
        roomNum:roomNum,
        bedToalNum:bedToalNum,
        roomTypeId:roomClassify,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
/*查询*/
function findAll(currentPage) {
    var url = domainUrl+"/serve/room/findAll";
    var getData={currentPage:currentPage,limit:limit,};
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        for(var i = 0; i <num ; i++){
            html += ' <div class="serve-module-s"><i   class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal"  onclick="make(' + data.aaData[i].id + ')"></i> ' +
                ' <i  class=" glyphicon glyphicon-remove shanchu"    onclick="del(' + data.aaData[i].id + ')" title="删除"></i>';
            html +='<ul><li class="servePicture"><img style="width: 100px; height: 100px;" src="'+domainImg+'/assets/images/serve/room.png"/></li></ul>';
            html += '<ul id="zuo-font"><li>楼门<span>' + data.aaData[i].entranceId + '</span></li><li>楼层<span>' + data.aaData[i].floorNum + '</span></li>' +
                ' <li>房间号<span>' + data.aaData[i].roomNum + '</span></li> <li>床数<span>' + data.aaData[i].bedToalNum + '</span></li></ul>';
            html += '<ul id="you-font1"><li>房间类型</li></ul> <ul id="you-font2"> <li>' + data.aaData[i].roomTypeId + '</li></ul></div>';
        }
        $(".serve-module").html(html)
    })
}
/*删除*/
function del(id) {
    var url = domainUrl+"/serve/room/del";
    var postData = {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        $("#shanchu-yes").show();
        $("#shanchu-no").hide();
        findAll(1);
    })
}
/*修改*/
function make(id) {
    $("#rid").val(id);
    $("#update-btn").show();
    $("#add-btn").hide();
    var url = domainUrl +'/serve/room/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0; i< num ; i++){
            if(id == data.aaData[i].id){
                $("#floorNum").val(data.aaData[i].floorNum);
                $("#roomNum").val(data.aaData[i].roomNum);
                $("#bedToalNum").val(data.aaData[i].bedToalNum);
            }
        }
    })
}
function update() {
    var url = domainUrl+"/serve/room/update";
    var entranceId = $("#entranceId").val();
    var floorNum = $("#floorNum").val();
    var roomNum = $("#roomNum").val();
    var bedToalNum = $("#bedToalNum").val();
    var roomTypeId = $("#roomTypeId").val();
    var postData = {
        id:$("#rid").val(),
        entranceId:entranceId,
        floorNum:floorNum,
        roomNum:roomNum,
        bedToalNum:bedToalNum,
        roomTypeId:roomTypeId,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
        $("#myModal").modal("hide")
    })
}
/*图片上传*/
function upload(id) {
    $("#aaaa").hide();
    $("#box").hide();
    var url =domainUrl+'/serve/dishes_picture/adds';
    var postData ={
        dishesId:id,
        dishespictureService:pathList,
    };
    postAjax(url,false,postData,function (data) {
        alert("上传成功");
        findAll(1);
    })
}
//楼层分类
function banClassify() {
    var url = domainUrl+"/serve/entrance/findAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[i].id + '">' + data.aaData[i].entranceName + '</option>';
        }
        $("#entranceId").html(html);
    })
}
/*树*/
//床位类型
var roomClassify;
function roomClassify() {
    var url = domainUrl+"/serve/room_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].roomTypeName + '</option>';
        }
        $("#roomTypeId").html(html);
        var type = document.getElementById('roomTypeId');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr2").show();
                        roomClassify2();
                        roomClassify = null;
                    } else {
                        var selectIndex = document.getElementById("roomTypeId").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("roomTypeId").options[selectIndex].value //获得被选中的项目
                        roomClassify = selectText;
                        $("#tr2").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("roomTypeId").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("roomTypeId").options[selectIndex].value //获得被选中的项目
                roomClassify = selectText;
                $("#tr2").hide();
            }
        }
    })
}
function roomClassify2() {
    var url = domainUrl+"/serve/room_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].roomTypeName + '</option>';
        }
        $("#roomTypeId2").html(html);
        var type = document.getElementById('roomTypeId2');
        type.onchange = function () {
            var selectIndex = document.getElementById("roomTypeId2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("roomTypeId2").options[selectIndex].value //获得被选中的项目
            roomClassify = selectText;
        }
    })
}

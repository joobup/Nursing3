/**
 * Created by horo on 2016/11/11.
 */
/*楼门表*/
//添加
$(function () {
    findAll(1);
})
function clearModal() {
    $("#entranceName").val("");
    $("#entranceToalNum").val("");
    $("#floorToalNum").val("");
    $("#entranceNum").val("");
}
function add() {
    var url = domainUrl +'/serve/entrance/add';
    var entranceName = $("#entranceName").val();
    var entranceToalNum = $("#entranceToalNum").val();
    var floorToalNum = $("#floorToalNum").val();
    var entranceNum = $("#entranceNum").val();
    var postData = {
        entranceName:entranceName,
        entranceToalNum:entranceToalNum,
        floorToalNum:floorToalNum,
        entranceNum:entranceNum,
    };
    postAjax(url,false,postData,function (data) {
        console.log(JSON.stringify(data));
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
//查询
function findAll(currentPage) {
    var url = domainUrl +'/serve/entrance/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    var html = "<tbody> <tr> <th>楼名</th> <th>楼门数</th> <th>楼层</th> <th>楼门号</th> <th>操作</th> </tr> </tbody>";
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            html += '<tr><td>' + data.aaData[i].entranceName + '</td><td>' + data.aaData[i].entranceToalNum + '</td><td>' + data.aaData[i].floorToalNum + '</td><td>' + data.aaData[i].entranceNum + '</td>';
            html += '<td><i class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal" onclick="make(' + data.aaData[i].id + ')"></i><i' +
                ' class="glyphicon glyphicon-remove shanchu" title="删除" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
        }
        $("#aaa").html(html)
    })
}
function make(id) {
    $("#update-btn").show();
    $("#add-btn").hide();
    $("#lid").val(id);
    var url = domainUrl +'/serve/entrance/findAll';
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
    var url = domainUrl +'/serve/entrance/update';
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
        console.log(JSON.stringify(data));
        alert("修改成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
//删除
function del(id) {
    var url = domainUrl +'/serve/entrance/del';
    var postData = {
        id:id,
    };
    postAjax(url,false,postData,function (data) {
        console.log(JSON.stringify(data));
        alert("删除成功");
        findAll(1);
    })
}
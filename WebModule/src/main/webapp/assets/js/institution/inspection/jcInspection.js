/*检查模块*/
$(function () {
    findAll(1);
    $("#cao").click(function () {
        $("#update-btn").hide();
        $("#add-btn").show();
    })
})
//添加
function add() {
    var url = domainUrl+'/serve/inspection/add';
    var postData = {
        inspectionName:$("#inspectionName").val(),
        inspectionItemList:inspectionPull,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
//查看
function findAll(currentPage) {
    var url = domainUrl+'/serve/inspection/findAll';
    var getData={
        currentPage:currentPage,
        limit:limit,
    };
    var html = "<tbody> <tr> <th>检查表名称</th> <th>检查表项目</th>  <th>操作</th> </tr> </tbody>";
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for (var i = 0; i <num ; i++){
            html += '<tr><td>' + data.aaData[i].inspectionName + '</td><td>' + data.aaData[i].inspectionItemList + '</td>';
            html += '<td><i data-toggle="modal" data-target="#myModalCost"' + ' onclick="make(' + data.aaData[i].id + ')" class="glyphicon glyphicon-pencil"' +
                '   ></i><i class="glyphicon glyphicon-remove shanchu" title="删除" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
        }
        $("#aaa").html(html)
    })
}
//删除
function del(id) {
    var url = domainUrl+'/serve/inspection/del';
    var postData = {
        id:id
    };
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll(1);
    })
}
function clearModal() {
    $("#inspectionName").val("");
}
//修改
function make(id) {
    $("#myModal").modal("show");
    clearModal();
    $("#pullid").val(id)
    $("#update-btn").show();
    $("#add-btn").hide();
}
function update() {
    var url = domainUrl+'/serve/inspection/update';
    var id = $("#").val();
    var postData = {
        id:$("#pullid").val(),
        inspectionName:$("#inspectionName").val(),
        inspectionItemList:inspectionPull,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
var inspectionPull='';
//显示项目列表
function itemList() {
    $(".add").slideUp("slow");
    $("#servePro").slideDown("slow");
    var url = domainUrl+'/serve/inspection_item/findAll';
    var getData={
        currentPage:currentPage,
        limit:limit,
    };
    var html='';
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0 ; i < num ; i++){
            html += '<a value="' + data.aaData[i].id + '" class="servename">' + data.aaData[i].inspectionItemName + '</a>';
        }
        html+='<input type="button" value="选择完成" class="btn" id="serversAdd">';
        $("#servePro").html(html);
        $(".servename").click(function () {
            if ($(this).hasClass("colorA")) {
                $(this).removeClass("colorA")
                inspectionPull = inspectionPull.replace('' + $(this).attr("value") + ',', '');
            } else {
                inspectionPull += '' + $(this).attr("value") + ',';
                $(this).addClass("colorA")
            }
            if (inspectionPull == "") {
                $("#serversAdd").css("pointer-events", "none").css("background-color", "#DDDDDD")
            } else {
                $("#serversAdd").css("pointer-events", "auto").css("background-color", "#FF4B01")
            }
        })
        $("#serversAdd").click(function () {
            $(".add").slideDown("slow");
            $("#servePro").slideUp("slow");
        })
    })
}
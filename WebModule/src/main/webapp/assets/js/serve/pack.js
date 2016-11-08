/**
 * Created by horo on 2016/10/21.
 */

$(function () {
    $("#cao").click(function () {
        $("#update-btn").hide();
        $("#add-btn").show();
        findAllServe();
    })
    $("#serveAdd").click(function () {
        $("#servePro").show(200);
    })
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
var serveNamePull = "";
function findAllServe() {
    var url = domainUrl + "/serve/services/findAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = "";
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            html += '<a value="' + data.aaData[i].id + '" class="servename">' + data.aaData[i].serveName + '</a>';
        }
        html += '<input type="button" value="选择完成" class="btn" id="serversAdd">';
        $("#servePro").html(html);
        $(".servename").click(function () {
            if ($(this).hasClass("colorA")) {
                $(this).removeClass("colorA")
                serveNamePull = serveNamePull.replace('' + $(this).attr("value") + ',', '');
            } else {
                serveNamePull += '' + $(this).attr("value") + ',';
                $(this).addClass("colorA")
            }
            if (serveNamePull == "") {
                $("#serversAdd").css("pointer-events", "none").css("background-color", "#DDDDDD")
            } else {
                $("#serversAdd").css("pointer-events", "auto").css("background-color", "#FF4B01")
            }
        })
        $("#serversAdd").click(function () {
            $("#servePro").hide(200);
        })
    })
}
var pageList;
var pageNp = 1;
var currentPage = 1;
var limit = 10;
function findAll(currentPage) {
    var url = domainUrl + '/serve/service_pack/findAll';
    var getData = {currentPage: currentPage, limit: 9};
    var html = '';
    var num = '';
    var serveNum = '';
    var picture = '';
    getAjax(url, false, getData, function (data) {
        num = data.aaData.length;
        pageList = Math.ceil(data.iTotalRecords / limit);
        console.log(JSON.stringify(data.aaData[0]))
        for (var i = 0; i < num; i++) {
            var serveList = '';
            for (var j = 0; j < serveNum; j++) {
                serveList += '' + data.aaData[i].servicesList[j].serveName + '、';
            }
            if (data.aaData[i].serveDetailed.richTextHeadPicture == null) {
                picture = '<img style="width: 100px; height: 100px;cursor: pointer;" src="' + domainImg + '/assets/images/serve/add_img.png" onclick="uploadShow(' + data.aaData[i].id + ')"/>';
            } else {
                picture = '<img style="width: 100px; height: 100px;" src="' + domainFile + '/assets/uploadimg/' + data.aaData[i].serveDetailed.richTextHeadPicture + '" />';
            }
            html += ' <div class="serve-module-s"><i class="glyphicon glyphicon-pencil bianji" title="编辑" onclick="make(' + data.aaData[i].id + ')"></i><i' +
                ' class="glyphicon glyphicon-remove shanchu" title="删除"         style="display: none" onclick="del(' + data.aaData[i].id + ')"></i><ul> <li' +
                ' id="staff-mess1">' + picture + '</li>' +
                ' <li id="staff-mess2"> <ul> <li>名称</li> <li>折扣</li> <li>开始时间</li> <li>结束时间</li> <li>服务项</li> </ul>' +
                ' <ul class="staff-mess-right"> <li>' + data.aaData[i].serveName + '</li> <li>' + data.aaData[i].serveRebate + '</li> <li id="sdate-text" >' + data.aaData[i].serveStartdate + '</li> ' +
                '<li  id="edate-text" >' + data.aaData[i].serveEnddate.substring(0, 11) + '</li> <li>' + serveList + '</li> </ul> </li> <li id="staff-mess3"> <ul> <li>注意事项</li>' +
                ' <li>护理级别</li><li>服务简介</li> </ul> ' +
                '<ul class="staff-mess-right"> <li>' + data.aaData[i].serveCare + '</li><li>' + data.aaData[i].serveNurseify.nursifyLeave + '</li> <li>' + data.aaData[i].serveBrief + '</li>' +
                ' </ul> </li>' +
                ' </ul> </div>';
        }
        $(".serve-module").html(html);
        if (pageNp == 1) {
            pageNp = 2;
            $(".tcdPageCode").createPage({
                pageCount: pageList,
                current: currentPage,
                backFn: function (p) {
                    findAllb(p)
                }
            });
        }
    })
}
function findAllb(currentPage) {
    var url = domainUrl + '/serve/service_pack/findAll';
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<tbody> <tr> <th>名称</th> <th>折扣</th> <th>开始时间</th> <th>结束时间</th> <th>服务项</th> <th>注意事项</th><th>护理级别</th><th>服务简介</th> <th>操作</th></tr> </tbody>';
    var num = '';
    var serveNum = '';
    getAjax(url, false, getData, function (data) {
        num = data.aaData.length;
        pageList = Math.ceil(data.iTotalRecords / limit);
        for (var i = 0; i < num; i++) {
            var serveList = '';
            serveNum = data.aaData[i].servicesList.length
            for (var j = 0; j < serveNum; j++) {
                serveList += '' + data.aaData[i].servicesList[j].serveName + '、';
            }
            html += '<tr><td>' + data.aaData[i].serveName + '</td><td>' + data.aaData[i].serveRebate + '</td><td>' + data.aaData[i].serveStartdate + '</td>' +
                '<td>' + data.aaData[i].serveEnddate.substring(0, 11) + '</td><td>' + serveList + '</td><td>' + data.aaData[i].serveCare + '</td>' +
                '<td>' + data.aaData[i].serveNurseify.nursifyLeave + '</td><td>' + data.aaData[i].serveBrief + '</td>' +
                '<td><i class="glyphicon glyphicon-pencil bianji" title="编辑" onclick="make(' + data.aaData[i].id + ')"></i>' +
                '<i class="glyphicon glyphicon-remove shanchu" title="删除" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
        }
        $("#aaa").html(html);
        if (pageNp == 1) {
            pageNp = 2;
            $(".tcdPageCode").createPage({
                pageCount: pageList,
                current: currentPage,
                backFn: function (p) {
                    findAllb(p)
                }
            });
        }
    })
}
function add() {
    var serveName = $("#name").val(); //服务名称
    var serveCare = $("#care").val(); //注意事项
    var serveRebate = $("#rebate").val(); //折扣
    var ServeStartDate = $("#sdate").val();//开始时间
    var ServeEnddate = $("#edate").val(); //结束时间
    var serveNurseify = $("#nurseify").val(); //护理级别
    var serveBrief = $("#brief").val();  //服务简介
    var url = domainUrl + '/serve/service_pack/add';
    var postData = {
        serveDetailed: 1,
        serveName: serveName,
        serveCare: serveCare,
        serveRebate: serveRebate,
        ServeStartdate: ServeStartDate,
        ServeEnddate: ServeEnddate,
        serveServes: serveNamePull,
        serveNurseify: serveNurseify,
        serveBrief: serveBrief,
        serveDetailed: ""
    };
    postAjax(url, false, postData, function (data) {
        alert("打包成功");
        findAll();
        $('#myModal').modal("hide");
    })
}
function update() {
    var serveName = $("#name").val(); //服务名称
    var serveCare = $("#care").val(); //注意事项
    var serveRebate = $("#rebate").val(); //折扣
    var ServeStartDate = $("#sdate").val();//开始时间
    var ServeEnddate = $("#edate").val(); //结束时间
    var serveNurseify = $("#nurseify").val(); //护理级别
    var serveBrief = $("#brief").val();  //服务简介
    var url = domainUrl + '/serve/service_pack/update';
    var id = $("#xid").text();
    var postData = {
        id: id,
        serveDetailed: 1,
        serveName: serveName,
        serveCare: serveCare,
        serveRebate: serveRebate,
        ServeStartDate: ServeStartDate,
        ServeEnddate: ServeEnddate,
        serveServes: serveNamePull,
        serveNurseify: serveNurseify,
        serveBrief: serveBrief,
        serveDetailed: ""
    };
    postAjax(url, false, postData, function (data) {
        alert("修改成功");
        findAll();
        $('#myModal').modal("hide");
    })
}
function del(id) {
    var url = domainUrl + '/serve/service_pack/del';
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        alert("刪除成功");
        findAll();
    })
}
function make(id) {
    $("#xid").text(id);
    findAllServe();
    $("#update-btn").show();
    $("#add-btn").hide();
    var url = domainUrl + '/serve/service_pack/findAll';
    var getData = {};
    var name, care, rebate, sdate, edate, nurseify, brief;
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[i].id) {
                name = data.aaData[i].serveName;
                rebate = data.aaData[i].serveRebate;
                sdate = $("#sdate-text").text();
                edate = $("#edate-text").text();
                care = data.aaData[i].serveCare;
                nurseify = data.aaData[i].serveNurseify.nursifyLeave;
                brief = data.aaData[i].serveBrief;
                $("#name").val(name); //服务名称
                $("#care").val(care); //注意事项
                $("#rebate").val(rebate); //折扣
                $("#sdate").val(sdate);//开始时间
                $("#edate").val(edate); //结束时间
                $("#nurseify").val(nurseify); //护理级别
                $("#brief").val(brief);  //服务简介
            }
        }
        $('#myModal').modal("show");
    })
}
function upload(id) {
    $("#box").hide();
    $("#aaaa").hide();
    var url = domainUrl + '/serve/service_pack_picture/adds';
    var postData = {
        servicePackId: id,
        pictureAddress: pathList,
    };
    postAjax(url, false, postData, function (data) {
        alert("上传成功");
        findAll(1);
    })
}
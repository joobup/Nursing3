/**
 * Created by horo on 2016/10/21.
 */
var currentPage = 1;
var limit  = 10;
$(function () {
    findAll();
    $("#cao").click(function () {
        $("#update-btn").hide();
        $("#add-btn").show();
        findAllServe();
    })
    $("#serveAdd").click(function () {
        $("#servePro").show(200);
    })


})
var serveNamePull="";
function findAllServe() {
    var url = domainUrl + "/serve/services/findAll";
    var getData = {currentPage:currentPage,limit:limit};
    var html = "";
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        console.log(JSON.stringify(data) + "..." + num);
        for (var i = 0; i < num; i++) {
            html+='<a value="'+data.aaData[i].id+'" class="servename">'+data.aaData[i].serveName+'</a>';
        }
        html+='<input type="button" value="选择完成" class="btn" id="serversAdd">';
        $("#servePro").html(html);
        $(".servename").click(function () {
            if($(this).hasClass("colorA")){
                $(this).removeClass("colorA")
                serveNamePull = serveNamePull.replace(''+$(this).attr("value")+',','');
            }else{
                serveNamePull +=''+$(this).attr("value")+',';
                $(this).addClass("colorA")
            }
            if(serveNamePull == ""){
                $("#serversAdd").css("pointer-events","none").css("background-color","#DDDDDD")
            }else{
                $("#serversAdd").css("pointer-events","auto").css("background-color","#FF4B01")
            }
        })
        $("#serversAdd").click(function () {
            $("#servePro").hide(200);
        })
    })
}
function findAll() {
    var url = domainUrl+'/serve/service_pack/findAll';
    var getData={currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
function add() {
    var serveName = $("#name").val(); //服务名称
    var serveCare = $("#care").val(); //注意事项
    var serveRebate = $("#rebate").val(); //折扣
    var ServeStartDate = $("#sdate").val();
    var ServeEnddate = $("#edate").val();
    var serveNurseify = $("#nurseify").val(); //护理级别
    var serveBrief = $("#brief").val();  //服务简介
    var url = domainUrl+'/serve/service_pack/add';
    var postData={id:1,serveDetailed:1,serveName:serveName,serveCare:serveCare,serveRebate:serveRebate,ServeStartDate:ServeStartDate,ServeEnddate:ServeEnddate,serveServes:serveNamePull,serveNurseify:serveNurseify,serveBrief:serveBrief};
    postAjax(url,false,postData,function (data) {
        alert("打包成功")
    })
}
function update() {
    var url = domainUrl+'/serve/service_pack/update';
}
function del() {
    var url = domainUrl+'/serve/service_pack/del';
}
/**
 * Created by horo on 2016/10/21.
 */
$(function () {
    findAll();
    $("#cao").click(function () {
        $("#update-btn").hide();
        $("#add-btn").show();
    })
})
function findAllServe() {
    var url = domainUrl + "/serve/services/findAll";
    var getData = {};
    var html = "";
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        console.log(JSON.stringify(data) + "..." + num);
        for (var i = 0; i < num; i++) {

        }

    })
}
function findAll() {
    var url = domainUrl+'/serve/service_pack/findAll';
    var getData={};
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
function add() {
    var serveName = $("#name").val();
    var serveCare = $("#care").val();
    var serveRebate = $("#rebate").val();
    var serveEnddate = $("#enddate").val();
    var serveServes = $("#serves").val();
    var serveNurseify = $("#nurseify").val();
    var serveBrief = $("#brief").val();
    var url = domainUrl+'/serve/service_pack/add';
    var postData={id:1,serveDetailed:1,serveName:serveName,serveCare:serveCare,serveRebate:serveRebate,serveEnddate:serveEnddate,serveServes:serveServes,serveNurseify:serveNurseify,serveBrief:serveBrief};
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
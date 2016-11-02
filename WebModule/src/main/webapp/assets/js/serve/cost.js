/**
 * Created by horo on 2016/10/14.
 */
function add() {
    var cost = $("#jijia").val();
    console.log(cost)
    var url = domainUrl + "/serve/service_classes_valuation/add";
    var postData = {classesValuationName:cost};
    postAjax(url,false,postData,function (data) {
        alert("添加成功")
    })
}
function findAll() {
    var url = domainUrl + "/serve/service_classes_valuation/findAll"
    var getData = {currentPage:1,limit:10};
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        var html="";
        for(var i =0;  i < num ; i++){
            html +='<div class="del"><span>'+data.aaData[i].classesValuationName+'</span><a onclick="del('+data.aaData[i].id+')">删除</a></div>';
        }
        html+="";
        $(".serve-module").html(html)
    })
}
function del(id) {
    var url = domainUrl + "/serve/service_classes_valuation/del";
    var postData = {id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
        findAll()
    })
}
$(function () {
    findAll();
})
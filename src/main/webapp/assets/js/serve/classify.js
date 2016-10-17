/**
 * Created by horo on 2016/10/13.
 */
$(function () {
    findAll();
})
function add() {
    var classname = $("#className").val();
    var classlevel = $("#classLevel").val();
    var url = domainUrl+"/serve/service_classes/add";
    var postData = {serveClassname:classname,tid:classlevel}
    postAjax(url,false,postData,function (data) {
        alert(JSON.stringify(data))
    })
}
function findAll() {
    var url=domainUrl+"/serve/service_classes/findAll";
    var p = 1;
    var ps = 5;
    var getData = {currentPage:p,limit:ps};
    getAjax(url,false,getData,function (data) {
         console.log(JSON.stringify(data));
        console.log(data.aaData[1]);
        var num = data.iTotalRecords;
        var html="";
        for(var i = 0; i < num; i++){
            html += '<p>'+data.aaData[i].serveClassname+'</p><input type="button" onclick="del('+data.aaData[i].id+')" style="width: 30px; height: 20px;" value="删除">'
        }
        $("#find-main").html(html);
    })
}
function del(id) {
    var url = domainUrl+"/serve/service_classes/del";
    var postData = {id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
    })
}
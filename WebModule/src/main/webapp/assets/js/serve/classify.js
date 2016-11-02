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
    var postData = {serveClassname:classname}
    postAjax(url,false,postData,function (data) {
        alert("添加成功")
        location.reload();
    })
}
function findAll() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        var html='<option>请选择</option>';
        console.log(JSON.stringify(data))
        var num = data.aaData[0].length;
        for(var i = 0; i < num; i++){
            html+='<option  value="'+data.aaData[0][i].id+'">'+data.aaData[0][i].serveClassname+'</option>';
        }
    $("#sel1").html(html);
        var sel=document.getElementById('sel1');
        sel.onchange = function () {
           var id = this.value;
            for(var i = 0; i < data.aaData[1].length; i++){
                if(id == data.aaData[1][i].tid ){
                    $("#sel2").show();
                    findAll2();
                }else{
                    $("#sel2").hide();
                    $("#sel3").hide()
                }
            }
        }
    })
}
function findAll2() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        var html='<option>请选择</option>';
        var num = data.aaData[1].length;
        for(var i = 0; i < num; i++){
            html+='<option  value="'+data.aaData[1][i].id+'">'+data.aaData[1][i].serveClassname+'</option>';
        }
        $("#sel2").html(html);
        var sel=document.getElementById('sel2');
        sel.onchange = function () {
            var id = this.value;
            for(var i = 0; i < data.aaData[2].length; i++){
                if(id == data.aaData[2][i].tid ){
                    $("#sel3").show();
                    findAll3();
                }else{
                    $("#sel3").hide()
                }
            }
        }
    })
}
function  findAll3() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        var html='<option>请选择</option>';
        var num = data.aaData[2].length;
        for(var i = 0; i < num; i++){
            html+='<option  value="'+data.aaData[2][i].id+'">'+data.aaData[2][i].serveClassname+'</option>';
        }
        $("#sel3").html(html);
    })
}
function del(id) {
    var url = domainUrl+"/serve/service_classes/del";
    var postData = {id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
    })
}
/**
 * Created by horo on 2016/10/13.
 */
$(function () {
    findAll1();
})
function add() {
    var classname = $("#className").val();
    var tid = $("#classTid").val();
    var url = domainUrl+"/serve/service_classes/add";
    var postData = {serveClassname:classname,tid:tid}
    postAjax(url,false,postData,function (data) {
        alert("添加成功")
        location.reload();
    })
}
function openModal(tid) {
    $('#myModal').modal("show");
    $("#classTid").val(tid)
}
// function findAll() {
//     var url=domainUrl+"/serve/service_classes/findTreeAll";
//     var currentPage = 1;
//     var limit = 5;
//     var getData = {currentPage:currentPage,limit:limit};
//     getAjax(url,false,getData,function (data) {
//         var html='<option>请选择</option>';
//         console.log(JSON.stringify(data))
//         var num = data.aaData[0].length;
//         for(var i = 0; i < num; i++){
//             html+='<option  value="'+data.aaData[0][i].id+'">'+data.aaData[0][i].serveClassname+'</option>';
//         }
//     $("#sel1").html(html);
//         var sel=document.getElementById('sel1');
//         sel.onchange = function () {
//            var id = this.value;
//             for(var i = 0; i < data.aaData[1].length; i++){
//                 if(id == data.aaData[1][i].tid ){
//                     $("#sel2").show();
//                     findAll2();
//                 }else{
//                     $("#sel2").hide();
//                     $("#sel3").hide()
//                 }
//             }
//         }
//     })
// }
// function findAll2() {
//     var url=domainUrl+"/serve/service_classes/findTreeAll";
//     var currentPage = 1;
//     var limit = 5;
//     var getData = {currentPage:currentPage,limit:limit};
//     getAjax(url,false,getData,function (data) {
//         var html='<option>请选择</option>';
//         var num = data.aaData[1].length;
//         for(var i = 0; i < num; i++){
//             html+='<option  value="'+data.aaData[1][i].id+'">'+data.aaData[1][i].serveClassname+'</option>';
//         }
//         $("#sel2").html(html);
//         var sel=document.getElementById('sel2');
//         sel.onchange = function () {
//             var id = this.value;
//             for(var i = 0; i < data.aaData[2].length; i++){
//                 if(id == data.aaData[2][i].tid ){
//                     $("#sel3").show();
//                     findAll3();
//                 }else{
//                     $("#sel3").hide()
//                 }
//             }
//         }
//     })
// }
// function  findAll3() {
//     var url=domainUrl+"/serve/service_classes/findTreeAll";
//     var currentPage = 1;
//     var limit = 5;
//     var getData = {currentPage:currentPage,limit:limit};
//     getAjax(url,false,getData,function (data) {
//         var html='<option>请选择</option>';
//         var num = data.aaData[2].length;
//         for(var i = 0; i < num; i++){
//             html+='<option  value="'+data.aaData[2][i].id+'">'+data.aaData[2][i].serveClassname+'</option>';
//         }
//         $("#sel3").html(html);
//     })
// }
function ShowHide(id) {
        if($(".e"+id+"").is(':hidden')){
            $(".e"+id+"").show()
            $("#y"+id+" i").removeClass("glyphicon-plus").addClass("glyphicon-minus");
        }else{
            $("#y"+id+" i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
            $(".e"+id+"").hide();
        }
}
function ShowHide2(id) {
    if($(".s"+id+"").is(':hidden')){
        $(".s"+id+"").show()
        $("#e"+id+" i").removeClass("glyphicon-plus").addClass("glyphicon-minus");
    }else{
        $("#e"+id+" i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
        $(".s"+id+"").hide();
    }
}
function findAll1() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    var html = '';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num1 = data.aaData[0].length;
        var num2 = data.aaData[1].length;
        var num3 = data.aaData[2].length;
        for(var i = 0; i< num1; i++){
                html+='<div class="ify-show" id="y'+data.aaData[0][i].id+'"> <div class="ify-left">' +
                    '<i class="glyphicon glyphicon-plus"></i><a id="yx'+data.aaData[0][i].id+'" onclick="ShowHide('+data.aaData[0][i].id+')" >'+data.aaData[0][i].serveClassname+'</a></div>' +
                    ' <div class="ify-right"><a onclick="openModal('+data.aaData[0][i].id+')">添加子类</a><a>修改本类</a><a onclick="del('+data.aaData[0][i].id+')">删除本类</a></div> </div>';
            //二级类别
            for(var j = 0; j< num2; j++){
                if(data.aaData[0][i].id ==data.aaData[1][j].tid ){
                    html+='<div class="ify-show2 e'+data.aaData[1][j].tid+'" id="e'+data.aaData[1][j].id+'" > <div class="ify-left2">' +
                        '<i class="glyphicon glyphicon-plus"></i><a id="ex'+data.aaData[1][j].id+'" onclick="ShowHide2('+data.aaData[1][j].id+')">'+data.aaData[1][j].serveClassname+'</a></div> ' +
                        '<div class="ify-right"><a onclick="openModal('+data.aaData[1][j].id+')">添加子类</a><a>修改本类</a><a onclick="del('+data.aaData[1][j].id+')">删除本类</a></div></div>';
                    //三级类别
                    for(var c = 0; c< num3; c++){
                        if(data.aaData[1][j].id ==data.aaData[2][c].tid ){
                            html+='<div class="ify-show2 s'+data.aaData[2][c].tid+'"> <div class="ify-left3"><a>'+data.aaData[2][c].serveClassname+'</a></div> ' +
                                '<div class="ify-right"><a>修改本类</a><a onclick="del('+data.aaData[2][c].id+')">删除本类</a></div> </div>'
                        }
                    }
                }
            }
        }
        $("#ify-show").html(html)
    })
}
function findAll2(id,html) {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        for(var i = 0; i< num1; i++){
            if(id ==data.aaData[1][i].tid ){
                html+='<div class="ify-show2" id="22" style="display: block;"> <div class="ify-left2">' +
                    '<i class="glyphicon glyphicon-plus"></i><a id="2">'+data.aaData[1][i].serveClassname+'</a></div> ' +
                    '<div class="ify-right"><a>添加子类</a><a>修改本类</a><a>删除本类</a></div> </div>';
            }
        }
    })
    return html;
}
function del(id) {
    var url = domainUrl+"/serve/service_classes/del";
    var postData = {id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
        location.reload();
    })
}
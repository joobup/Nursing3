/**
 * Created by horo on 2016/10/14.
 */
$(function () {
    $("#cao").click(function () {
        $("#update-btn").hide();
        $("#add-btn").show();
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
    // $("#leibie").bind("change",function(){
    //     if($(this).val()==0){
    //         return;
    //     }
    //     else{
    //         var id = $(this).val();
    //         leibieon(id);
    //     }
    // });
})
function findAllp() {
    var url = domainUrl + "/serve/services/findAll";
    var getData = {};
    var html = "";
    getAjax(url, false, getData, function (data) {
        var num = data.iTotalRecords;
        console.log(JSON.stringify(data) + "..." + num);
        for (var i = 0; i < num; i++) {
            html += ' <div class="serve-module-s"><i class="glyphicon glyphicon-pencil bianji" onclick="make(' + data.aaData[i].id + ')"></i>  <i class=" glyphicon glyphicon-remove shanchu" onclick="del(' + data.aaData[i].id + ')"></i><ul id="zuo-font">';
            html += '<li>服务标题<span>' + data.aaData[i].serveName + '</span></li><li>服务类别<span>' + data.aaData[i].serveClassify + '</span></li> <li>限制条件<span>' + data.aaData[i].serveLimit + '</span></li> <li>服务人数<span>' + data.aaData[i].servePeoples + '</span></li></ul>';
            html += '<ul id="you-font1"><li>服务简介</li> </ul> <ul id="you-font2"> <li>' + data.aaData[i].serveBiref + '</li></ul></div>';
        }
        $(".serve-module").html(html)
        })
}
function findAllb() {
    var url = domainUrl + "/serve/services/findAll";
    var getData = {};
    var html = "";
    getAjax(url, false, getData, function (data) {
        var num = data.iTotalRecords;
        console.log(JSON.stringify(data) + "..." + num);
        for (var i = 0; i < num; i++) {
            html+='<tr><td>' + data.aaData[i].serveName + '</td><td>' + data.aaData[i].serveClassify + '</td><td>' + data.aaData[i].serveLimit + '</td><td>' + data.aaData[i].servePeoples + '</td>';
            html+='<td>' + data.aaData[i].serveBiref + '</td><td><i class="glyphicon glyphicon-pencil bianji" onclick="make(' + data.aaData[i].id + ')"></i><i' +
                ' class="glyphicon glyphicon-remove shanchu" style="display: none" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
        }
         $("#aaa").append(html)
    })
}
// function classifyFindAll() {
//     var url=domainUrl+"/serve/service_classes/findAll";
//     var p = 1;
//     var ps = 5;
//     var getData = {currentPage:p,limit:ps};
//     getAjax(url,false,getData,function (data) {
//         console.log(JSON.stringify(data));
//         console.log(data.aaData[1]);
//         var num = data.iTotalRecords;
//         var html="<option>选择服务类别</option>";
//         for(var i = 0; i < num; i++){
//             if(data.aaData[i].serveClasslevel == 0){
//                 var id = data.aaData[i].id;
//                 html += '<option value="'+id+'">'+data.aaData[i].serveClassname+'</option>'
//             }
//         }
//         $("#leibie").html(html);
//     })
// }
// function leibieon(id) {
//     var url=domainUrl+"/serve/service_classes/findAll";
//     var p = 1;
//     var ps = 5;
//     var getData = {currentPage:p,limit:ps};
//     if(id != "选择服务类别"){
//
//         getAjax(url,false,getData,function (data) {
//             var num = data.iTotalRecords;
//             var html='<select name=""  class="form-control leibies">';
//             for(var i = 0; i < num; i++){
//                 if(data.aaData[i].tid == id){
//                     html+='<option onclick="leibieon(id)">'+data.aaData[i].serveClassname+'</option>';
//                 }
//             }
//             html+='</select>';
//             $("#leibie").after(html);
//         })
//     }else{
//         $(".leibies").remove();
//     }
// }
function add() {
    var serveClassify = $("#leibie").val();
    var serveName = $("#mingcheng").val();
    var serveBiref = $("#jianjie").val();
    var serveLimit = $("#tiaojian").val();
    var servePeoples = $("#renshu").val();
    var url = domainUrl + "/serve/services/add";
    var postData = {
        serveName: serveName,
        serveLimit: serveLimit,
        servePeoples: servePeoples,
        serveBiref: serveBiref,
        serveClassify: serveClassify,
        agencyId: 1
    };
    $(".null").siblings().val();
    postAjax(url, false, postData, function (data) {
        alert("添加成功")
        location.reload()
    })
}
function del(id) {
    var url = domainUrl + "/serve/services/del";
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        console.log(JSON.stringify(data))
        alert("删除成功!")
        location.reload();
    })
}
function make(id) {
    $("#update-btn").show();
    $("#add-btn").hide();
    var url = domainUrl + "/serve/services/findAll";
    var getData = {};
    var ify, name, biref, limit, peoples, xid;
    getAjax(url, false, getData, function (data) {
        var num = data.iTotalRecords;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[i].id) {
                ify = data.aaData[i].serveClassify;
                name = data.aaData[i].serveName;
                biref = data.aaData[i].serveBiref;
                limit = data.aaData[i].serveLimit;
                peoples = data.aaData[i].servePeoples;
                xid = data.aaData[i].id;
                $("#leibie").val(ify);
                $("#mingcheng").val(name);
                $("#tiaojian").val(limit);
                $("#jianjie").val(biref);
                $("#renshu").val(peoples);
                $("#xid").val(xid)
            }
        }
        $('#myModal').modal("show");
    })
}
function update() {
    var serveClassify = $("#leibie").val();
    var serveName = $("#mingcheng").val();
    var serveBiref = $("#jianjie").val();
    var serveLimit = $("#tiaojian").val();
    var servePeoples = $("#renshu").val();
    var id = $("#xid").val();
    var url = domainUrl + "/serve/services/update";
    var postData = {
        id: id,
        serveName: serveName,
        serveLimit: serveLimit,
        servePeoples: servePeoples,
        serveBiref: serveBiref,
        serveClassify: serveClassify,
        agencyId: 1
    };
    postAjax(url, false, postData, function (data) {
        alert("修改成功")
        location.reload()
    })
}
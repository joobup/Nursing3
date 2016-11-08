/**
 * Created by horo on 2016/10/14.
 */
$(function () {
    cost();
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
    /*时间控件*/
    $(function(){
        $('.date_picker').date_input();
    })

})
var pageList;
var pageNp =1;
function findAllp(currentPage) {
    var url = domainUrl + "/serve/services/findAll";
    var limit = 9;
    var getData = {currentPage: currentPage, limit: limit};
    var html = "";
    var picture='';
    getAjax(url, false, getData, function (data) {
        pageList = Math.ceil(data.iTotalRecords / limit);
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            if(data.aaData[i].mainPicture.pictureAddress ==null){
                picture = '<img style="width: 100px; height: 100px;cursor: pointer;" src="'+domainImg+'/assets/images/serve/add_img.png" onclick="uploadShow('+data.aaData[i].id+')"/>';
            }else{
                picture ='<img style="width: 100px; height: 100px;" src="'+domainFile+'/assets/uploadimg/'+data.aaData[i].mainPicture.pictureAddress+'" />';
            }
            html += ' <div class="serve-module-s"><i title="添加计费类别" data-toggle="modal"  data-target="#myModalCost" onclick="costAdd(' + data.aaData[i].id + ')" class="glyphicon' +
                ' glyphicon-plus"' +
                '     style="margin-right:30px;"></i>' +
                '<i   class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal"   onclick="make(' + data.aaData[i].id + ')"></i> ' +
                ' <i     class="' + ' glyphicon' + ' glyphicon-remove shanchu"    onclick="del(' + data.aaData[i].id + ')" title="删除"></i>';
            html +='<ul><li class="servePicture">'+picture+'</li></ul>';
            html += '<ul id="zuo-font"><li>服务标题<span>' + data.aaData[i].serveName + '</span></li><li>服务类别<span>' + data.aaData[i].serveClassify.serveClassname + '</span></li> <li>限制条件<span>' + data.aaData[i].serveLimit + '</span></li> <li>服务人数<span>' + data.aaData[i].servePeoples + '</span></li></ul>';
            html += '<ul id="you-font1"><li>服务简介</li> </ul> <ul id="you-font2"> <li>' + data.aaData[i].serveBiref + '</li></ul></div>';
        }

        $(".serve-module").html(html)
        if(pageNp == 1){
            pageNp =2 ;
            $(".tcdPageCode").createPage({
                pageCount: pageList,
                current: currentPage,
                backFn: function (p) {
                    findAllp(p)
                }
            });
        }
    })
}
var pageNb2 = 1;
function findAllb(currentPage) {
    var url = domainUrl + "/serve/services/findAll";
    var limit = 10;
    var getData = {currentPage: currentPage, limit: limit};
    var html = "<tbody> <tr> <th>服务标题</th> <th>服务类别</th> <th>限制条件</th> <th>服务人数</th> <th>服务简介</th> <th>操作</th> </tr> </tbody>";
    getAjax(url, false, getData, function (data) {
        pageList = Math.ceil(data.iTotalRecords / limit);
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            html += '<tr><td>' + data.aaData[i].serveName + '</td><td>' + data.aaData[i].serveClassify.serveClassname + '</td><td>' + data.aaData[i].serveLimit + '</td><td>' + data.aaData[i].servePeoples + '</td>';
            html += '<td>' + data.aaData[i].serveBiref + '</td><td><i title="添加计费类别" data-toggle="modal"  data-target="#myModalCost" onclick="costAdd(' + data.aaData[i].id + ')" class="glyphicon' +
                ' glyphicon-plus"' +
                '   ></i><i class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal" onclick="make(' + data.aaData[i].id + ')"></i><i' +
                ' class="glyphicon glyphicon-remove shanchu" title="删除" style="display: none" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
        }
        $("#aaa").html(html)
        if(pageNb2 == 1){
            pageNb2 =2;
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
function cost() {
    var url = domainUrl + "/serve/service_classes_valuation/findAll"
    var getData = {currentPage:1,limit:1000};
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        var html="<option>请选择</option>";
        for(var i =0;  i < num ; i++){
            html +='<option value="'+data.aaData[i].id+'">'+data.aaData[i].classesValuationName+'</option>';
        }
        $("#serveCost").html(html)
    })
}
function costAdd(id) {
    $("#add-cost").click(function () {
        var url=domainUrl +'/serve/service_classes_valuation_relation/add';
        var serveCost = $("#serveCost2").val();
        var price = $("#costPirce2").val();
        var serveId = id;
        var postData = {
            valuationId:serveCost,
            price:price,
            serveId:serveId,
        };
        postAjax(url,false,postData,function (data) {
            alert("添加成功");
            findAllp(1);
            $('#myModal').modal("hide");
        })
    })
}
var serveClassify ;
function add() {
    var serveCost = $("#serveCost").val();
    var price = $("#costPirce").val();
    var serveName = $("#mingcheng").val();
    var serveBiref = $("#jianjie").val();
    var serveLimit = $("#tiaojian").val();
    var servePeoples = $("#renshu").val();
    var url = domainUrl + "/serve/services/add";
    var postData = {
        valuationId:serveCost,
        price:price,
        serveName: serveName,
        serveLimit: serveLimit,
        servePeoples: servePeoples,
        serveBiref: serveBiref,
        serveClassify: serveClassify,
        agencyId: 1
    };
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
        findAllp(1);
        $('#myModal').modal("hide");
    })
}
function del(id) {
    var url = domainUrl + "/serve/services/del";
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        alert("删除成功!")
        findAllp(1);
    })
}
function make(id) {
    findAll();
    $("#update-btn").show();
    $("#add-btn").hide();
    var url = domainUrl + "/serve/services/findAll";
    var getData = {};
    var  name, biref, limit, peoples, xid,price;
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[i].id) {
                price = data.aaData[i].price;
                name = data.aaData[i].serveName;
                biref = data.aaData[i].serveBiref;
                limit = data.aaData[i].serveLimit;
                peoples = data.aaData[i].servePeoples;
                xid = data.aaData[i].id;
                $("#costPirce").val(price);
                $("#mingcheng").val(name);
                $("#tiaojian").val(limit);
                $("#jianjie").val(biref);
                $("#renshu").val(peoples);
                $("#xid").val(xid)
            }
        }
    })
}
function update() {
    /*暂时不加图片*/
    var serveName = $("#mingcheng").val();
    var serveBiref = $("#jianjie").val();
    var serveLimit = $("#tiaojian").val();
    var servePeoples = $("#renshu").val();
    var id = $("#xid").val();
    var url = domainUrl + "/serve/services/update";
    var postData = {
        id: id,
        // pictureAddress:pictureAddress,
        serveName: serveName,
        serveLimit: serveLimit,
        servePeoples: servePeoples,
        serveBiref: serveBiref,
        serveClassify: serveClassify,
        agencyId: 1
    };
    postAjax(url, false, postData, function (data) {
        alert("修改成功")
        findAllp(1);
        $('#myModal').modal("hide");
    })
}
function upload(id) {
    $("#aaaa").hide();
    $("#box").hide();
    var url =domainUrl+'/serve/services_picture/adds';
    var postData ={
        serviceId:id,
        pictureAddress:pathList,
    };
    postAjax(url,false,postData,function (data) {
        alert("上传成功");
        findAllp(1);
    })
}
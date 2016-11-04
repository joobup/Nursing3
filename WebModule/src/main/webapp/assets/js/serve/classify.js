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
        alert("添加成功");
        $('#myModal').modal("hide");
        findAll1();
    })
}
function openModal(tid) {
    $('#myModal').modal("show");
    $("#classTid").val(tid)
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
                html+='<li style="border-top:1px solid #dddddd"><a href="#" class="one">'+data.aaData[0][i].serveClassname+'</a><cc><a onclick="openModal('+data.aaData[0][i].id+')">添加子类</a>' +
                    '<a onclick="make('+data.aaData[0][i].id+')">修改本类</a><a onclick="del('+data.aaData[0][i].id+')">删除本类</a></cc>';
            if(num2>=1){
                html+='<ul style="display: none;">';
                for(var j=0; j<num2;j++){
                    if(data.aaData[0][i].id ==data.aaData[1][j].tid ){
                        html+='<li><a href="#" class="one">'+data.aaData[1][j].serveClassname+'</a><cc><a onclick="openModal('+data.aaData[1][j].id+')">添加子类</a>' +
                            '<a onclick="make('+data.aaData[1][j].id+')">修改本类</a><a onclick="del('+data.aaData[1][j].id+')">删除本类</a></cc>';
                        if(num3>=1){
                            html+='<ul style="display:none;">';
                            for(var c = 0; c<num3; c++){
                                if(data.aaData[1][j].id ==data.aaData[2][c].tid){
                                    html+='<li><a>'+data.aaData[2][c].serveClassname+'</a><cc><a onclick="make('+data.aaData[2][c].id+')">修改本类</a><a onclick="del('+data.aaData[2][c].id+')">删除本类</a></cc></li>';
                                }
                            }
                            html+='</ul>'
                        }
                        html+='</li>';
                    }
                }
                html+='</ul>'
            }
            html+='</li>'
        }
        $("#ify-show").html(html)
        $(".one").click(function () {
            if($(this).siblings("ul").css("display")=="none"){
                $(this).siblings("ul").slideDown(200).children("li")
            }else{
                //控制自身菜单下子菜单隐藏
                $(this).siblings('ul').slideUp(100);
                //控制自身菜单下子菜单隐藏
                $(this).siblings('ul').children('li').children('ul').slideUp(100);
            }
        })
    })
}
function make(id) {
    $('#myModal').modal("show");
    $("#add-btn").hide();
    $("#update-btn").show();
    $("#classTid").val(id);
}
function update() {
    var url=domainUrl+"/serve/service_classes/update";
    var id = $("#classTid").val();
    var className = $("#className").val();
    console.log(id+".."+className);
    var postData={id:id,serveClassname:className}
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        $('#myModal').modal("hide");
        findAll1();
    })
}
function del(id) {
    var url = domainUrl+"/serve/service_classes/del";
    var postData = {id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
        findAll1();
    })
}
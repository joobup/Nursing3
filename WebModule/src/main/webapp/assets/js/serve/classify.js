/**
 * Created by horo on 2016/10/13.
 */
$(function () {
    findAll1();
})
function add() {
    var classname = $("#className").val();
    var tid = $("#classTid").val();
    var url = domainUrl + "/serve/service_classes/add";
    var postData = {serveClassname: classname, tid: tid}
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
        findAll1();
        $("#myModal").modal("hide")
    })
}
function clearModal() {
    $("#className").val("");
}
function openModal(tid) {
    $('#myModal').modal("show");
    $("#classTid").val(tid)
    clearModal();
}
function findAll1() {
    var url = domainUrl + "/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 20;
    var getData = {currentPage: currentPage, limit: limit};
    var html = '';
    getAjax(url, false, getData, function (data) {
        if (data.aaData[1] != undefined) {
            var num2 = data.aaData[1].length;
        } else {
            var num2 = 0;
        }
        if (data.aaData[2] != undefined) {
            var num3 = data.aaData[2].length;
        }else{
            var num3 = 0;
        }
        var num1 = data.aaData[0].length;
        for (var i = 0; i < num1; i++) {
            html += '<li style="border-top:1px solid #C3C1C4"><a href="#" class="one"><i class="glyphicon glyphicon-plus"></i>' +
                '' + data.aaData[0][i].serveClassname + '</a><cc><a' + ' onclick="openModal(' + data.aaData[0][i].id + ')">添加子类</a>' +
                '<a onclick="make(' + data.aaData[0][i].id + ')">修改本类</a><a onclick="del(' + data.aaData[0][i].id + ')">删除本类</a></cc>';
            if (num2 >= 1) {
                html += '<ul style="display: none;">';
                for (var j = 0; j < num2; j++) {
                    if (data.aaData[0][i].id == data.aaData[1][j].tid) {
                        html += '<li><a href="#" class="one"><i class="glyphicon glyphicon-plus aaa"></i>' + data.aaData[1][j].serveClassname + '</a><cc>' +
                            '<a onclick="openModal(' + data.aaData[1][j].id + ')">添加子类</a>' +
                            '<a onclick="make(' + data.aaData[1][j].id + ')">修改本类</a><a onclick="del(' + data.aaData[1][j].id + ')">删除本类</a></cc>';
                        if (num3 >= 1) {
                            html += '<ul style="display:none;">';
                            for (var c = 0; c < num3; c++) {
                                if (data.aaData[1][j].id == data.aaData[2][c].tid) {
                                    html += '<li><a>' + data.aaData[2][c].serveClassname + '</a><cc><a onclick="make(' + data.aaData[2][c].id + ')">修改本类</a><a onclick="del(' + data.aaData[2][c].id + ')">删除本类</a></cc></li>';
                                }
                            }
                            html += '</ul>'
                        }
                        html += '</li>';
                    }
                }
                html += '</ul>'
            }
            html += '</li>'
        }
        $("#ify-show").html(html)
        $(".one").click(function () {
            if ($(this).siblings("ul").css("display") == "none") {
                $(this).siblings("ul").slideDown(200).children("li");
                $(this).children("i").addClass("glyphicon-minus").removeClass("glyphicon-plus")
            } else {
                //控制本级图标变化
                $(this).children("i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
                //控制子级图标变化
                $(this).siblings("ul").find("i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
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
    var url = domainUrl + "/serve/service_classes/update";
    var id = $("#classTid").val();
    var className = $("#className").val();
    var postData = {id: id, serveClassname: className}
    postAjax(url, false, postData, function (data) {
        alert("修改成功");
        findAll1();
        $('#myModal').modal("hide");
    })
}
function del(id) {
    var url = domainUrl + "/serve/service_classes/del";
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        alert("删除成功")
        findAll1(1);
    })
}
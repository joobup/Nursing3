/**
 * Created by horo on 2016/11/12.
 */
$(function () {
    findAll();
    bedType();
})
function add() {
    var price = $("#price").val();
    var url = domainUrl + "/serve/bed_type_price/add";
    var postData = {
        price:price,
        bedTypeId:bedType,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll();
        $("#myModal").modal("hide")
    })
}
function findAll() {
    var url = domainUrl + "/serve/bed_type_price/findAll"
    var getData = {currentPage:1,limit:1000};
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        var html="";
        for(var i =0;  i < num ; i++){
            html +='<div class="cost-box">'+data.aaData[i].price+'' +
                '<i class="glyphicon glyphicon-remove" id="cost-del" onclick="del('+data.aaData[i].id+')"></i> </div>';
        }
        $("#cost-pack").html(html)
    })
}
function del(id) {
    var url = domainUrl + "/serve/bed_type_price/del";
    var postData = {id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll();
    })
}
//类别树
var bedType;
function bedType() {
    var url = domainUrl+"/serve/bed_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].bedTypeName + '</option>';
        }
        $("#bedTypeId").html(html);
        var type = document.getElementById('bedTypeId');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr2").show();
                        bedType2();
                        bedType = null;
                    } else {
                        var selectIndex = document.getElementById("bedTypeId").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("bedTypeId").options[selectIndex].value //获得被选中的项目
                        bedType = selectText;
                        $("#tr2").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("bedTypeId").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("bedTypeId").options[selectIndex].value //获得被选中的项目
                bedType = selectText;
                $("#tr2").hide();
            }
        }
    })
}
function bedType2() {
    var url = domainUrl+"/serve/bed_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].bedTypeName + '</option>';
        }
        $("#bedTypeId2").html(html);
        var type = document.getElementById('bedTypeId2');
        type.onchange = function () {
            var selectIndex = document.getElementById("bedTypeId2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("bedTypeId2").options[selectIndex].value //获得被选中的项目
            bedType = selectText;
        }
    })
}

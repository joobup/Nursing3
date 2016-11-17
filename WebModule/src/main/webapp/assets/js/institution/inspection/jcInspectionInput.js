/**
 * Created by horo on 2016/11/17.
 */
$(function () {
    findAll();
    findName();
    findAllp()
})
function add() {
    var url = domainUrl + '/serve/inspection_item_inspection/add';
    var postData = {
        inspectionId:name,
        inspectionItemId:1,
        inspectionItemValue:1,
        inspectionItemSelectValueId:1,
        servicePeopleId:1,
    }
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        $("#myModal").modal("hide")
    })
}
function findAll() {
    var url = domainUrl + '/serve/inspection_item_inspection/findAll';
    var getData = {
        currentPage:1,
        limit:9,
    };
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData.length;
        for(var i = 0; i< num; i++){
            html += ' <div class="serve-module-s"> <i class=" glyphicon glyphicon-remove shanchu" style="display: block;"' +
                ' onclick="del(' + data.aaData[i].id + ')" title="删除"></i></div>';
        }
    })
}
function del(id) {
    var url = domainUrl + "/serve/inspection_item_inspection/del";
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        alert("删除成功")
        findAll();
    })
}
var name;
function addName() {
    var type = document.getElementById('inspectionId');
    type.onchange = function () {
        var selectIndex = document.getElementById("inspectionId").selectedIndex;//获得是第几个被选中了
        var selectText = document.getElementById("inspectionId").options[selectIndex].value //获得被选中的项目
        name = selectText;
    }
}
function findName() {
    var url = domainUrl+'/serve/inspection/findAll';
    var getData = {
        currentPage:1,
        limit:100000,
    };
    var html='<option>请选择</option>';
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0; i<num;i++){
            html+='<option value="'+data.aaData[i].id+'">'+data.aaData[i].inspectionName+'</option>'
        }
        $("#inspectionId").html(html)
    })
}
function findAllp() {
    var url = domainUrl + "/serve/services/findAll";
    var limit = 9;
    var getData = {currentPage: 1, limit: limit};
    var html = "";
    var picture='';
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {

        }
        $(".serve-module").html(html)
    })
}
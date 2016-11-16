/**
 * Created by horo on 2016/11/7.
 */
/*检查模块*/
//添加
$(function () {
    //标签样式
    $(".typeStyle").click(function () {
        $(this).addClass("backColor").siblings(".typeStyle").removeClass("backColor")
    })
})
function add() {
    var url = domainUrl+'/serve/inspection/add';
    var inspectionItemId

    var postData = {
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
    })
}
//查看
function findAll(currentPage) {
    var url = domainUrl+'/serve/inspection/findAll';
    var getData={
        currentPage:currentPage,
        limit:limit,
    };
    var html ='';
    getAjax(url,false,getData,function (data) {

    })
}
//删除
function del(id) {
    var url = domainUrl+'/serve/inspection/del';
    var postData = {
        id:id
    };
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll(1);
    })
}
//修改
function update(id) {
    var url = domainUrl+'/serve/inspection/update';
    var inspectionItemName = $("#inspectionItemName").val();
    var normalValueUpperLimit = $("#normalValueUpperLimit").val();
    var normalValueUpperFloor = $("#normalValueUpperFloor").val();
    var inspectionItemValueType  = $("#inspectionItemValueType").val();
    var unit = $("#unit").val();
    var inspectionItemNameKey = $("#inspectionItemNameKey").val();
    var inspectionItemDescribe = $("#inspectionItemDescribe").val();
    var postData = {
        id:id,
        inspectionItemName:inspectionItemName,
        normalValueUpperLimit:normalValueUpperLimit,
        normalValueUpperFloor:normalValueUpperFloor,
        inspectionItemValueType:inspectionItemValueType,
        unit:unit,
        inspectionItemNameKey:inspectionItemNameKey,
        inspectionItemDescribe:inspectionItemDescribe
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
    })
}
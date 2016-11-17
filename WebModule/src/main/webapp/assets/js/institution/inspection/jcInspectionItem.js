/*检查模块*/
$(function () {
    findAll(1);
    //判断值类型
    var optionHtml = ' <tr id="startOption"> <td></td> <td><input type="text" name="name" id="inspectionItemName"></td> <td></td> </tr>';
    $("#addOption").click(function () {
        $("#startOption").after(optionHtml)
    })
})
//添加
function add() {
    var url = domainUrl+'/serve/inspection_item/add';
    var inspectionItemName = $("#inspectionItemName").val();
    var normalValueUpperLimit = $("#normalValueUpperLimit").val();
    var normalValueUpperFloor = $("#normalValueUpperFloor").val();
    var inspectionItemValueType  = $("#inspectionItemValueType").val();
    var unit = $("#unit").val();
    var inspectionItemDescribe = $("#inspectionItemDescribe").val();
    var pinyinKey = codefans_net_CC2PY(inspectionItemName);
    var postData = {
        inspectionItemName:inspectionItemName,
        normalValueUpperLimit:normalValueUpperLimit,
        normalValueUpperFloor:normalValueUpperFloor,
        inspectionItemValueType:inspectionItemValueType,
        unit:unit,
        inspectionItemNameKey:pinyinKey,
        inspectionItemDescribe:inspectionItemDescribe
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
//查看
var pageNb = 1;
var pageList;
function findAll(currentPage) {
    var url = domainUrl+'/serve/inspection_item/findAll';
    var getData={
        currentPage:currentPage,
        limit:limit,
    };
    var html = "<tbody> <tr> <th>检查名</th> <th>上限值</th> <th>下限值</th> <th>表单类型</th><th>单位</th><th>检查描述</th> <th>操作</th> </tr> </tbody>";
    getAjax(url,false,getData,function (data) {
        pageList = Math.ceil(data.iTotalRecords / limit);
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            html += '<tr><td>' + data.aaData[i].inspectionItemName.substring(0,12) + '</td><td>' + data.aaData[i].normalValueUpperLimit + '</td><td>' + data.aaData[i].normalValueUpperFloor + '</td>' +
                '<td>' + data.aaData[i].inspectionItemValueType + '</td>';
            html += '<td>' + data.aaData[i].inspectionItemDescribe.substring(0,36) + '...</td><td>'+data.aaData[i].unit+'</td><td><i data-toggle="modal"' +
                '  data-target="#myModalCost"' + ' onclick="addInput(' + data.aaData[i].id + ')" class="glyphicon' + ' glyphicon-plus"' +
                '   ></i><i class="glyphicon glyphicon-remove shanchu" title="删除" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
        }
        $("#aaa").html(html)
        if(pageNb == 1){
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
//删除
function del(id) {
    var url = domainUrl+'/serve/inspection_item/del';
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
    var url = domainUrl+'/serve/inspection_item/update';
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
//添加值类型框
function addInput(id) {
    $("#myModal2").modal("show");
    $("#typeId").val(id)
}
function addValue() {
    var typeString = $("#form").serialize();
    var selectName = typeString.replace(/name=/g,"");
    selectName = selectName.replace(/&/g,",")
    var id = $("#typeId").val();
    var selectNameKey = codefans_net_CC2PY(selectName);
    var url = domainUrl +'/serve/inspection_item_select_value/add';
    var postData = {
        inspectionItemId:id,
        selectName:selectName,
        selectValue:1,
        selectNameKey:selectNameKey,
    }
    postAjax(url,false,postData,function (data) {
        alert("添加成功")
    })
}

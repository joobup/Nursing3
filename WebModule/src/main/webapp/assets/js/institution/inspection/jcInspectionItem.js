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
            var addInput;
            if(data.aaData[i].inspectionItemValueType == 1){
                 addInput = ''
            }else
            {
                 addInput = '<i data-toggle="modal" data-target="#myModalCost"  onclick="addInput(' + data.aaData[i].id + ')" class="glyphicon glyphicon-plus"></i>'
            }
            html += '<tr><td>' + data.aaData[i].inspectionItemName.substring(0,12) + '</td><td>' + data.aaData[i].normalValueUpperLimit + '</td><td>' + data.aaData[i].normalValueUpperFloor + '</td>' +
                '<td>' + data.aaData[i].inspectionItemValueType + '</td>';
            html += '<td>' + data.aaData[i].inspectionItemDescribe.substring(0,36) + '...</td><td>'+data.aaData[i].unit+'</td><td>' +
                ''+addInput+'<i class="glyphicon glyphicon-remove shanchu" title="删除" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';
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
        $("#myModal").modal("hide");
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
    selectName = getCharFromUtf8(selectName);
    console.log(selectName)
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
        $("#myModal2").modal("hide");
    })
}
function getCharFromUtf8(str) {
    var cstr = "";
    var nOffset = 0;
    if (str == "")
        return "";
    str = str.toLowerCase();
    nOffset = str.indexOf("%e");
    if (nOffset == -1)
        return str;
    while (nOffset != -1) {
        cstr += str.substr(0, nOffset);
        str = str.substr(nOffset, str.length - nOffset);
        if (str == "" || str.length < 9)
            return cstr;
        cstr += utf8ToChar(str.substr(0, 9));
        str = str.substr(9, str.length - 9);
        nOffset = str.indexOf("%e");
    }
    return cstr + str;
}
//将编码转换成字符
function utf8ToChar(str) {
    var iCode, iCode1, iCode2;
    iCode = parseInt("0x" + str.substr(1, 2));
    iCode1 = parseInt("0x" + str.substr(4, 2));
    iCode2 = parseInt("0x" + str.substr(7, 2));
    return String.fromCharCode(((iCode & 0x0F) << 12) | ((iCode1 & 0x3F) << 6) | (iCode2 & 0x3F));
}

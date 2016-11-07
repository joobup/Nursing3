/**
 * Created by horo on 2016/11/7.
 */
/*服务对象状态表*/
//添加
$(function () {
    findAll(1);
})
function add() {
    var url = domainUrl + "/serve/service_people_state/add";
    var servicePeopleStateName = $("#servicePeopleStateName").val();
    var servicePeopleStateLevel = $("#servicePeopleStateLevel").val();
    var tid = $("#tid").val();
    var postData = {
        servicePeopleStateName:servicePeopleStateName,
        servicePeopleStateLevel:servicePeopleStateLevel,
        tid:1,
    }
    postAjax(url,false,postData,function (data) {
        alert("添加成功")
        findAll(1);
    })
}
//查看
function findAll(currentPage) {
    var url = domainUrl + "/serve/service_people_state/findAll";
    var getData = {
        currentPage:currentPage,
        limit:limit,
    }
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
//刪除
function del(id) {
    var url = domainUrl + "/serve/service_people_state/del";
    var postData = {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("刪除成功");
        findAll(1);
    })
}
//修改
function update(id) {
    var url = domainUrl + "/serve/service_people_state/update";
    var servicePeopleStateName = $("#servicePeopleStateName").val();
    var servicePeopleStateLevel = $("#servicePeopleStateLevel").val();
    var tid = $("#tid").val();
    var postData = {
        id:id,
        servicePeopleStateName:servicePeopleStateName,
        servicePeopleStateLevel:servicePeopleStateLevel,
        tid:tid,
    }
    postAjax(url,false,postData,function (data) {
        alert("修改成功")
        findAll(1);
    })
}
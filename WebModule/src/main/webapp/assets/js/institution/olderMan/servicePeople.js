/**
 * Created by horo on 2016/11/7.
 */
/*服务对象模块*/
//添加
$(function () {
    findAll(1);
})
function add() {
    var url = domainUrl + '/serve/service_people/add';
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeoplePicture = $("#servicePeoplePicture").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var servicePeopleStateId = $("#servicePeopleStateId").val();
    var servicePeopleTypeId = $("#servicePeopleTypeId").val();
    var nursingLeave = $("#nursingLeave").val();
    var postData = {
        servicePeopleName:servicePeopleName,
        servicePeopleAge:servicePeopleAge,
        servicePeopleSex:servicePeopleSex,
        servicePeopleRelation:servicePeopleRelation,
        servicePeoplePicture:servicePeoplePicture,
        servicePeopleAttention:servicePeopleAttention,
        userId:userId,
        servicePeopleTel:servicePeopleTel,
        servicePeopleStateId:servicePeopleStateId,
        servicePeopleTypeId:servicePeopleTypeId,
        nursingLeave:nursingLeave,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
    })
}
//查询
function findAll(currentPage) {
    var url  = domainUrl + '/serve/service_people/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit
    };
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
//删除
function del(id) {
    var url = domainUrl + '/serve/service_people/del';
    var postData = {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
        findAll(1);
    })
}
function update(id) {
    var url = domainUrl + '/serve/service_people/update';
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeoplePicture = $("#servicePeoplePicture").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var servicePeopleStateId = $("#servicePeopleStateId").val();
    var servicePeopleTypeId = $("#servicePeopleTypeId").val();
    var nursingLeave = $("#nursingLeave").val();
    var postData = {
        id:id,
        servicePeopleName:servicePeopleName,
        servicePeopleAge:servicePeopleAge,
        servicePeopleSex:servicePeopleSex,
        servicePeopleRelation:servicePeopleRelation,
        servicePeoplePicture:servicePeoplePicture,
        servicePeopleAttention:servicePeopleAttention,
        userId:userId,
        servicePeopleTel:servicePeopleTel,
        servicePeopleStateId:servicePeopleStateId,
        servicePeopleTypeId:servicePeopleTypeId,
        nursingLeave:nursingLeave,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
    })
}
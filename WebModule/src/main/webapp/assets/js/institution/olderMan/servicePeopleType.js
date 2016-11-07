/**
 * Created by horo on 2016/11/7.
 */
/*服务对象类型*/
//添加
$(function () {
    findAll(1);
})
function add() {
    var url = domainUrl + '/serve/service_people_type/add';
    var serviceTypePeopleName = $("#serviceTypePeopleName").val();
    var serviceTypePeopleLevel = $("#serviceTypePeopleLevel").val();
    var tid = $("#tid").val();
    var postData = {
        serviceTypePeopleName:serviceTypePeopleName,
        serviceTypePeopleLevel:serviceTypePeopleLevel,
        tid:tid,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(1);
    })
}
//查看
function findAll(currentPage) {
    var url = domainUrl + '/serve/service_people_type/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    }
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
//删除
function del(id) {
    var url = domainUrl + '/serve/service_people_type/del';
    var postData= {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll(1);
    })
}
//修改
function update(id) {
    var url = domainUrl + '/serve/service_people_type/update';
    var serviceTypePeopleName = $("#serviceTypePeopleName").val();
    var serviceTypePeopleLevel = $("#serviceTypePeopleLevel").val();
    var tid = $("#tid").val();
    var postData = {
        id:id,
        serviceTypePeopleName:serviceTypePeopleName,
        serviceTypePeopleLevel:serviceTypePeopleLevel,
        tid:tid,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
    })
}
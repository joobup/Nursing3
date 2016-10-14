/**
 * Created by horo on 2016/10/14.
 */
$(function () {
    findAll()
})
function add() {
    var staffname = $("#staffname").val();
    var staffsex = $("#staffsex").val();
    var staffpost = $("#staffpost").val();
    var staffskill = $("#staffskilllevel").val();
    var staffpicture = $("#staffpicture").val();
    var staffdepartment = $("#staffdepartment").val();
    var staffcard = $("#staffcard").val();
    var staffcall1 = $("#staffcall1").val();
    var staffcall2  = $("#staffcall2").val();
    var staffrank = $("#staffrank").val();
    var staffstatus = $("#staffstatus").val();
    var url = domainUrl + "/serve/service_staff/add";
    var postData = {staffName:staffname,staffSex:staffsex,staffPost:staffpost,staffSkillLevel:staffskill,staffPicture:staffpicture,staffCardId:staffcard,staffCall1:staffcall1,staffCall2:staffcall2,staffRank:staffrank,staffStatus:staffstatus,staffDepartment:staffdepartment};
    postAjax(url,false,postData,function (data) {
        console.log(JSON.stringify(data))
        var html="";
        var num = data.iTotalRecords;
        for(var i =0 ; i< num; i++){
            html+= '<p>data.aaData[i].staffName</p><input type="button" value="删除" onclick="del('+data.aaData[i].id+')"> ';
        }
    })
}
function del(id) {
    var url = domainUrl+"/serve/service_staff/del"
    var postData = {id:id}
    postAjax(url,false,postData,function (data) {
        alert("删除成功")
    })
}
function findAll() {
    var url = domainUrl + "/serve/service_staff/findAll";
    var getData = {};
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })    
}
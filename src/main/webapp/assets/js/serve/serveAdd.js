/**
 * Created by horo on 2016/10/13.
 */
$(function () {
    findAll();
})
function serveClassifyAdd() {
    var classname = $("#className").val();
    var classlevel = $("#classLevel").val();
    var url = domainUrl+"/serve/service_classes/add";
    var postData = {serveClassname:classname,tid:classlevel}
    postAjax(url,false,postData,function (data) {
        alert(JSON.stringify(data))
    })
}
function findAll() {
    var url=domainUrl+"/serve/service_classes/findAll";
    var p = 1;
    var ps = 5;
    var getData = {currentPage:p,limit:ps};
    getAjax(url,false,getData,function (data) {
        alert(JSON.stringify(data));
    })
}
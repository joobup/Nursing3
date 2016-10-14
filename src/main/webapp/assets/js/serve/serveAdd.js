/**
 * Created by horo on 2016/10/13.
 */
function serveClassifyAdd() {
    var classname = $("#className").val();
    var classlevel = $("#classLevel").val();
    var url = domainUrl+"/service_classes/add";
    var postData = {serveClassname:classname,serveClasslevel:classlevel}
    postAjax(url,false,postData,function (data) {
        alert("添加成功")
    })
}
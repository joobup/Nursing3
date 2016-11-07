/**
 * Created by horo on 2016/11/4.
 */
/*营养物质表*/
//添加
function foodAdd() {
    var url = domainUrl+"/serve/dishes/ys_nutriment/add";
    var nutrimentName = $("#nutrimentName").val();
    var nutrimentLevel = $("#nutrimentLevel").val();
    var tid = $("#tid").val();
    var postData = {
        nutrimentName:nutrimentName,
        nutrimentLevel:nutrimentLevel,
        tid:tid,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        foodFindAll();
    })
}
//查询
function foodFindAll(currentPage) {
    var url = domainUrl+"/serve/dishes/ys_nutriment/findAll";
    var html='';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    getAjax(url,false,getData,function (data) {

    })
}
//修改
function update(id) {
    var url = domainUrl+"/serve/dishes/ys_nutriment/update";
    var nutrimentName = $("#nutrimentName").val();
    var nutrimentLevel = $("#nutrimentLevel").val();
    var postData = {
        id:id,
        nutrimentName:nutrimentName,
        nutrimentLevel:nutrimentLevel,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        foodFindAll();
    })
}
//删除
function del(id) {
    var url = domainUrl + "/serve/dishes/ys_nutriment/del";
    var postData={id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        foodFindAll();
    })
}
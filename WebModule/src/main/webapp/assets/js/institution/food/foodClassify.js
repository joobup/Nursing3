/**
 * Created by horo on 2016/11/4.
 */
/*菜品类别*/
//添加
function foodAdd() {
    var url = domainUrl+"/serve/dishes/ys_dishes_type/add";
    var dishesTypeName = $("#dishesTypeName").val();
    var dishesTypeLeave = $("#dishesTypeLeave").val();
    var tid = $("#tid").val();
    var postData = {
        dishesTypeName:dishesTypeName,
        dishesTypeLeave:dishesTypeLeave,
        tid:tid,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        foodFindAll();
    })
}
//查询
var currentPage = 1;
var limit = 10;
function foodFindAll() {
    var url = domainUrl+"/serve/dishes/ys_dishes_type/findAll";
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    getAjax(url,false,getData,function (data) {

    })
}
//修改
function update(id) {
    var url = domainUrl+"/serve/dishes/ys_dishes_type/update";
    var dishesTypeName = $("#dishesTypeName").val();
    var dishesTypeLeave = $("#dishesTypeLeave").val();
    var tid = $("#tid").val();
    var postData = {
        id:id,
        dishesTypeName:dishesTypeName,
        dishesTypeLeave:dishesTypeLeave,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        foodFindAll();
    })
}
//删除
function del(id) {
    var url = domainUrl + "/serve/dishes/ys_dishes_type/del";
    var postData={id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        foodFindAll();
    })
}
/**
 * Created by horo on 2016/11/4.
 */
/*本周食谱*/
//添加
function foodAdd() {
    var url = domainUrl+"/serve/dishes/ys_week_food/add";
    var weekDate = $("#weekDate").val();
    var oneEarly = $("#oneEarly").val();
    var dishesList = $("#dishesList").val();
    var foodDate = $("#foodDate").val();
    var postData = {
        weekDate:weekDate,
        oneEarly:oneEarly,
        dishesList:dishesList,
        foodDate:foodDate,
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
    var url = domainUrl+"/serve/dishes/ys_week_food/findAll";
    var getData = {
        currentPage:currentPage,
        limit:limit,
    };
    getAjax(url,false,getData,function (data) {

    })
}
//修改
function update(id) {
    var url = domainUrl+"/serve/dishes/ys_week_food/update";
    var weekDate = $("#weekDate").val();
    var oneEarly = $("#oneEarly").val();
    var dishesList = $("#dishesList").val();
    var foodDate = $("#foodDate").val();
    var postData = {
        id:id,
        weekDate:weekDate,
        oneEarly:oneEarly,
        dishesList:dishesList,
        foodDate:foodDate,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        foodFindAll();
    })
}
//删除
function del(id) {
    var url = domainUrl + "/serve/dishes/ys_week_food/del";
    var postData={id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        foodFindAll();
    })
}
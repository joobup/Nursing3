/**
 * Created by horo on 2016/11/4.
 */
/*食材配料表*/
//添加
function foodAdd() {
    var url = domainUrl+"/serve/dishes/ys_food_meterial/add";
    var meterialTypeName = $("#meterialTypeName").val();
    var meterialTypeLevel = $("#meterialTypeLevel").val();
    var tid = $("#tid").val();
    var postData = {
        meterialTypeName:meterialTypeName,
        meterialTypeLevel:meterialTypeLevel,
        tid:tid,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        foodFindAll();
    })
}
//查询
function foodFindAll(currentPage) {
    var url = domainUrl+"/serve/dishes/ys_food_meterial/findAll";
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
    var url = domainUrl+"/serve/dishes/ys_food_meterial/update";
    var meterialTypeName = $("#meterialTypeName").val();
    var meterialTypeLevel = $("#meterialTypeLevel").val();
    var postData = {
        id:id,
        meterialTypeName:meterialTypeName,
        meterialTypeLevel:meterialTypeLevel,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        foodFindAll();
    })
}
//删除
function del(id) {
    var url = domainUrl + "/serve/dishes/ys_food_meterial/del";
    var postData={id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        foodFindAll();
    })
}
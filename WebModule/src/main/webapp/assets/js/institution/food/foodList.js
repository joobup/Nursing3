/**
 * Created by horo on 2016/11/3.
 */
/*菜品列表*/
/*添加*/
function foodAdd() {
    var url = domainUrl+"/serve/dishes/ys_dishes/add";
    var dishesName = $("#dishesName").val();
    var dishesTaste = $("#dishesTaste").val();
    var dishesAllergen = $("#dishesAllergen").val();
    var dishesSuitPeople = $("#dishesNutritiveValue").val();
    var dishesNutritiveValue = $("#dishesSuitPeople").val();
    var dishesWeight = $("#dishesWeight").val();
    var postData = {
        dishesName:dishesName,
        dishesTaste:dishesTaste,
        dishesAllergen:dishesAllergen,
        dishesSuitPeople:dishesSuitPeople,
        dishesNutritiveValue:dishesNutritiveValue,
        dishesWeight:dishesWeight
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        foodFindAll(1);
    })
}
/*查询*/
function foodFindAll(currentPage) {
    var url = domainUrl+"/serve/dishes/ys_dishes/findAll";
    var getData={currentPage:currentPage,limit:limit,};
    var html='';
    getAjax(url,false,getData,function (data) {

    })
}
/*删除*/
function foodDel(id) {
    var url = domainUrl+"/serve/dishes/ys_dishes/del";
    var postData = {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        foodFindAll(1);
    })
}
/*修改*/
function foodUpdate(id) {
    var url = domainUrl+"/serve/dishes/ys_dishes/update";
    var dishesName = $("#dishesName").val();
    var dishesTaste = $("#dishesTaste").val();
    var dishesAllergen = $("#dishesAllergen").val();
    var dishesSuitPeople = $("#dishesNutritiveValue").val();
    var dishesNutritiveValue = $("#dishesSuitPeople").val();
    var dishesWeight = $("#dishesWeight").val();
    var postData = {
        id:id,
        dishesName:dishesName,
        dishesTaste:dishesTaste,
        dishesAllergen:dishesAllergen,
        dishesSuitPeople:dishesSuitPeople,
        dishesNutritiveValue:dishesNutritiveValue,
        dishesWeight:dishesWeight
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        foodFindAll(1);
    })
}
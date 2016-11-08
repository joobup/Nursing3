/**
 * Created by horo on 2016/11/3.
 */
/*菜品列表*/
/*添加*/
$(function () {
    findAll(1);
})
function add() {
    var url = domainUrl+"/serve/dishes/add";
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
        findAll(1);
    })
}
/*查询*/
function findAll(currentPage) {
    var url = domainUrl+"/serve/dishes/findAll";
    var getData={currentPage:currentPage,limit:limit,};
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
/*删除*/
function del(id) {
    var url = domainUrl+"/serve/dishes/del";
    var postData = {
        id:id,
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll(1);
    })
}
/*修改*/
function update(id) {
    var url = domainUrl+"/serve/dishes/update";
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
        findAll(1);
    })
}
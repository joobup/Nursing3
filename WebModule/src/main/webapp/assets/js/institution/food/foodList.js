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
        $("#myModal").modal("hide");
    })
}
/*查询*/
function findAll(currentPage) {
    var url = domainUrl+"/serve/dishes/findAll";
    var getData={currentPage:currentPage,limit:limit,};
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        for(var i = 0; i <num ; i++){
            if(data.aaData[i].mainPicture.pictureAddress ==null){
                picture = '<img style="width: 100px; height: 100px;cursor: pointer;" src="'+domainImg+'/assets/images/serve/service.png" onclick="uploadShow('+data.aaData[i].id+')"/>';
            }else{
                picture ='<img style="width: 100px; height: 100px;" src="'+domainFile+'/assets/uploadimg/'+data.aaData[i].mainPicture.pictureAddress+'" onclick="uploadShow('+data.aaData[i].id+')" />';
            }
            html += ' <div class="serve-module-s"><i   class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal"   onclick="make(' + data.aaData[i].id + ')"></i> ' +
                ' <i     class=" glyphicon glyphicon-remove shanchu"    onclick="del(' + data.aaData[i].id + ')" title="删除"></i>';
            html +='<ul><li class="servePicture">'+picture+'</li></ul>';
            html += '<ul id="zuo-font"><li>服务标题<span>' + data.aaData[i].serveName + '</span></li><li>服务类别<span>' + data.aaData[i].serveClassify.serveClassname + '</span></li> <li>限制条件<span>' + data.aaData[i].serveLimit + '</span></li> <li>服务人数<span>' + data.aaData[i].servePeoples + '</span></li></ul>';
            html += '<ul id="you-font1"><li>服务简介</li> </ul> <ul id="you-font2"> <li>' + data.aaData[i].serveBiref + '</li></ul></div>';
        }
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
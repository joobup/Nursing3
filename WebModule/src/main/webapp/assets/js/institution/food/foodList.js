/**
 * Created by horo on 2016/11/3.
 */
/*菜品列表*/
/*添加*/
$(function () {
    findAll(1);
    foodClassify();
    foodMeterial();
    foodNutriment();
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
        dishesTaste:foodClassify,
        dishesAllergen:foodMeterial,
        dishesSuitPeople:dishesSuitPeople,
        dishesNutritiveValue:foodNutriment,
        dishesWeight:dishesWeight
    };
    console.log(postData)
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
        var picture;
        for(var i = 0; i <num ; i++){
            if(data.aaData[i].mainPicture.pictureAddress ==null){
                picture = '<img style="width: 100px; height: 100px;cursor: pointer;" src="'+domainImg+'/assets/images/serve/service.png" onclick="uploadShow('+data.aaData[i].id+')"/>';
            }else{
                picture ='<img style="width: 100px; height: 100px;" src="'+domainFile+'/assets/uploadimg/'+data.aaData[i].mainPicture.pictureAddress+'" onclick="uploadShow('+data.aaData[i].id+')" />';
            }
            html += ' <div class="serve-module-s"><i   class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal"  data-target="#myModal"   onclick="make(' + data.aaData[i].id + ')"></i> ' +
                ' <i     class=" glyphicon glyphicon-remove shanchu"    onclick="del(' + data.aaData[i].id + ')" title="删除"></i>';
            html +='<ul><li class="servePicture">'+picture+'</li></ul>';
            html += '<ul id="zuo-font"><li>菜品名称<span>' + data.aaData[i].dishesName + '</span></li><li>菜品口味<span>' + data.aaData[i].dishesTaste + '</span></li>' +
                ' <li>过敏原<span>' + data.aaData[i].dishesAllergen + '</span></li> <li>营养价值<span>' + data.aaData[i].dishesNutritiveValue + '</span></li></ul>';
            html += '<ul id="you-font1"><li>适合人群</li><li>重量</li> </ul> <ul id="you-font2"> <li>' + data.aaData[i].dishesSuitPeople + '</li><li>'+data.aaData[i].dishesWeight+'</li></ul></div>';
        }
        $(".serve-module").html(html)
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
/*图片上传*/
function upload(id) {
    $("#aaaa").hide();
    $("#box").hide();
    var url =domainUrl+'/serve/dishes_picture/adds';
    var postData ={
        dishesId:id,
        dishespictureService:pathList,
    };
    postAjax(url,false,postData,function (data) {
        alert("上传成功");
        findAll(1);
    })
}
/*树*/
//菜品分类
var foodClassify;
function foodClassify() {
    var url = domainUrl+"/serve/dishes_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].dishesTypeName + '</option>';
        }
        $("#dishesTaste").html(html);
        var type = document.getElementById('dishesTaste');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr2").show();
                        foodClassify2();
                        foodClassify = null;
                    } else {
                        var selectIndex = document.getElementById("dishesTaste").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("dishesTaste").options[selectIndex].value //获得被选中的项目
                        foodClassify = selectText;
                        $("#tr2").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("dishesTaste").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("dishesTaste").options[selectIndex].value //获得被选中的项目
                foodClassify = selectText;
                $("#tr2").hide();
            }
        }
    })
}
function foodClassify2() {
    var url = domainUrl+"/serve/dishes_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].dishesTypeName + '</option>';
        }
        $("#dishesTaste2").html(html);
        var type = document.getElementById('dishesTaste2');
        type.onchange = function () {
            var selectIndex = document.getElementById("dishesTaste2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("dishesTaste2").options[selectIndex].value //获得被选中的项目
            foodClassify = selectText;
        }
    })
}
//营养价值
var foodMeterial;
function foodMeterial() {
    var url = domainUrl+"/serve/food_meterial/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].meterialTypeName + '</option>';
        }
        $("#dishesAllergen").html(html);
        var type = document.getElementById('dishesAllergen');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr22").show();
                        foodMeterial2();
                        foodMeterial = null;
                    } else {
                        var selectIndex = document.getElementById("dishesAllergen").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("dishesAllergen").options[selectIndex].value //获得被选中的项目
                        foodMeterial = selectText;
                        $("#tr22").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("dishesAllergen").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("dishesAllergen").options[selectIndex].value //获得被选中的项目
                foodMeterial = selectText;
                $("#tr22").hide();
            }
        }
    })
}
function foodMeterial2() {
    var url = domainUrl+"/serve/food_meterial/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].meterialTypeName + '</option>';
        }
        $("#dishesAllergen2").html(html);
        var type = document.getElementById('dishesAllergen2');
        type.onchange = function () {
            var selectIndex = document.getElementById("dishesAllergen2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("dishesAllergen2").options[selectIndex].value //获得被选中的项目
            foodMeterial = selectText;
        }
    })
}
//食材配料
var foodNutriment;
function foodNutriment() {
    var url = domainUrl+"/serve/nutriment/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].nutrimentName + '</option>';
        }
        $("#dishesNutritiveValue").html(html);
        var type = document.getElementById('dishesNutritiveValue');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr222").show();
                        foodNutriment2();
                        foodNutriment = null;
                    } else {
                        var selectIndex = document.getElementById("dishesNutritiveValue").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("dishesNutritiveValue").options[selectIndex].value //获得被选中的项目
                        foodNutriment = selectText;
                        $("#tr222").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("dishesNutritiveValue").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("dishesNutritiveValue").options[selectIndex].value //获得被选中的项目
                foodNutriment = selectText;
                $("#tr222").hide();
            }
        }
    })
}
function foodNutriment2() {
    var url = domainUrl+"/serve/nutriment/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].nutrimentName + '</option>';
        }
        $("#dishesNutritiveValue2").html(html);
        var type = document.getElementById('dishesNutritiveValue2');
        type.onchange = function () {
            var selectIndex = document.getElementById("dishesNutritiveValue2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("dishesNutritiveValue2").options[selectIndex].value //获得被选中的项目
            foodNutriment = selectText;
        }
    })
}
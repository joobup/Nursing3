/**
 * Created by horo on 2016/11/4.
 */
$(function () {
    findWeak(thisWeakStartDate("this"), thisWeakEndDate("this"));
    $("#nextDate").click(function () {
        findWeak(thisWeakStartDate("add"), thisWeakEndDate("add"));
        $(".recipesList").addClass("bounceInRight").removeClass("bounceInLeft");
        setTimeout(function () {
            $(".recipesList").removeClass("bounceInRight")
        }, 2000);
    })
    $("#lastDate").click(function () {
        findWeak(thisWeakStartDate(), thisWeakEndDate());
        $(".recipesList").addClass("bounceInLeft").removeClass("bounceInRight");
        setTimeout(function () {
            $(".recipesList").removeClass("bounceInLeft");
        }, 2000);
    })

})
/*本周食谱*/
//添加
function add() {
    var url = domainUrl + "/serve/week_food/add";
    var weekDate = $("#weekDate").val();
    var oneEarly = $("#oneEarly").val();
    var dishesList = $("#dishesList").val();
    var foodDate = $("#foodDate").val();
    var postData = {
        weekDate: weekDate,
        oneEarly: oneEarly,
        dishesList: dishesList,
        foodDate: foodDate,
    };
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
    })
}
//查询
function findWeak(startDate, endDate) {
    var url = domainUrl + "/serve/week_food/findWeek";
    var htmlTitle = '';
    var html = '';
    var getData = {
        startDate: startDate,
        endDate: endDate,
    };
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data))
        //标题日期
        htmlTitle += '<h2>本周食谱:<span>(' + data.weekFoodOneEarlyVOs[0].foodDate.substring(0, 11) + '' +
            '</span>-<span>' + data.weekFoodOneEarlyVOs[6].foodDate.substring(0, 11) + ')</span></h2>';
        $("#weekTitle").html(htmlTitle);
        for (var i = 0; i < 7; i++) {
            html += '<div class="box"> <div class="list-group"> <div class="list-group-item active_red"> ' +
                '<h3 class="list-group-item-heading">星期' + (i + 1) + '</h3> </div> <div class="list-group-item pa">' +
                ' <h4 class="list-group-item-heading"><i class="glyphicon glyphicon-heart-empty">' +
                '</i>早餐<span><button class="foodAdd" value="'+data.weekFoodOneEarlyVOs[i].morningDishes.id+'">编辑</button></span></h4> <p class="list-group-item-text aa">'
            if(data.weekFoodOneEarlyVOs[i].morningDishes.dishesList !=""){
                for(var j = 0; j < data.weekFoodOneEarlyVOs[i].morningDishes.dishesList.length; j++){
                    html+='<span  class="food" value="'+data.weekFoodOneEarlyVOs[i].morningDishes.dishesList[j].id+'">'+data.weekFoodOneEarlyVOs[i].morningDishes.dishesList[j].dishesName+'</span>';
                }
            }
            html+='</p> </div>';
            html += '<div class="list-group-item pa">' +
                ' <h4 class="list-group-item-heading"><i class="glyphicon glyphicon-heart-empty">' +
                '</i>午餐<span><button class="foodAdd"  value="'+data.weekFoodOneEarlyVOs[i].noonDishes.id+'">编辑</button></span></h4> <p class="list-group-item-text aa">'
                if(data.weekFoodOneEarlyVOs[i].noonDishes.dishesList !=""){
                    for(var j = 0; j < data.weekFoodOneEarlyVOs[i].noonDishes.dishesList.length; j++){
                        html+='<span  class="food" value="'+data.weekFoodOneEarlyVOs[i].noonDishes.dishesList[j].id+'">'+data.weekFoodOneEarlyVOs[i].noonDishes.dishesList[j].dishesName+'</span>';
                    }
                }
            html+='</p> </div>';
            html += '<div class="list-group-item pa">' +
                ' <h4 class="list-group-item-heading"><i class="glyphicon glyphicon-heart-empty">' +
                '</i>晚餐<span><button class="foodAdd"  value="'+data.weekFoodOneEarlyVOs[i].nightDishes.id+'" >编辑</button></span></h4> <p class="list-group-item-text aa">'
            if(data.weekFoodOneEarlyVOs[i].nightDishes.dishesList !=""){
                for(var j = 0; j < data.weekFoodOneEarlyVOs[i].nightDishes.dishesList.length; j++){
                    html+='<span  class="food" value="'+data.weekFoodOneEarlyVOs[i].nightDishes.dishesList[j].id+'">'+data.weekFoodOneEarlyVOs[i].nightDishes.dishesList[j].dishesName+'</span>';
                }
            }
            html+='</p> </div></div></div></div>';
        }
        $(".recipesList").html(html);
        foodListAdd();
        $("#closeFoodDiv").click(function () {
            $("#introduce").slideUp("slow");
            $(".food").css("color","#000000")
        })
        $(".food").click(function(){
            $(this).css("color","#FF743D");
            var width = $("#main-side").width();
            var Win = document.documentElement.offsetWidth;
            var num = event.x - width;
            if(num+340 > Win - width){
                $("#introduce").css("margin-left",""+num-340+"").slideDown("slow");
            }else{
                $("#introduce").css("margin-left",""+num+"px").slideDown("slow");
            }
            var urlFood = domainUrl+"/serve/dishes/findAll";
            var getDataFood={currentPage:currentPage,limit:limit,};
            var dishesTaste,dishesAllergen,dishesSuitPeople,dishesNutritiveValue,dishesWeight;
            var idFood = $(this).attr("value");
            getAjax(urlFood,false,getDataFood,function (dataFood) {
                var numFood = dataFood.aaData.length;
                for(var f = 0; f< numFood; f++){
                    if(idFood == dataFood.aaData[f].id){
                        dishesTaste = dataFood.aaData[f].dishesTaste;
                        dishesAllergen = dataFood.aaData[f].dishesAllergen;
                        dishesSuitPeople = dataFood.aaData[f].dishesSuitPeople;
                        dishesNutritiveValue = dataFood.aaData[f].dishesNutritiveValue;
                        dishesWeight = dataFood.aaData[f].dishesWeight;
                    }
                }
                $("#dishesTaste").text(dishesTaste);
                $("#dishesAllergen").text(dishesAllergen);
                $("#dishesSuitPeople").text(dishesSuitPeople);
                $("#dishesNutritiveValue").text(dishesNutritiveValue);
                $("#dishesWeight").text(dishesWeight);
            })
        });
    })
}
var foodList='';
function foodListAdd() {
    $(".foodAdd").click(function () {
        $(".choose").slideDown(500);
        var id = $(this).attr("value");
        $("#foodOk").attr("value",id);
        foodList='';
    })
    $("#closeFoodAdd").click(function () {
        $(".choose").slideUp(500);
    })
    var url = domainUrl+"/serve/dishes/findAll";
    var getData={currentPage:currentPage,limit:limit,};
    var html='';
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0; i<num; i++){
            html+='<a value="' + data.aaData[i].id + '" class="foodName">'+data.aaData[i].dishesName+'</a>';
        }
        $(".foodListShow").html(html)
        $(".foodName").click(function () {
            if ($(this).hasClass("bb")) {
                $(this).removeClass("bb")
                foodList = foodList.replace('' + $(this).attr("value") + ',', '');
            } else {
                foodList += '' + $(this).attr("value") + ',';
                $(this).addClass("bb")
            }
        })
    })
}
function foodListAddUrl() {
    var url = domainUrl + '/serve/week_food_dishes/adds';
    var id = $("#foodOk").attr("value");
    var postData = {
        weekFoodId:id,
        dishesIds:foodList,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        $(".choose").slideUp(500);
        findWeak(thisWeakStartDate("this"), thisWeakEndDate("this"));
    })
}
//修改
function update(id) {
    var url = domainUrl + "/serve/week_food/update";
    var weekDate = $("#weekDate").val();
    var oneEarly = $("#oneEarly").val();
    var dishesList = $("#dishesList").val();
    var foodDate = $("#foodDate").val();
    var postData = {
        id: id,
        weekDate: weekDate,
        oneEarly: oneEarly,
        dishesList: dishesList,
        foodDate: foodDate,
    };
    postAjax(url, false, postData, function (data) {
        alert("修改成功");
    })
}
//删除
function del(id) {
    var url = domainUrl + "/serve/week_food/del";
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        alert("删除成功");
    })
}
/**
 * Created by horo on 2016/9/30.
 */
//购物车图标的显示隐藏
$(function () {
    $("#shopping-cart button").mouseover(function () {
        $("#shopping-cart").find("img").attr("src","")
    })
    $("#shopping-cart button").mouseout(function () {
        $("#shopping-cart").find("img").attr("src",domainUrl+"/images/index/shoppcart.png")
    })
})


//收藏加入购物车的图标变换
$(function () {
    $(".mouseover1").mouseover(function () {

        $(this).find("img").attr("src",domainUrl+"/images/index/shoppcart1.png");
    })

    $(".mouseover1").mouseout(function () {
        $(this).find("img").attr("src",domainUrl+"/images/index/shoppcart2.png");
    })
})

$(function () {
    $(".mouseover2").mouseover(function () {
        $(this).find("img").attr("src",domainUrl+"/images/index/collect.png");
    })
    $(".mouseover2").mouseout(function () {
        $(this).find("img").attr("src",domainUrl+"/images/index/collect1.png");
    })
})

//睡好觉 遮罩
$(function () {

    $(".tu").mouseover(function () {
        $(this).siblings(".popup").show();
        $(this).find(".blo").hide()
        $(this).find(".join").hide()
    })
    $(".popup").mouseout(function () {
        $(this).hide();
        $(this).find(".blo").show()
        $(this).find(".join").show()
    })
})


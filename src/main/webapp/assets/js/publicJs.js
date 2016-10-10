/**
 * Created by horo on 2016/9/30.
 */
//购物车图标的显示隐藏
$(function () {
    $("#shopping-cart button").mouseover(function () {
        $("#shopping-cart").find("img").attr("src","")
    })
    $("#shopping-cart button").mouseout(function () {
        $("#shopping-cart").find("img").attr("src","images/shoppcart.png")
    })
    $("#search button").mouseover(function () {
        $("#search").find("img").attr("src","")
    })
    $("#search button").mouseout(function () {
        $("#search").find("img").attr("src","images/search.png")
    })
})

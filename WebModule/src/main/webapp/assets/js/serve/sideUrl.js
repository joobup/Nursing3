/**
 * Created by horo on 2016/11/3.
 */
$(function () {
    $(".submenu li").click(function () {
        $(this).addClass("back-color").siblings().removeClass("back-color");
    })
})

function sideUrl(url) {
    var url = domainUrl+url;
    console.log(url)
    $.ajax({
        type: "get",
        url: url,
        success: function (data) {
            $("#main-show").html(data)
        }
    });
}

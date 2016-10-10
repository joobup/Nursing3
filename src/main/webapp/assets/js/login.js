/**
 * Created by horo on 2016/10/10.
 */
$(function () {
    $(".seller-login").click(function () {
        $(".seller-login").removeClass("back-gray");
        $(".personal-login").addClass("back-gray");
    })
    $(".personal-login").click(function () {
        $(".personal-login").removeClass("back-gray");
        $(".seller-login").addClass("back-gray");
    })
})
function login() {
    var username = $("#username").val();
    var userpass = $("#userpass").val();
    var url = "";
    var postData = {username:username,userpass:userpass}
    postAjax(url,postData,function () {
        alert("登录成功!")
    })
}

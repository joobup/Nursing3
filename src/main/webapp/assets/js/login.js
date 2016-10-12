/**
 * Created by horo on 2016/10/10.
 */
/*标签样式切换*/
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
/*登录*/
function login() {
    var loginName = $("#loginName").val();
    var loginPassword = $("#loginPassword").val();
    var url = domainUrl+"/login/user_login";
    var postData = {loginTel:loginName,loginPassword:loginPassword}
    postAjax(url,false,postData,function (data) {
        if(data.status ==1){
            location.href=domainUrl+"/index/index"
        }else{
            alert("用户名或密码错误")
        }
    })
}
/*回车登录*/
$(function () {
    $("#loginName").focus();
    $('.login-div').bind('keypress',function(event){
        if(event.keyCode == "13"){
            $('#login-btn').click();
        }
    });
})

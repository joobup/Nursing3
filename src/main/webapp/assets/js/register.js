/**
 * Created by horo on 2016/10/10.
 */

/*商户验证*/
/*邮箱验证*/
function emailyan() {
    $("#loginEmail").blur(function () {
        var loginEmail = $("#loginEmail").val();
        if(!(/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(loginEmail)) && loginEmail != "") {
            $("#emailyan").html("邮箱格式不正确").css("opacity","1").css("color","red")
            $("#one-btn").addClass("btn-none").removeClass("btn-auto");
        }else if(loginEmail == ""){
            $("#emailyan").html("请输入邮箱").css("opacity","1").css("color","red")
            $("#one-btn").addClass("btn-none").removeClass("btn-auto");
        }else{
            $("#emailyan").html("邮箱格式正确").css("opacity","1").css("color","green")
            $("#one-btn").addClass("btn-auto").removeClass("btn-none");
        }
    })
}
$(function () {
    $("#loginEmail").focus(function () {
        emailyan();
    })
})
/*商家注册*/
function sellerRegister() {
    var loginEmail = $("#loginEmail").val();
    var loginTel = $("#loginTel").val();
    var loginPassword = $("#loginPassword").val();
    var loginName = $("#loginName").val();
    var url = domainUrl+"/login/register/seller_register";
    var postData = {loginTel:loginTel,loginPassword:loginPassword,loginName:loginName,loginEmail:loginEmail}
    postAjax(url, false,postData,function (data) {

    })
}
/*个人验证*/
/*手机号验证*/
function telyan() {
    $("#loginTel").blur(function () {
        var loginTel = $("#loginTel").val();
        if(!(/^1[34578]\d{9}$/.test(loginTel)) && loginTel != "") {
            $("#telyan").html("手机号码格式不正确").css("opacity","1").css("color","red")
            $("#one-btn").addClass("btn-none").removeClass("btn-auto");
        }else if(loginTel == ""){
            $("#telyan").html("请输入手机号码").css("opacity","1").css("color","red")
            $("#one-btn").addClass("btn-none").removeClass("btn-auto");
        }else{
            $("#telyan").html("号码格式正确").css("opacity","1").css("color","green")
            $("#one-btn").addClass("btn-auto").removeClass("btn-none");
        }
    })
}
var y1; var y2;
/*名称验证*/
function nameyan() {
    $("#loginName").blur(function () {
        var loginName = $("#loginName").val();
        if(loginName == "") {
            $("#nameyan").html("请填写用户名").css("opacity","1").css("color","red")
        }else if(loginName.length < 6){
            $("#nameyan").html("用户名长度不能小于6").css("opacity","1").css("color","red")
        }else{
            $("#nameyan").html("用户名可用").css("opacity","1").css("color","green")
            y1 = 1;
        }
    })
}
/*密码验证*/
function  passyan() {
    $("#loginPassword").blur(function () {
        var loginPassword = $("#loginPassword").val();
        if(loginPassword == "") {
            $("#passyan").html("请填写密码").css("opacity","1").css("color","red")
        }else if(loginPassword.length < 6){
            $("#passyan").html("密码长度不能小于6位").css("opacity","1").css("color","red")
        }else{
            $("#passyan").html("密码格式正确").css("opacity","1").css("color","green")
            y2 = 2;
        }
    })
}
/*重复密码验证*/
function  passyan2() {
    $("#loginPassword2").blur(function () {
        var loginPassword = $("#loginPassword").val();
        var loginPassword2 = $("#loginPassword2").val();
        if(loginPassword != loginPassword2) {
            $("#passyan2").html("两次密码不一致").css("opacity","1").css("color","red")
        }else{
            $("#passyan2").html("密码正确").css("opacity","1").css("color","green")
            if(y1 ==1 && y2==2){
                $("#two-btn").addClass("btn-auto").removeClass("btn-none");
            }
        }
    })
}
$(function () {
    $("#loginTel").focus(function () {
        telyan();
    })
    $("#loginName").focus(function () {
        nameyan();
    })
    $("#loginPassword").focus(function () {
        passyan();
    })
    $("#loginPassword2").focus(function () {
        passyan2();
    })
})
/*步骤变化*/
$(function () {
    $("#one-btn").click(function () {
        var loginTel = $("#loginTel").val();
        var loginPassword = $("#loginPassword").val();
        var loginName = $("#loginName").val();
        $("#one").css("display", "none");
        $("#two").addClass("animated fadeIn").css("display", "");
        $("#jindu2").addClass("border-black");
        $("#jindu22").removeClass("title-num-n");
        $("#jindu222").removeClass("title-font-n")
    })
    $("#two-btn").click(function () {
        $("#two").css("display","none");
        $("#three").addClass("animated fadeIn").css("display","block");
        $("#jindu3").addClass("border-black");
        $("#jindu33").removeClass("title-num-n");
        $("#jindu333").removeClass("title-font-n")
    })
})
/*个人注册*/
function register() {
    var loginTel = $("#loginTel").val();
    var loginPassword = $("#loginPassword").val();
    var loginName = $("#loginName").val();
        var url = domainUrl+"/login/register/user_register";
        var postData = {loginTel:loginTel,loginPassword:loginPassword,loginName:loginName}
        postAjax(url, false,postData,function (data) {

        })
}

/*
 * drag 1.0
 * create by tony@jentian.com
 * date 2015-08-18
 * 拖动滑块
 */
(function($){
    $.fn.drag = function(options){
        var x, drag = this, isMove = false, defaults = {
        };
        var options = $.extend(defaults, options);
        //添加背景，文字，滑块
        var html = '<div class="drag_bg"></div>'+
            '<div class="drag_text" onselectstart="return false;" unselectable="on">拖动滑块验证</div>'+
            '<div class="handler handler_bg"></div>';
        this.append(html);
        var handler = drag.find('.handler');
        var drag_bg = drag.find('.drag_bg');
        var text = drag.find('.drag_text');
        var maxWidth = drag.width() - handler.width();  //能滑动的最大间距

        //鼠标按下时候的x轴的位置
        handler.mousedown(function(e){
            isMove = true;
            x = e.pageX - parseInt(handler.css('left'), 10);
        });

        //鼠标指针在上下文移动时，移动距离大于0小于最大间距，滑块x轴位置等于鼠标移动距离
        $(document).mousemove(function(e){
            var _x = e.pageX - x;
            if(isMove){
                if(_x > 0 && _x <= maxWidth){
                    handler.css({'left': _x});
                    drag_bg.css({'width': _x});
                }else if(_x > maxWidth){  //鼠标指针移动距离达到最大时清空事件
                    $("#register-btn").addClass("btn-auto").removeClass("btn-none");
                    dragOk();
                }
            }
        }).mouseup(function(e){
            isMove = false;
            var _x = e.pageX - x;
            if(_x < maxWidth){ //鼠标松开时，如果没有达到最大距离位置，滑块就返回初始位置
                handler.css({'left': 0});
                drag_bg.css({'width': 0});
            }
        });

        //清空事件
        function dragOk(){
            handler.removeClass('handler_bg').addClass('handler_ok_bg');
            text.text('验证通过');
            drag.css({'color': '#fff'});
            handler.unbind('mousedown');
            $(document).unbind('mousemove');
            $(document).unbind('mouseup');
        }
    };
})(jQuery);



var  y2,y3,y4,y5; var y1 =1;
/*邮箱验证*/
function emailyan() {
    $("#loginEmail").blur(function () {
        var loginEmail = $("#loginEmail").val();
        if(!(/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(loginEmail)) && loginEmail != "") {
            $("#emailyan").html("邮箱格式不正确").css("opacity","1").css("color","red")
            $("#one-btn").addClass("btn-none").removeClass("btn-auto");
            y1 = 0;
        }else if(loginEmail == ""){
            $("#emailyan").html("请输入邮箱").css("opacity","1").css("color","red")
            $("#one-btn").addClass("btn-none").removeClass("btn-auto");
            y1 = 0;
        }else{
            $("#emailyan").html("邮箱格式正确").css("opacity","1").css("color","green")
            $("#one-btn").addClass("btn-auto").removeClass("btn-none");
            y1 = 1;
        }
        panduanBtn();
    })
}
/*手机号验证*/
function telyan() {
    /*判断手机号是否存在*/
    $("#loginTel").blur(function () {
        var loginTel = $("#loginTel").val();
        var url = domainUrl+"/login/register/telUnique";
        var getData = {loginTel:loginTel};
        getAjax(url,false,getData,function (data) {
            if(data.status == 4){
                $("#telyan").html("手机号码已存在").css("opacity","1").css("color","red")
                $("#one-btn").addClass("btn-none").removeClass("btn-auto");
                y2 = 0;
            }else if(!(/^1[34578]\d{9}$/.test(loginTel)) && loginTel != "") {
                $("#telyan").html("手机号码格式不正确").css("opacity","1").css("color","red")
                $("#one-btn").addClass("btn-none").removeClass("btn-auto");
                y2 = 0;
            }else if(loginTel == ""){
                $("#telyan").html("请输入手机号码").css("opacity","1").css("color","red")
                $("#one-btn").addClass("btn-none").removeClass("btn-auto");
                y2 = 0;
            }else{
                $("#telyan").html("号码正确").css("opacity","1").css("color","green")
                $("#one-btn").addClass("btn-auto").removeClass("btn-none");
                y2 = 1;
            }
        })

        panduanBtn();
    })
}
/*名称验证*/
function nameyan() {
    $("#loginName").blur(function () {
        var loginName = $("#loginName").val();
        if(loginName == "") {
            $("#nameyan").html("请填写用户名").css("opacity","1").css("color","red")
            y3 = 0;
        }else if(loginName.length < 2){
            $("#nameyan").html("用户名长度不能小于2").css("opacity","1").css("color","red")
            y3 = 0;
        }else{
            $("#nameyan").html("用户名可用").css("opacity","1").css("color","green")
            y3 = 1;
        }
        panduanBtn();
    })
}
/*密码验证*/
function  passyan() {
    $("#loginPassword").blur(function () {
        var loginPassword = $("#loginPassword").val();
        if(loginPassword == "") {
            $("#passyan").html("请填写密码").css("opacity","1").css("color","red")
            y4 = 0;
        }else if(loginPassword.length < 6){
            $("#passyan").html("密码长度不能小于6位").css("opacity","1").css("color","red")
            y4 = 0;
        }else{
            $("#passyan").html("密码格式正确").css("opacity","1").css("color","green")
            y4 = 1;
        }
        panduanBtn();
    })
}
/*重复密码验证*/
function  passyan2() {
    $("#loginPassword2").blur(function () {
        var loginPassword = $("#loginPassword").val();
        var loginPassword2 = $("#loginPassword2").val();
        if(loginPassword != loginPassword2) {
            $("#passyan2").html("两次密码不一致").css("opacity","1").css("color","red")
            y5 = 0;
        }else{
            $("#passyan2").html("密码正确").css("opacity","1").css("color","green")
            y5 = 1;
        }
        panduanBtn();
    })
}
/*按钮判断*/
function panduanBtn() {
    if(y1+y2+y3+y4+y5 == 5 ){
        $("#two-btn").addClass("btn-auto").removeClass("btn-none");
    }else{
        $("#two-btn").addClass("btn-none").removeClass("btn-auto");
    }
}
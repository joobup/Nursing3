<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/login.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/login.js"></script>
    <title>登录</title>
</head>
<body>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<!--头部-->
<div class="login-head"></div>
<!--页面-->
<div class="login-main">
    <div class="login-div">
        <ul>
            <li>
                <div class="personal-login">个人登陆</div>
                <div class="seller-login back-gray">机构登陆</div>
            </li>
            <li>
                <div  class="login-input-img"><img src="../../../nursing/assets/images/login-user.jpg"></div>
                <input type="text" placeholder="手机号"  id="username"  class="login-input">
            </li>
            <li>
                <div class="login-input-img" style="margin-top: 25px;"><img src="../../../nursing/assets/images/login-pass.jpg"></div>
                <input type="password" placeholder="密码"  id="userpass" class="login-input" style="margin-top: 25px; height: 45px;">
            </li>
            <li><input type="button" value="登录" onclick="login()"></li>
            <li><span><a href="${domainUrl}/rest/login/register">免费注册</a></span></li>
        </ul>
    </div>
</div>
<!--底部-->
<div class="login-foot"></div>
</body>
</html>

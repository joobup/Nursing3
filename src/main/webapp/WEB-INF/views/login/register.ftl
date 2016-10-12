

<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/register.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/插件css/animate/animate.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/register.js"></script>
    <title>注册</title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body>
<#include "/common/head.ftl"/>
<div class="w" style="height: 145px;"></div>
<div class="w progress-bar">
    <ul>
        <li></li>
        <li class="border-black" id="jindu1"><div class="title-num" id="jindu11">1</div><div class="title-font" id="jindu111">邮箱验证</div></li>
        <li id="jindu2"><div class="title-num title-num-n" id="jindu22">2</div><div class="title-font-n title-font" id="jindu222">设置账号信息</div></li>
        <li id="jindu3"><div class="title-num title-num-n" id="jindu33">3</div><div class="title-font-n title-font" id="jindu333">注册成功</div></li>
        <li></li>
    </ul>
</div>
<div class="w">
    <div class="register-mail">
       <table id="one">
           <tr>
               <td>手机号</td>
               <td><input type="text" placeholder="请输入手机号" id="loginTel" maxlength="11"minlength="11"></td>
               <td></td>
           </tr>
           <tr>
               <td>验证</td>
               <td>
                   <div id="drag"></div>
                   <script type="text/javascript">
                       $('#drag').drag();
                   </script>
               </td>
               <td><input type="button" value="发送验证码" style=" pointer-events: none; background-color: #a0a3a3" id="register-btn"></td>
           </tr>
           <tr>
               <td>验证码</td>
               <td><input type="text" placeholder="请输入短信验证码"  style=" pointer-events: none;" id="message-yanzheng"></td>
               <td></td>
           </tr>
           <tr>
               <td></td>
               <td><input type="button" value="下一步" style=" pointer-events: auto; background-color:#000000;" id="one-btn"></td>
               <td></td>
           </tr>
       </table>
        <table id="two"  style="display: none;">
            <tr>
                <td>昵称</td>
                <td><input type="text" placeholder="请输入用户昵称" id="loginName"></td>
                <td><span class="yanzheng" id="nameyan"></span></td>
            </tr>
            <tr>
                <td>输入密码</td>
                <td><input type="password" placeholder="请输入密码" id="loginPassword"></td>
                <td></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" placeholder="请再次输入密码"></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="button" value="注册" id="two-btn" onclick="register()"></td>
                <td></td>
            </tr>
        </table>
        <div id="three">
            <div class="register-okimg">
                <img src="${domainUrl}/assets/images/registerok.jpg" alt="" style="margin-top: 40px;">
                <br>
                注册成功
                <br>
            </div>
        <input type="button" value="进入商城" >
        </div>
    </div>
</div>
</body>
</html>

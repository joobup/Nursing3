

<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/register.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/register.js"></script>
    <title>注册</title>
</head>
<body>
<#include "/common/head.ftl"/>
<div class="w" style="height: 145px;"></div>
<div class="w progress-bar">
    <ul>
        <li></li>
        <li class="border-black"><div class="title-num">1</div><div class="title-font">邮箱验证</div></li>
        <li><div class="title-num-n">2</div><div class="title-font-n">设置账号信息</div></li>
        <li><div class="title-num-n">3</div><div class="title-font-n">等待审核</div></li>
        <li></li>
    </ul>
</div>
<div class="w">
    <div class="register-mail">
       <table>
           <tr>
               <td>邮箱</td>
               <td><input type="text" placeholder="请输入邮箱"></td>
           </tr>
           <tr>
               <td>验证</td>
               <td><input type="text" placeholder="验证"></td>
           </tr>
           <tr>
               <td></td>
               <td><input type="button" value="下一步"></td>
           </tr>
       </table>
    </div>
</div>
</body>
</html>

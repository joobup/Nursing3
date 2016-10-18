<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/staff.js"></script>
    <meta charset="utf-8">
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body style="background-image: url(${domainUrl}/assets/images/xianback.jpg)">
<div class="add-main">
    <div class="add-input">
        <b>姓名</b><input type="text">
    </div>
    <div class="add-input">
        <b>性别</b><input type="text">
    </div>
    <div class="add-input">
        <b>职务</b><input type="text">
    </div>
    <div class="add-input">
        <b>技能等级</b><input type="text">
    </div>
    <div class="add-input">
        <b>照片</b><input type="text">
    </div>
    <div class="add-input">
        <b>所在部门</b><input type="text">
    </div>
    <div class="add-input">
        <b>身份证号码</b><input type="text">
    </div>
    <div class="add-input">
        <b>联系方式1</b><input type="text">
    </div>
    <div class="add-input">
        <b>联系方式2</b><input type="text">
    </div>

    <div class="add-input">
        <b>管理权限</b><input type="text">
    </div>
    <div class="add-input">
        <b>人员状态</b><input type="text">
    </div>
    <#--<div class="main-group">-->
        <#--<label for="">人员姓名</label>-->
        <#--<input type="text" id="staffname" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">性别</label>-->
        <#--<input type="text" id="staffsex" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">人员职务</label>-->
        <#--<input type="text" id="staffpost" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">人员技能等级</label>-->
        <#--<input type="text" id="staffskilllevel" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">人员照片</label>-->
        <#--<input type="text" id="staffpicture" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">所在部门</label>-->
        <#--<input type="text" id="staffdepartment" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">身份证号码</label>-->
        <#--<input type="text" id="staffcard" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">联系方式1</label>-->
        <#--<input type="text" id="staffcall1" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">联系方式2</label>-->
        <#--<input type="text" id="staffcall2" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">管理权限</label>-->
        <#--<input type="text" id="staffrank" class="form-control">-->
    <#--</div>-->
    <#--<div class="main-group">-->
        <#--<label for="">人员状态</label>-->
        <#--<input type="text" id="staffstatus" class="form-control">-->
    <#--</div>-->
    <input type="button" onclick="add()" value="添加" >
</div>
</body>
</html>
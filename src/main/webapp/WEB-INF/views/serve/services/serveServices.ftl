<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link href="${domainUrl}/assets/css/style.min.css" rel="stylesheet">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/services.js"></script>
    <meta charset="utf-8">
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body style="background-image: url(${domainUrl}/assets/images/xianback.jpg)">
<div style="width: 445px; height: 70px; border-top: 3px solid #E7EAEC; border-bottom:1px solid #E7EAEC;margin: 0px auto;background-color: #fff; border-radius: 2px; text-align: center;font-size: 22px;line-height: 70px;">
        添加服务
</div>
<div class="add-main">
    <div class="main-group">
        <label for="">服务类别</label>
        <input type="text" id="leibie" class="form-control">
    </div>
    <div class="main-group">
        <label for="">服务标题</label>
        <input type="text" id="mingcheng"  class="form-control">
    </div>
    <div class="main-group">
        <label for="">服务简介</label>
        <textarea  id="jianjie"  class="form-control"></textarea>
    </div>
    <div class="main-group">
        <label for="">限制条件</label>
        <input type="text" id="tiaojian"  class="form-control">
    </div>
    <div class="main-group">
        <label for="">服务人数</label>
        <input type="text" id="renshu" class="form-control">
    </div>
    <input type="button" onclick="add()" value="添加" >
</div>

<div id="ce">

</div>
</body>
</html>
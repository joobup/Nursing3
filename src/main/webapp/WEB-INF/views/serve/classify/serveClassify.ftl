<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/classify.js"></script>
    <meta charset="utf-8" />
    <title>添加类别</title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body  style="background-image: url(${domainUrl}/assets/images/xianback.jpg)">
<div class="add-main">
    <div class="main-group">
        <label for="">类别名称</label>
        <input type="text" id="className"  class="form-control">
    </div>
    <div class="main-group">
        <label for="">类别等级</label>
        <input type="text" id="classLevel"  class="form-control">
    </div>
    <input type="button" onclick="add()" value="添加" >
</div>
<div id="find-main">
    <label for="">类别列表</label>

</div>
</body>
</html>
<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/cost.js"></script>
    <meta charset="utf-8">
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body style="background-image: url(${domainUrl}/assets/images/xianback.jpg)">
<div class="add-main">
    <div class="add-input">
        <b>计价方式</b><input type="text" id="jijia">
    </div>
    <input type="button" onclick="add()" value="添加" >
</div>
</body>
</html>
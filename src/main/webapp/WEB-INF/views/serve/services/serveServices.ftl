<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/services.js"></script>
    <meta charset="utf-8">
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body>
<input type="text" id="leibie">
<input type="text" id="mingcheng">
<input type="text" id="jianjie">
<input type="text" id="tiaojian">
<input type="text" id="renshu">
<input type="button" onclick="add()" value="添加">
<div id="ce">

</div>
</div>
</body>
</html>
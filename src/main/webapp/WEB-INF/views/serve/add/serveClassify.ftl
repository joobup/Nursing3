<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/serveAdd.js"></script>
    <meta charset="utf-8" />
    <title>添加类别</title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body>
    <input type="text" id="className"><input type="text" id="classLevel"><input type="button" value="添加" onclick="serveClassifyAdd()">
</body>
</html>
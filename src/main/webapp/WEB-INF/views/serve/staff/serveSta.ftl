<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/serveAdd.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <script src="${domainUrl}/assets/js/jQuery-1.4.2/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/serve/staff.js"></script>
    <meta charset="utf-8">
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body>
<input type="text" id="staffname">
<input type="text" id="staffsex">
<input type="text" id="staffpost">
<input type="text" id="staffskilllevel">
<input type="text" id="staffpicture">
<input type="text" id="staffdepartment">
<input type="text" id="staffcard">
<input type="text" id="staffcall1">
<input type="text" id="staffcall2">
<input type="text" id="staffrank">
<input type="text" id="staffstatus">
<input type="button" onclick="add()" value="添加">
<div id="ce">

</div>
</div>
</body>
</html>
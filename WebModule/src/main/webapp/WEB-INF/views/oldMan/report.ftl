<link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${domainUrl}/assets/css/oldMan/report.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${domainUrl}/assets/css/OutCss/canvas/component.css" />
<script src="${domainUrl}/assets/js/institution/olderMan/report.js"></script>

<style>
    .main-body #main-show{
        background: none;
        overflow: hidden;
    }
</style>
<div class="side-button" id="right-canvas" style="left: auto; right: 0%; ">
    <img src="${domainUrl}/assets/images/serve/right1.png" />
</div>
<div class="side-button" id="left-canvas" style="left: 0%; right: auto; display: none;">
    <img src="${domainUrl}/assets/images/serve/left1.png"  />
</div>

<div id="start" class="animated">
</div>
<script>
    $(function () {
        $("#right-canvas").click(function () {
            $("#start").removeClass("fadeInLeft").addClass("fadeOutLeft").hide(900);
            $("#shujuback").css(" opacity","1").removeClass("fadeOutRight").addClass("fadeInRight");
            $("#right-canvas").hide();
            $("#left-canvas").show();
            $("#demo-canvas").hide();
        })
        $("#left-canvas").click(function () {
            $("#start").css("display","block").removeClass("fadeOutLeft").addClass("fadeInLeft");
            $("#shujuback").css(" opacity","0").removeClass("fadeInRight").addClass("fadeOutRight");
            $("#right-canvas").show();
            $("#left-canvas").hide();
            $("#demo-canvas").show();
        })
    })
</script>
<div class="zong animated" id="shujuback">
    <h1>老人模块信息报表</h1>
    <div class="top">
        <div class="one">
            <div class="pull-left tu">
            <img src="${domainUrl}/assets/images/report/ren.png" />
            </div>
            <h2 class="font-right">
                <p>老人信息</p>
                <p>老人信息查询</p>
            </h2>
            <div class="clearfix"></div>
        </div>
        <div class="two">
            <div class="pull-left tu">
                <img src="${domainUrl}/assets/images/report/gouwuche.png" />
            </div>
            <h2 class="font-right"><p>状态信息</p><p>老人状态查询</p></h2>
            <div class="clearfix"></div>
        </div>
        <div class="three">
            <div class="pull-left tu">
                <img src="${domainUrl}/assets/images/report/qun.png" />
            </div>
            <h2 class="font-right"><p>类型信息</p><p>老人类型查询</p></h2>
            <div class="clearfix"></div>
        </div>
        <div class="four">
            <div class="pull-left tu">
                <img src="${domainUrl}/assets/images/report/liaotian.png" />
            </div>
            <h2 class="font-right"><p>登录信息</p><p>老人登录查询</p></h2>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="bottom">
        <!--曲线表-->
        <div class='wrapper pull-right  animated bounceInUp ' id="quxianbiao">
            <h3  style="margin-bottom: 60px;color: #fff;">人员年龄性别比例</h3>
            <canvas height='350' id='canvas' width='800'></canvas>
        </div>
        <!--柱状表-->
        <div class="pull-left histogram  animated bounceInUp" style="margin-top: 30px;">
            <div id="chart_buttons"></div>
            <div id="chart" style="width:95%;"></div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!--曲线表-->
<script src="${domainUrl}/assets/js/linear/Chart.min.js"></script>
<script src="${domainUrl}/assets/js/linear/prefixfree.min.js"></script>
<script src="${domainUrl}/assets/js/linear/linear.js"></script>
<!--柱状表-->
<script src="${domainUrl}/assets/js/histogram/d3.min.js"></script>
<script src="${domainUrl}/assets/js/histogram/histogram.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/TweenLite.min.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/EasePack.min.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/rAF.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/demo-1.js"></script>
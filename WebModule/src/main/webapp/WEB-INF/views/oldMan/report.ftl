<link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${domainUrl}/assets/css/oldMan/report.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/institution/olderMan/report.js"></script>


<div class="zong">
    <h1>老人模块信息报表</h1>
    <div class="top">
        <a href="##"><div class="one">
            <div class="pull-left tu">
            <img src="${domainUrl}/assets/images/report/ren.png" />
            </div>
            <h2 class="font-right">
                <p>老人信息</p>
                <p>老人信息查询</p>
            </h2>
            <div class="clearfix"></div>
        </div></a>
        <a href="##"><div class="two">
            <div class="pull-left tu">
                <img src="${domainUrl}/assets/images/report/gouwuche.png" />
            </div>
            <h2 class="font-right"><p>状态信息</p><p>老人状态信息查询</p></h2>
            <div class="clearfix"></div>
        </div></a>
        <div class="three">
            <div class="pull-left tu">
                <img src="${domainUrl}/assets/images/report/qun.png" />
            </div>
            <h2 class="font-right"><p>类型信息</p><p>老人类型信息查询</p></h2>
            <div class="clearfix"></div>
        </div>
        <div class="four">
            <div class="pull-left tu">
                <img src="${domainUrl}/assets/images/report/liaotian.png" />
            </div>
            <h2 class="font-right"><p>登录信息</p><p>老人登录信息查询</p></h2>
            <div class="clearfix"></div>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="bottom">
        <!--曲线表-->
        <div class='wrapper pull-right'  style="margin-top: 50px;">
            <h3  style="margin-bottom: 60px;">人员年龄性别比例</h3>
            <canvas height='300' id='canvas' width='800'></canvas>
        </div>
        <!--柱状表-->
        <div class="pull-left histogram">
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
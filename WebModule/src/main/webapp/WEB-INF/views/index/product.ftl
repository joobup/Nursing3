<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/index/product.css">


    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>


    <title>产品详情</title>
</head>
<style>
    .nav-back{
        background-color: #000000!important;
    }
</style>
<body>
<script type="text/javascript">
    $(function () {
        var winW = document.documentElement.clientWidth;
        $('#featured').find("img").width(winW);
    })
    $(window).load(function() {
        $('#featured').orbit();
    });
    var domainUrl = '${domainUrl}'+"/assets";
</script>

<#include "/common/head.ftl"/>


<div class="container con">
    <div class="row pa">
        <div class="col-lg-5 col-md-4 col-sm-12  tu_l">
             <img src="${domainUrl}/assets/images/index/fuwu/1.jpg"  class="img-responsive" >
        </div>
        <div class="col-lg-6 col-md-6  col-sm-12  tu_r">
            <h2>日常保洁·专业标准化上门服请</h2>
            <h3>物品归位整理、无覆盖物地面清洁内窗清洁、更换垃圾袋床底、柜底除尘、家具家电表面清洁门表面及把手、墙面、踢脚线除尘</h3>
            <div class="bg">
                <div class="row">
                    <h3 class="col-lg-2 col-md-2 col-sm-2 col-xs-3 ">价格：</h3><span class=" col-lg-9 col-md-9 col-sm-9 col-xs-8 big">20元/小时</span>
                    <div class="clearfix"></div>
                </div>
                <div class="row">
                    <h3 class="col-lg-2 col-md-2 col-sm-2 col-xs-3 ">服务特色：</h3><span  class="col-lg-9 col-md-9 col-sm-9 col-xs-8" >专业工具，高效洁净</span>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="choose">
                <div class="row cc">
                    <h3 class="col-lg-2 col-md-2 col-sm-2 col-xs-3">地点：</h3>
                    <span  class="col-lg-10 col-md-10 col-sm-10 col-xs-9" >
                        	<select>
                            	<option>北京</option>
                            	<option>天津</option>
                                <option>上海</option>
                                <option>青岛</option>
                                <option>福州</option>
                                <option>济南</option>
                                <option>大连</option>
                                <option>营口</option>
                            </select>
                        	<span>支持现金收付</span>
                            <span>POSS机</span>

                        </span>
                    <div class="clearfix"></div>
                </div>
                <div class="row">
                    <h3 class="col-lg-2 col-md-2 col-sm-2 col-xs-3 ma">选择服务：</h3>
                    <span  class="col-lg-10 col-md-10 col-sm-10 col-xs-12" >
                        	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 block"  >客厅</div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 block" >厨房</div>
                       		<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 block">卧室</div>
                        </span>
                    <div class="clearfix"></div>
                    <div class="col-lg-2"></div>
                    <div class="col-lg-10 ncb">
                        <div class="col-lg-4 col-md-4 col-sm-4 cart">加入购物车</div>
                        <div class="col-lg-3 col-md-3 col-sm-3 buy">立即购买</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="row ">
        <div class="col-lg-3 dd">
            <div class="relevant">
                <h3 class="col-lg-12">服务分类</h3>
                <h4 class="col-lg-6"><a href="##">家庭清洁</a></h4>
                <h4 class="col-lg-6"><a href="##">母婴养护</a></h4>
                <h4 class="col-lg-6"><a href="##">家居养护</a></h4>
                <h4 class="col-lg-6"><a href="##">护理</a></h4>
                <h4 class="col-lg-6"><a href="##">丽人</a></h4>

                <div class="clearfix"></div>
            </div>
            <div class="hot">
                <h3>热门家政</h3>
                <div class="one">
                    <a href="##"> <img src="${domainUrl}/assets/images/index/fuwu/11.jpg"  class="img-responsive" >
                        <h4>张三</h4></a>
                    <h5>金牌服务人员</h5>
                </div>
                <div class="one">
                    <a href="##"><img src="${domainUrl}/assets/images/index/fuwu/11.jpg"  class="img-responsive" >
                        <h4>李四</h4></a>
                    <h5>金牌服务人员</h5>
                </div>
                <div class="one">
                    <a href="##"><img src="${domainUrl}/assets/images/index/fuwu/11.jpg"  class="img-responsive" >
                        <h4>王五</h4></a>
                    <h5>金牌服务人员</h5>
                </div>
                <div class="one">
                    <a href="##"><img src="${domainUrl}/assets/images/index/fuwu/11.jpg"  class="img-responsive" >
                        <h4>赵六</h4></a>
                    <h5>金牌服务人员</h5>
                </div>
            </div>
        </div>

        <div class="col-lg-9 ">
            <div class="col-lg-12 introduction">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 one" >服务介绍</div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 one">服务人员</div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 one" >设备工具</div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 one" >服务评价</div>
                <div class="col-lg-2  col-md-2 col-sm-2 col-xs-2 one" >售后服务</div>
                <div class="clearfix"></div>
            </div>
            <div class="img">
                <img src="${domainUrl}/assets/images/index/fuwu/1.jpg"  class="container img-responsive" >
                <img src="${domainUrl}/assets/images/index/fuwu/2.jpg"  class="container img-responsive" >
                <img src="${domainUrl}/assets/images/index/fuwu/3.jpg"  class="container img-responsive" >
                <img src="${domainUrl}/assets/images/index/fuwu/4.jpg"  class="container img-responsive" >
                <img src="${domainUrl}/assets/images/index/fuwu/5.jpg"  class="container img-responsive" >
                <img src="${domainUrl}/assets/images/index/fuwu/6.jpg"  class="container img-responsive" >
            </div>
        </div>
    </div>
</div>

<!--底部导航-->

<div class="footer">
    <div class="con">
        <div class="pull-left about">
            <h2>ABOUT US</h2>
            <h3>Fashion is not something that inFashion is not something that inFashion is not something that inFashion is
                not something that inFashion is not something that inFashion is not something that inFashion is not something
                that inFashion is not something that inFashion is not something that inthat in</h3>
        </div>
        <div class="pull-left how">
            <h2>HOW TO FIND US</h2>
            <h4>ADD:<span>25,lorem lis Street,Orange</span></h4>
            <h4>TEL:<span>80 123 3456</span></h4>
            <h4>Email:<span>emaasdasf@z.com</span></h4>
        </div>
        <div class="pull-left link">
            <h2>LINK</h2>
            <a href="##">addias</a>
            <a href="##">BOSS</a>
            <a href="##">David</a>
            <a href="##">shoes</a>
            <a href="##">dress</a>
            <a href="##">dress</a>
            <a href="##">dress</a>
            <div  class="clear"></div>
        </div>
        <div class="pull-left leave">
            <h2>LEAVE A MESSAGE</h2>
            <div class="soso">
                <input type="text"  placeholder="message"><button>report</button>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>

<div id="foot">承嘉商城 @2016</div>






</body>
</html>
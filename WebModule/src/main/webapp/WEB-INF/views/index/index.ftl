<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${domainUrl}/assets/css/index/index.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link rel="stylesheet" type="text/css" href="${domainUrl}/assets/css/OutCss/Carousel/orbit-1.2.3.css"/>
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/OutJs/Carousel/Carousel.js"></script>
    <script type="text/javascript" src="${domainUrl}/assets/js/index/index.js"></script>
    <title>智慧养老商城</title>
</head>
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

<body>
<#include "/common/head.ftl"/>
<!--logo&搜索-->
<div class="banner">
    <div class="w">
        <div id="logo-img">LOGO</div>
        <div id="search">
            <input type="text" placeholder="智能机器人"><button><img src="${domainUrl}/assets/images/index/search.png">搜索</button>
        </div>
        <div id="shopping-cart">
            <button><img src="${domainUrl}/assets/images/index/shoppcart.png">进入购物车</button>
        </div>
    </div>
</div>
<!--分类栏-->
<div class="classify">
    <div class="w">
        <ul>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>
            <li><div>首页<br>home page</div></li>

        </ul>
    </div>
</div>
<!--主图轮播-->
<div class="carousel">
    <div class="container">
        <!--设置data-car可以改变停留时间，设置data-move鼠标悬停是否滚动1滚动，0不滚动-->
        <div id="featured" data-car="5000" data-move="0">
            <img src="${domainUrl}/assets/images/index/lunbo.png" />
            <img src="${domainUrl}/assets/images/index/lunbo.png" data-caption="#htmlCaption" />
            <img src="${domainUrl}/assets/images/index/lunbo.png"  />
        </div>
        <span class="orbit-caption" id="htmlCaption"><strong>I'm A Badass Caption:</strong> I can haz <a href="#">links</a>, <em>style</em> or anything that is valid markup :)</span>
    </div>
</div>
<div class="w" style="height: 70px;"></div>
<!--商品推荐-->
<div class="w">
    <div id="ware-recommend">
        <div class="recommend" id="recommend-left">
            <ul>
                <li>
                    <br>
                    <br>
                    <h1>保健品</h1>
                    <hr>
                </li>
                <li>
                    <img src="${domainUrl}/assets/images/index/20161009100417.png" alt="">
                </li>
                <li>
                    <img src="${domainUrl}/assets/images/index/20161009100355.png" alt="">
                </li>
                <li id="re-font">
                    Lorem ipsum dolor sit amet,consetetur sadipscing elitr, seddiam nonumy eirmod tempor incidunt ut
                    labore et dolore magna aliquyam erat,sed diam voluptua. At vero eos et accusam et justo duo dolores et ea  rebum.
                </li>
                <li id="re-btn">
                    <div class="re-btn-s"><div class="re-btn-x">立即购买</div></div>
                </li>
            </ul>
        </div>
        <div class="recommend" id="recommend-right">
            <div id="recommend-img-s">
                <img src="${domainUrl}/assets/images/index/ware/5.jpg" height="315px" alt="">
                <div id="img-s-zhezhao"></div>
                <div id="re-message">
                    <div id="re-message-f">
                        耗牛壮骨粉
                    </div>
                    <div class="re-btn-s"><div class="re-btn-x">立即购买</div></div>
                </div>
            </div>
            <div id="recommend-img-x">
                <div class="recommend-img-xl">

                </div>
                <div class="recommend-img-xr">

                </div>
            </div>
        </div>
    </div>
</div>
<!--商品大图-->
<div id="ware-big-img">

</div>
<!--底部导航-->
<div id="foot">承嘉商城 @2016</div>
</body>
</html>
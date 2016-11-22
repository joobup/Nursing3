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
                <script type="text/javascript" src="${domainUrl}/assets/js/common.js"></script>
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
    var domainUrl1 = '${domainUrl}' + "/rest";
    var domainImg = '${domainUrl}';
</script>

<body>
<#include "/common/head.ftl"/>
<!--logo&搜索-->
<div class="banner">
    <div class="w">
        <div id="logo-img"><img src="${domainUrl}/assets/images/index/logo.png"></div>
        <div id="search">
            <input type="text" placeholder="智能机器人"><button>搜索</button>
        </div>
        <div id="shopping-cart">
            <button><img src="${domainUrl}/assets/images/index/shoppcart.png">进入购物车</button>
        </div>
        <div class="clear"></div>
    </div>
</div>
<!--分类栏-->
<div class="classify">
    <div class="w">
        <ul>
            <li><a href="${domainUrl}/rest/index/index">首&nbsp;&nbsp;&nbsp;&nbsp;页<br>HOME</a></li>
            <li><a href="${domainUrl}/rest/index/product">家庭清洁<br>Cleaning</a></li>
            <li><a href="${domainUrl}/rest/index/product">母婴护理<br>Child care</a></li>
            <li><a href="${domainUrl}/rest/index/product">家居养护<br>Home care</a></li>
            <li><a href="${domainUrl}/rest/index/product">丽&nbsp;&nbsp;&nbsp;&nbsp;人<br>Beauty</a></li>
            <li><a href="${domainUrl}/rest/index/product">速&nbsp;&nbsp;&nbsp;&nbsp;运<br>Shipment</a></li>
            <li><a href="${domainUrl}/rest/index/product">维修装新<br>Install</a></li>
            <li><a href="${domainUrl}/rest/index/product">按摩推拿<br>Massage</a></li>
            <li><a href="${domainUrl}/rest/index/product">家电清洗<br>Appliance</a></li>
            <li><a href="${domainUrl}/rest/index/product">企业服务<br>Enterprise</a></li>
            <div class="clear"></div>
        </ul>
    </div>
</div>
<!--主图轮播-->
<div class="carousel">
    <div class="container">
        <!--设置data-car可以改变停留时间，设置data-move鼠标悬停是否滚动1滚动，0不滚动-->
        <div id="featured" data-car="5000" data-move="0">
            <img src="${domainUrl}/assets/images/index/banner1.png" />
            <img src="${domainUrl}/assets/images/index/banner2.png" data-caption="#htmlCaption" />
            <img src="${domainUrl}/assets/images/index/banner1.png"  />
        </div>
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
                <div class="recommend-img-xl pull-left">
                    <a href="##">
                    <h4>壮骨粉</h4>
                    <img src="${domainUrl}/assets/images/index/ware/5.jpg" height="315px" >
                    </a>
                </div>
                <div class="recommend-img-xr pull-right">
                   <div class="aa"> <img src="${domainUrl}/assets/images/index/20161111150453.png" ><a href="##">速来抢购</a></div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="clear"></div>
<!--大图1-->
<div class="tu1">
    <img src="${domainUrl}/assets/images/index/11.png"  >
    <div class="txt">
    <h3>家庭护理</h3>
     <h4>陪护：看病取药、散步、购物照顾：提醒按医嘱吃药协助脱穿衣服等</h4>
    </div>
</div>

<!--店铺新品区-->
<div class="fashion">
    <div class="txt">
        <h2>INTERNATIONAL BRAND</h2>
        <h3>店铺<span>新品区</span></h3>
        <h4>HOT FASHION</h4>
    </div>
    <div class="pic" id="pic1">
        <#--<div class="box">-->
            <#--<div class="pull-left line-l"></div>-->
            <#--<div class="pull-left con">-->
                <#--<div class="line-t"></div>-->
                <#--<div class="tu">-->
                    <#--<img src="${domainUrl}/assets/images/index/22.png"  >-->
                <#--</div>-->
                <#--<div class="introduce">-->
                    <#--<h2>蛋白粉</h2>-->
                    <#--<h3>￥150</h3>-->
                    <#--<h4><a href="##" class="mouseover1"><img src="${domainUrl}/assets/images/index/shoppcart2.png" >加入购物车</a>-->
                        <#--<a href="##"  class="mouseover2"><img src="${domainUrl}/assets/images/index/collect1.png">收藏</a>-->
                    <#--<div class="clear"></div>-->
                    <#--</h4>-->
                    <#--<button>立即购买</button>-->
                <#--</div>-->
                <#--<div class="line-b"></div>-->
            <#--</div>-->
            <#--<div class="pull-right line-r"></div>-->
            <#--<div class="clear"></div>-->
        <#--</div>-->
        <div class="clear"></div>
    </div>
</div>


<!--产品热卖区-->
<div class="selling">

    <div class="txt">
        <h2>INTERNATIONAL BRAND</h2>
        <h3>产品<span>热卖区</span></h3>
        <h4>新品上市独家发售</h4>
        <h5>2015 collection fashion new spring collection</h5>

    </div>
    <div class="pic">
        <div class="pull-left tu_l">
            <img src="${domainUrl}/assets/images/index/pro.png"  >
            <div class="tu_l_gray">
                <div class="tu_l_blue">
                    <h2>About Fashion 2016</h2>
                    <h3>Fashion is not something that inFashion is not something that inFashion is not something that inFashion is not something that in</h3>
                </div>
            </div>
        </div>
        <div class="pull-right tu_r">
            <div class="one">
                <img src="${domainUrl}/assets/images/index/pro.png"  >
                <div class="tu_r_gray">
                    <h2></h2>
                    <h3></h3>
                </div>
            </div>
            <div class="one">
                <img src="${domainUrl}/assets/images/index/pro.png"  >
                <div class="tu_r_gray">
                    <h2></h2>
                    <h3></h3>
                </div>
            </div>
            <div class="one">
                <img src="${domainUrl}/assets/images/index/pro.png"  >
                <div class="tu_r_gray">
                    <h2></h2>
                    <h3></h3>
                </div>
            </div>
            <div class="one">
                <img src="${domainUrl}/assets/images/index/pro.png"  >
                <div class="tu_r_gray">
                    <h2></h2>
                    <h3></h3>
                </div>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
</div>

<!--大图2-->
<div class="tu1" >
    <img src="${domainUrl}/assets/images/index/11.png"  >
    <div class="txt">
        <h3>日常保洁</h3>
        <h4>日常家庭清洁和整理 不包括：外窗清洁、橱柜内部及家电深度清洁。</h4>
    </div>
</div>
<!--睡好觉-->
<div class="sleep">
        <div class="txt">
            <div class="pull-left line-l"></div>
            <h2 class="pull-left">睡好觉</h2>
            <h3 class="pull-left">COLLECTION IS Pants-Denim</h3>
            <div class="pull-left line-r"></div>
            <div class="clear"></div>
        </div>
        <div class="pic">
            <div class="one">
                <div class="tu mouseover3">
                  <img src="${domainUrl}/assets/images/index/sleep1.png" >
                </div>
                <div class="join">
                   <a href="##"  class="pull-left mouseover1"><img src="${domainUrl}/assets/images/index/shoppcart2.png" >加入购物车</a>
                   <a href="##"  class="pull-right mouseover2"><img src="${domainUrl}/assets/images/index/collect1.png">收藏</a>
                <div class="clear"></div>
                </div>
                <div class="money">
                    <h3>orthomol</h3>
                    <h4><span><s>200元</s></span>180元</h4>
                </div>
                <div class="blo">SALE</div>
                <!--遮罩层-->
                <div class="popup">
                    <a href="##">查看详情</a>
                </div>
            </div>
            <div class="one">
                <div class="tu mouseover3"   >
                    <img src="${domainUrl}/assets/images/index/sleep1.png" >
                </div>
                <div class="join">
                    <a href="##"  class="pull-left mouseover1"><img src="${domainUrl}/assets/images/index/shoppcart2.png" >加入购物车</a>
                    <a href="##"  class="pull-right mouseover2"><img src="${domainUrl}/assets/images/index/collect1.png">收藏</a>
                    <div class="clear"></div>
                </div>
                <div class="money">
                    <h3>orthomol</h3>
                    <h4><span><s>200元</s></span>180元</h4>
                </div>
                <div class="blo">SALE</div>
                <!--遮罩层-->
                <div class="popup">
                    <a href="##">查看详情</a>
                </div>
            </div>
            <div class="one">
                <div class="tu mouseover3"   >
                    <img src="${domainUrl}/assets/images/index/sleep1.png" >
                </div>
                <div class="join">
                    <a href="##"  class="pull-left mouseover1"><img src="${domainUrl}/assets/images/index/shoppcart2.png" >加入购物车</a>
                    <a href="##"  class="pull-right mouseover2"><img src="${domainUrl}/assets/images/index/collect1.png">收藏</a>
                    <div class="clear"></div>
                </div>
                <div class="money">
                    <h3>orthomol</h3>
                    <h4><span><s>200元</s></span>180元</h4>
                </div>
                <div class="blo">SALE</div>
                <!--遮罩层-->
                <div class="popup">
                    <a href="##">查看详情</a>
                </div>
            </div>
            <div class="one">
                <div class="tu mouseover3"   >
                    <img src="${domainUrl}/assets/images/index/sleep1.png" >
                </div>
                <div class="join">
                    <a href="##"  class="pull-left mouseover1"><img src="${domainUrl}/assets/images/index/shoppcart2.png" >加入购物车</a>
                    <a href="##"  class="pull-right mouseover2"><img src="${domainUrl}/assets/images/index/collect1.png">收藏</a>
                    <div class="clear"></div>
                </div>
                <div class="money">
                    <h3>orthomol</h3>
                    <h4><span><s>200元</s></span>180元</h4>
                </div>
                <div class="blo">SALE</div>
                <!--遮罩层-->
                <div class="popup">
                    <a href="##">查看详情</a>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</div>
<!--空-->
<div class="kong"></div>

<!--底部导航-->
<#include "/WEB-INF/views/index/footer.ftl"/>

<div id="top">Top</div>

<!--top-->
<script>
    $("#top").click(function(){
        $("html,body").animate({scrollTop:"0px"},500)
    });
</script>

</body>
</html>

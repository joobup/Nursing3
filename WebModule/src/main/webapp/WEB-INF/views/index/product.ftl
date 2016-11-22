<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/index/product.css">
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
    <script src="${domainUrl}/assets/js/index/product.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>
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
    var domainUrl = '${domainUrl}'+"/assets";
    var domainUrl1 = '${domainUrl}'+"/rest";
</script>

<#include "/common/head.ftl"/>
<div class="container con">
    <div class="row pa">
        <div class="col-lg-5 col-md-4 col-sm-12  tu_l">
             <img src="${domainUrl}/assets/images/index/fuwu/1.jpg"  class="img-responsive" >
        </div>
        <div class="col-lg-6 col-md-6  col-sm-12  tu_r">
            <h2 id="serveName"></h2>
            <h3 id="serveBrief"></h3>
            <div class="bg">
                <div class="row">
                    <h3 class="col-lg-2 col-md-2 col-sm-2 col-xs-3 ">价格：</h3><span class=" col-lg-9 col-md-9 col-sm-9 col-xs-8 big">20元/小时</span>
                    <div class="clearfix"></div>
                </div>
                <div class="row">
                    <h3 class="col-lg-2 col-md-2 col-sm-2 col-xs-3 ">服务特色：</h3><span  class="col-lg-9 col-md-9 col-sm-9 col-xs-8" id="serveBrief2">专业工具，高效洁净</span>
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
                    <!--加入购物车-->
                    <div class="col-lg-10 ncb">
                        <div id="lanren">
                            <img src="${domainUrl}/assets/images/index/fuwu/1.jpg"  style="position: absolute;top:10px;left:45px;z-index:-1 width:30px;height:30px;border-radius: 50%;">
                            <a href="javascript:;" class="col-lg-4 col-md-4 col-sm-4 btn-buy cart">加入购物车</a>
                            <div class="col-lg-3 col-md-3 col-sm-3 buy">立即购买</div>
                        </div>
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

<#include "/WEB-INF/views/index/footer.ftl"/>

<!--top-->
<div class="glyphicon glyphicon-eject" id="top"> </div>

<!--购物车位置-->
<div class="head-shopcart"><a href="##">进入购物车</a></div>

<script>
    $('.btn-buy').bind('click',function(){
        var img = $(this).parent().find('img');
        var flyElm = img.clone().css('opacity', 0.75);
        $('body').append(flyElm);
        flyElm.css({
            'z-index': 20,
            'display': 'block',
            'position': 'absolute',
            'top': img.offset().top +'px',
            'left': img.offset().left +'px',
            'width': img.width() +'px',
            'height': img.height() +'px'
        });
        flyElm.animate({
            top: $('.head-shopcart').offset().top,
            left: $('.head-shopcart').offset().left,
            width: 20,
            height: 20
        }, 'slow', function() {
            flyElm.remove();
        });
    });

    <!--top-->
    $("#top").click(function(){
        $("html,body").animate({scrollTop:"0px"},500)
    });

</script>

</body>
</html>